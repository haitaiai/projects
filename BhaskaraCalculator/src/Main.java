import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage primaryStage) throws Exception{
		
		Pane root = FXMLLoader.load(getClass().getResource("Layout.fxml"));
		
		Scene scene = new Scene(root, 250, 250);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Bhaskara Calculator");
		primaryStage.setMinHeight(250);
		primaryStage.setMinWidth(250);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

}
