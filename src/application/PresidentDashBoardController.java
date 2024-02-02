package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;
import Businesslayer.*;
import DBLayer.DBHandler;

public class PresidentDashBoardController implements Initializable{

	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 
	@FXML
	private ImageView Exit;
	@FXML
	private Label Menu;
	@FXML
	private Label menuBack;
	@FXML
	private AnchorPane Slider;
	@FXML
	private JFXButton LogOutBtn;

    @FXML
    private DatePicker dateevent;
    
    @FXML
    private TextField eventname;

    @FXML
    private TextField timevent;

    @FXML
    private TextField venue;
    
    @FXML
    private Label prompt;
    
    @FXML
    private JFXButton submit;

    @FXML
    private JFXButton submitbutton;
    
    @FXML
    private TextField password1;

    @FXML
    private DatePicker password2;

    @FXML
    private TextField password3;

    @FXML
    private TextField password4;
    

    @FXML
    private JFXButton currbudg;
    
    @FXML
    private Label showbudg;

    @FXML
    private TextField sname;

    @FXML
    private TextField password41;

    @FXML
    private TextField password42;

    @FXML
    private JFXButton submitbtn;

    @FXML
    void budgetreq(ActionEvent event) {
    	
    	submitbtn.setDisable(true);
    	SMS sms=new SMS();
    	sms.budgetrequest(Double.parseDouble(password4.getText()),password41.getText(),password42.getText());
    }
    
    @FXML
    void getbudg(ActionEvent event) {
    	if(sname.getText() != "") {
	    	DBHandler db= new DBHandler();
	    	double d=db.searchfinance(sname.getText());
	    	String str=Double.toString(d);
    		showbudg.setText(str);
    		currbudg.setDisable(true);
    	}
    	else {
    		sname.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
    	}
    }

    @FXML
    void submitrecruitments(ActionEvent event) {
    	String sname=password4.getText();
    	String venue=password3.getText();
    	String date=null;
    	if(password2.getValue()!=null) {
    		date = password2.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yy"));
    	}
    	String time=password1.getText();
    	if(sname!=null&&venue!=null&&date!=null&&time!=null) {
    		submitbutton.setDisable(true);
    		SMS sms=new SMS();
    		sms.schedulerecruitmentdrive(date,sname,"Recruitment Drive",time,venue);
    	}
    	else {
    		if(password4.getText()=="") {
				  password4.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			  }
			  if(password3.getText()=="") {
				  password3.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			  }
			  if(date==null) {
				  password2.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			  }
			  if(password1.getText()=="") {
				  password1.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			  }
    	}
    }
    
	 public void switchToPresidentLoginScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("PresidentLoginIn.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToScheduleEventScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("ScheduleEventScreen.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToPresidentDashboard(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("PresidentDashBoard.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToPresidentCalendar(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("PresidentCalendar.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToScheduleRecuitment(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("ScheduleRecruitment.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToAdministerBudget(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("AdministerBudget.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToBudgetApproval(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("BudgetApproval.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 @FXML
	  public void submiteventform(ActionEvent event)throws IOException {
		 	if(eventname.getText()!="") {
		 		System.out.println(eventname.getText());
		 		if(venue.getText()!="") {
			 		System.out.println(venue.getText());
			 		if(timevent.getText()!="") {
				 		System.out.println(timevent.getText());
				 		if(dateevent.getValue() != null) {
					 		System.out.println(dateevent.getValue());
					 		submit.setDisable(true);
					 		//prompt.setText("You can't schedule any more events now! Check back later!");
					 		String date = dateevent.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yy"));
					 		//System.out.println(date);
					 		SMS sms=new SMS();
					 		sms.enterevent(eventname.getText(),venue.getText(),date,timevent.getText());
					 	}
				 	}
		 		}
		 	}
		 		
	    }
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		Exit.setOnMouseClicked(event -> {
			System.exit(0);
		});
		
		
		Slider.setTranslateX(-176);
		
		Menu.setOnMouseClicked(event -> {
			TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(Slider);
			
			slide.setToX(0);
			slide.play();
			
			Slider.setTranslateX(-176);
			
			slide.setOnFinished((ActionEvent e)->{
				Menu.setVisible(false);
				menuBack.setVisible(true);
			});
		});

		menuBack.setOnMouseClicked(event -> {
			TranslateTransition slide = new TranslateTransition();
			slide.setDuration(Duration.seconds(0.4));
			slide.setNode(Slider);
			
			slide.setToX(-176);
			slide.play();
			
			Slider.setTranslateX(0);
			
			slide.setOnFinished((ActionEvent e)->{
				Menu.setVisible(true);
				menuBack.setVisible(false);
			});
		});
	
		
	}
}
