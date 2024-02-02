package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Businesslayer.*;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class NewSocietyRegistrationController implements Initializable {

	 private Stage stage;
	 private Scene scene;
	 private Parent root;

	 private Stage stage1;
	 private Scene scene1;
	 private Parent root1;
	 
	List<String> lstFile;
	@FXML
	private ImageView Exit;
	@FXML
	private Label Menu;
	@FXML
	private Label labSingleFile;
	@FXML
	private Label menuBack;
	@FXML
	private AnchorPane Slider;
	@FXML
	private JFXButton LogOutBtn;
	@FXML
	private JFXButton DownloadingPDF;

    @FXML
    private JFXButton applybutton;
    
    @FXML
    private ListView listview;
    

    @FXML
    private TextField password;

    @FXML
    private TextField password1;

    @FXML
    private TextField password2;

    @FXML
    private TextField password3;

    @FXML
    private TextField password4;

    @FXML
    private TextField rollnoinp;
    
    @FXML
    private JFXButton submitbutton;
    
    private int fileexists=0;

    @FXML
    public ComboBox<String> positions;

    @FXML
    private ComboBox<String> societies;
	
    private static int mem=0;
	
    ObservableList<String> options = 
		    FXCollections.observableArrayList(
		        "Head",
		        "ViceHead",
		        "Member"
		    );
	ObservableList<String> options2 = 
		    FXCollections.observableArrayList(
		        "FTS",
		        "FAS",
		        "IEEE",
		        "FCCS"
		    );
    
	public void Download(ActionEvent event) throws IOException {
	    File pdfFile = new File("C:\\Users\\TECH VILLA LAPTOPS\\Downloads\\Project_Final\\Project\\src\\application\\Student Societies Registration Form 2022.pdf");
	    if (pdfFile.exists())
	    {
	     if (Desktop.isDesktopSupported())
	     {
	      try
	      {
	       Desktop.getDesktop().open(pdfFile);
	      }
	      catch (IOException e)
	      {
	      
	       e.printStackTrace();
	      }
	     }
	     else
	      {
	       System.out.println("Awt Desktop is not supported!");
	      }
	    }
	    
	    else
	    {
	     System.out.println("File is not exists!");
	    }
	  
		 }

	public void Filechooser(ActionEvent event) {
    	FileChooser fc = new FileChooser();
    	File f = fc.showOpenDialog(null);
    	if(f != null) {
    		fileexists=1;
    	}
    }


	 public void switchToStudentLoginScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("login.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }

	 
	 public void switchToRegistrationScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("registrationScreen.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 public void switchToDashboard(ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("menuSample.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 public void switchToSocietiesScreen(ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("societiesScreen.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 public void switchToEventCalendarScreen(ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("EventCalendar.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 public void switchToMemberRegistrationScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		 mem=1;
		 
		 societies.getItems().addAll("FTS","FAS","IEEE","FCCS");
		  root1 = FXMLLoader.load(getClass().getResource("MemberRegistration.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		  
		 }
	 public void switchToNewSocietyRegistrationScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		 societies.getItems().addAll("FTS","FAS","IEEE","FCCS");
		  root1 = FXMLLoader.load(getClass().getResource("MemberRegistration.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show(); 
		 root1 = FXMLLoader.load(getClass().getResource("NewSocietyRegistration.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 @FXML
	  public void sendproposal(ActionEvent event) {
		 int status=1;
		 if(password.getText()=="") {
			 password.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 status=0;
		 }
		 if(password1.getText()=="") {
			 password1.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 status=0;
		 }
		 if(password2.getText()=="") {
			 password2.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 status=0;
		 }
		 if(password3.getText()=="") {
			 password3.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 status=0;
		 }
		 if(password4.getText()=="") {
			 password4.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 status=0;
		 }
		 if(status==1) {
			 if(fileexists==1) {
				 	submitbutton.setDisable(true);
				 	SMS sms=new SMS();
				 	String name=password4.getText();
				 	String domain=password.getText();
				 	String presname=password1.getText();
				 	String rollno=password2.getText();
				 	String pass=password3.getText();
				 	sms.registersociety(name,domain,presname,rollno,pass);
			 }
		 }
	    }
	  @FXML
	    void applytosociety(ActionEvent event) {
		  String position=positions.getValue();
		  String society=societies.getValue();
		  String rollno=rollnoinp.getText();
		  if(position!=null&&society!=null&&rollno!=null) {
			  	applybutton.setDisable(true);
		  		SMS sms=new SMS();
		  		sms.applytosociety(society,position,rollno);
		  		
		  }
		  else {
			  if(position==null) {
				  positions.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:30px"));
			  }
			  if(society==null) {
				  societies.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:30px"));
			  }
			  if(rollno==null) {
				  rollnoinp.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:30px"));
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
	
		 assert Exit != null : "fx:id=\"Exit\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert LogOutBtn != null : "fx:id=\"LogOutBtn\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert Menu != null : "fx:id=\"Menu\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert Slider != null : "fx:id=\"Slider\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert applybutton != null : "fx:id=\"applybutton\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert menuBack != null : "fx:id=\"menuBack\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert positions != null : "fx:id=\"positions\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert rollnoinp != null : "fx:id=\"rollnoinp\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        assert societies != null : "fx:id=\"societies\" was not injected: check your FXML file 'MemberRegistration.fxml'.";
	        
	        if(societies!=null)
	        	societies.setItems(options2);
			if(positions!=null)
				positions.setItems(options);
		
		
			 }

}
