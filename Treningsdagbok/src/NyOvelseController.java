

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NyOvelseController {
	
	@FXML
	private TextField txtNavn;
	
	@FXML
	private TextArea txtBeskrivelse;
	
	@FXML
	private Button btnLagre;
	
	@FXML
	private Button btnTilbake;
	
	@FXML
	private ComboBox cat;
	
	// Refererer til Main
	private Main main;
	/**
	 * @param main Main-instansen som instansierer denne og som inneholder metodene for å bytte til de andre viewene.
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	public void handleTilbake() {
		main.showVelkommen();
	}
	
	@FXML
	public void handleLagre() {
		DBConnector dbcon = new DBConnector();
		dbcon.setExercise(handleNavn(), handleBeskrivelse(), handleCombo(dbcon));
	}
	
	@FXML
	public String handleNavn() {
		return "hei";
	}
	
	@FXML
	public String handleBeskrivelse() {
		return "hei";
	}
	
	@FXML
	public String handleCombo(DBConnector dbcon) {
		cat.setItems(dbcon.getCategory());
		return "hei";
	}
	
}
