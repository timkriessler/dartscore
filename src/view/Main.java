package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	/** Laden und anzeigen des Startfensters **/
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Parent root = FXMLLoader.load(getClass().getResource("Startfenster.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Dartscore");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
