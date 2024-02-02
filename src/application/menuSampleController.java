package application;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.TranslateTransition;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
//import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
//import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import javafx.stage.Window;
import javafx.util.Duration;
import javafx.scene.image.ImageView;

public class menuSampleController implements Initializable {

	 private Stage stage;
	 private Scene scene;
	 private Parent root;

	 private Stage stage1;
	 private Scene scene1;
	 private Parent root1;

      
	 public void switchToStudentLoginScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("login.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }

	 
	 public void switchToRegistrationScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("registrationScreen.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	 public void switchToDashboard(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("menuSample.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 public void switchToSocietiesScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("societiesScreen.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 public void loadcalender(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("EventCalendar.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();

	 }
	 public void switchToEventCalendarScreen(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		  loadcalender(event);
		  loaddates();
		 }
	 public void loaddates() {
		 LocalDate dt = LocalDate.now();
		 
		  String str=Integer.toString(dt.getDayOfMonth());
		  @SuppressWarnings("unused")
		StringProperty st= new SimpleStringProperty(str);
		  for(int i=0; i<30; i++) {
			  //d1.setText(str);
		  }
		  //System.out.println(d2.getText());
	      //d1.setText(str);
		  //d1=new Label();
		  //d1.setTooltip(tt1);
		  //tt1.setText("Heyyy");
	 }
	 public void switchToMemberRegistrationScreen(ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("MemberRegistration.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 public void switchToNewSocietyRegistrationScreen(ActionEvent event) throws IOException {
		  root1 = FXMLLoader.load(getClass().getResource("NewSocietyRegistration.fxml"));
		  stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene1 = new Scene(root1);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage1.setScene(scene1);
		  stage1.show();
		 }
	 
	 @FXML
	    void showfirst(ActionEvent event) {
		 String Errors = "Payment Successful";
 		 Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
         alerta.setTitle("Payment Status");
         alerta.setContentText(Errors);
         alerta.show();    
	    }
	 
		@FXML
		private ImageView Exit;
		@FXML
		private Label Menu;
		@FXML
		private Label menuBack;
	    @FXML
	    private JFXButton Registration;
		@FXML
		private AnchorPane Slider;

	    @FXML
	    private JFXButton LogOutBtn;
	    
	  	 
	  	
	      @FXML
	      private Hyperlink forgotpasslink;

	      @FXML
	      private Label noacct;

	      @FXML
	      private TextField password;

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
		    private Tooltip tt1;

			@FXML
			private Label label;
			

		    @FXML
		    private JFXButton button1;
			
	   @FXML
	   private Label d1;

	   @FXML
	   private Label d10;

	   @FXML
	   private Label d11;

	   @FXML
	   private Label d12;

	   @FXML
	   private Label d13;

	   @FXML
	   private Label d14;

	   @FXML
	   private Label d15;

	   @FXML
	   private Label d16;

	   @FXML
	   private Label d17;

	   @FXML
	   private Label d18;

	   @FXML
	   private Label d19;

	   @FXML
	   private Label d2;

	   @FXML
	   private Label d20;

	   @FXML
	   private Label d21;

	   @FXML
	   private Label d22;

	   @FXML
	   private Label d23;

	   @FXML
	   private Label d24;

	   @FXML
	   private Label d25;

	   @FXML
	   private Label d26;

	   @FXML
	   private Label d27;

	   @FXML
	   private Label d28;

	   @FXML
	   private Label d29;

	   @FXML
	   private Label d3;

	   @FXML
	   private Label d30;

	   @FXML
	   private Label d4;

	   @FXML
	   private Label d5;

	   @FXML
	   private Label d6;

	   @FXML
	   private Label d7;

	   @FXML
	   private Label d8;

	   @FXML
	   private Label d9;
	      
	 
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
	@FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Exit != null : "fx:id=\"Exit\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert LogOutBtn != null : "fx:id=\"LogOutBtn\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert Menu != null : "fx:id=\"Menu\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert Slider != null : "fx:id=\"Slider\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d1 != null : "fx:id=\"d1\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d10 != null : "fx:id=\"d10\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d11 != null : "fx:id=\"d11\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d12 != null : "fx:id=\"d12\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d13 != null : "fx:id=\"d13\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d14 != null : "fx:id=\"d14\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d15 != null : "fx:id=\"d15\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d16 != null : "fx:id=\"d16\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d17 != null : "fx:id=\"d17\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d18 != null : "fx:id=\"d18\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d19 != null : "fx:id=\"d19\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d2 != null : "fx:id=\"d2\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d20 != null : "fx:id=\"d20\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d21 != null : "fx:id=\"d21\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d22 != null : "fx:id=\"d22\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d23 != null : "fx:id=\"d23\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d24 != null : "fx:id=\"d24\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d25 != null : "fx:id=\"d25\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d26 != null : "fx:id=\"d26\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d27 != null : "fx:id=\"d27\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d28 != null : "fx:id=\"d28\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d29 != null : "fx:id=\"d29\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d3 != null : "fx:id=\"d3\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d30 != null : "fx:id=\"d30\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d4 != null : "fx:id=\"d4\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d5 != null : "fx:id=\"d5\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d6 != null : "fx:id=\"d6\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d7 != null : "fx:id=\"d7\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d8 != null : "fx:id=\"d8\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert d9 != null : "fx:id=\"d9\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        assert menuBack != null : "fx:id=\"menuBack\" was not injected: check your FXML file 'EventCalendar.fxml'.";
        label.setText("Talent hunt");
    }

}
