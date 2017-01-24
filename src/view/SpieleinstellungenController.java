package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SpieleinstellungenController {
	@FXML
	private Label lbl_anzahlSpieler;
	@FXML
	private ChoiceBox chobx_anzahlSpieler;
	@FXML
	private Slider sld_anzahlSpieler;
	@FXML
	private Label lbl_Spieler1;
	@FXML
	private Label lbl_Spieler2;
	@FXML
	private Label lbl_Spieler3;
	@FXML
	private Label lbl_Spieler4;
	@FXML
	private Button btn_auswaehlen;
	@FXML
	private Button btn_zurueck;

	@FXML
	private void btn_zurueck_clicked(ActionEvent event) throws Exception {
	}

}
