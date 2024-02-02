package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import DBLayer.*
;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("firstScreen.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("menuSample.fxml"));
			primaryStage.initStyle(StageStyle.UNDECORATED);
			Scene scene = new Scene(root,700,500);
			
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//DBHandler db=new DBHandler();
		//db.savepres();
	}
}
