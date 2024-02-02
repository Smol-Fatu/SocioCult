package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Businesslayer.*;
import DBLayer.DBHandler;

public class SampleController implements Initializable{

	 private Stage stage, stage1;
	 private Scene scene, scene1;
	 private Parent root, root1;
//	 
//	 public void switchToScene1(ActionEvent event) throws IOException {
//	  root = FXMLLoader.load(getClass().getResource("login.fxml"));
//	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//	  scene = new Scene(root);
//	  stage.setScene(scene);
//	  stage.show();
//	 }
	 @FXML
	    private Label label;
	 

	    @FXML
	    private Button signupbutton;
	 
	 @FXML
	    void signupstud(ActionEvent event) {
		 DBHandler db=new DBHandler();
		 db.saveStudent(RollNumber.getText(),Password.getText());
		 	signupbutton.setDisable(true);
	    }
	 
	 public void switchToStudentLoginScreen(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("login.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
	 }
	 public void switchToStudentDashboard(ActionEvent event) throws IOException {
		 Student s=new Student();
		 if( s.searchstudent(username.getText(), password.getText())==1) {
			  System.out.println(username.getText());
			  root1 = FXMLLoader.load(getClass().getResource("menuSample.fxml"));
			  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene1 = new Scene(root1);
			  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			  stage1.setScene(scene1);
			  stage1.show();
		 }
		 else {
			 if(username.getText()=="") {
				 username.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 }
			 if(password.getText()=="") {
				 password.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 }
			 errorlabel.setText("Invalid input");
	 }
	 }
	 
	 public void switchToFirstScreen(ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("firstScreen.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }

	 public void switchToStudentSignupScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("SignUpScreen.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }

	 public void switchToPresidentSignupScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("PresidentLoginIn.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToPresidentDashboard(ActionEvent event) throws IOException {
		 SocietyPresident p=new SocietyPresident();
		 if( p.searchpres(username.getText(), password.getText())==1) {
			  root1 = FXMLLoader.load(getClass().getResource("PresidentDashBoard.fxml"));
			  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene1 = new Scene(root1);
			  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			  stage1.setScene(scene1);
			  stage1.show();
		 }else {
			 if(username.getText()=="") {
				 username.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 }
			 if(password.getText()=="") {
				 password.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 }
			 errorlabel.setText("Invalid input");
	 }
	 }

	 public void switchToAdminSignupScreen(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 
	 public void switchToAdminDashboard(ActionEvent event) throws IOException {
		 Admin p=new Admin();
		 if( p.searchadmin(username.getText(), password.getText())==1) {
			  root1 = FXMLLoader.load(getClass().getResource("AdminDashBoard.fxml"));
			  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene1 = new Scene(root1);
			  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			  stage1.setScene(scene1);
			  stage1.show();
		 }else {
			 if(username.getText()=="") {
				 username.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 }
			 if(password.getText()=="") {
				 password.setStyle(String.format("-fx-border-color: RED;-fx-border-radius:5px"));
			 }
			 //errorlabel.setText("Invalid input");
		 }
	 }
	 

	    @FXML
	    private TextField RollNumber;
	    @FXML
	    private TextField Password;

	    @FXML
	    private TextField Username;
	    
    @FXML
    private Hyperlink forgotpasslink;

    @FXML
    private Label noacct;

    @FXML
    private PasswordField password;

    @FXML
    private Label signinlabel;

    @FXML
    private Hyperlink signuplink;

    @FXML
    private Button siigninbutton;

    @FXML
    private TextField username;
    
    @FXML
    private Button dashboard;
    
    @FXML
    private Label errorlabel;
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}


}
