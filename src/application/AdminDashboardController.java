package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Businesslayer.SMS;
import Businesslayer.Student;
import DBLayer.DBHandler;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;

public class AdminDashboardController implements Initializable{

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
	private Button changestd;

    @FXML
    private TextField password1;

    @FXML
    private TextField password41;

    @FXML
    private Label found;

    @FXML
    private Label info;
    
    @FXML
    private Button searchstd;
    
    private static int stdid=0;
    
    private static String rollno="";
    
    @FXML
    private Button searchs;

    @FXML
    private Button sets;
    
    private static String soname;
    

    @FXML
    private TextField password;


    @FXML
    private TextField password4;
    
    private static int soid;
    

    @FXML
    private Pane panel1;
    
    @FXML
    private Button searchbtn;
    
    @FXML
    private Button abtn;

    @FXML
    private Label aname;
    
    @FXML
    private Label pname;

    @FXML
    private Button rbtn;
    
    @FXML
    private Label sname;

    @FXML
    void acceptbudg(ActionEvent event) {
    	DBHandler db=new DBHandler();
    	db.deletebdgreq();
    	panel1.setVisible(false);
    }

    @FXML
    void rejectbudg(ActionEvent event) {
    	DBHandler db=new DBHandler();
    	db.deletebdgreq();
    	panel1.setVisible(false);
    }

    @FXML
    void searchproposal(ActionEvent event) {
    	panel1.setVisible(true);
    	DBHandler db=new DBHandler();
    	sname.setText(db.searchbudgname());
    	pname.setText(db.searchbudgpurpose());
    	aname.setText(Double.toString(db.searchbudgamount()));
    }

    @FXML
    void searchsociety(ActionEvent event) {
    	soname=password4.getText();
    	SMS sms=new SMS();
    	soid=sms.entersocietyname(soname);
    	if(soid!=0) {
    		System.out.println(soid);
    	}
    	else {
    		password4.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
    	}
    }

    @FXML
    void setsociety(ActionEvent event) {
    	String name=password1.getText();
    	String domain=password.getText();
    	SMS sms=new SMS();
    	sms.entersocietydetails(soid, name, domain);
    }
    
    @FXML
    void searchstud(ActionEvent event) {
    	rollno=password1.getText();
    	Student std= new Student();
    	stdid=std.searchstudent(rollno);
    	if(stdid!=0) {
    		System.out.println(stdid);
    		//found.setText("A student was found");
    	}
    	else {
    		password1.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
    	}
    }
    
    @FXML
    void updatestud(ActionEvent event) {
    	String name=password41.getText();
    	SMS sms=new SMS();
    	sms.sendinfochanges(name, stdid,rollno);
    	//info.setText("User was updated");
    }
    
	 public void switchToAdminLoginScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToManageSocietiesScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("ManageSocieties.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToAdminDashboard(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToManageUserScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("ManageUsers.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToProposal(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  
		 root = FXMLLoader.load(getClass().getResource("Proposals.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
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
