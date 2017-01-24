package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartfensterController {
	@FXML
	private Button btn_neuesSpiel;
	@FXML
	private Button btn_rangliste;

	@FXML
	private void btn_neuesSpiel_clicked(ActionEvent event) throws Exception {

		btn_neuesSpiel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Parent root;
				try {
					root = FXMLLoader.load(
							getClass().getClassLoader().getResource("/dartscore/src/view/Spieleinstellungen.fxml"),
							null);
					Stage stage = new Stage();
					stage.setTitle("My New Stage Title");
					stage.setScene(new Scene(root, 450, 450));
					stage.show();
					// Hide this current window (if this is what you want)
					((Node) (event.getSource())).getScene().getWindow().hide();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

}
