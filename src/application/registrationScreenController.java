package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class registrationScreenController implements Initializable{

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
	private Button RegisterSocietyButton;
	@FXML
	private Button registerMemberButton;
	

	 public void switchToScene4(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("menuSample.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		  stage.setScene(scene);
		  stage.show();
		 }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
