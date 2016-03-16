package treningsdagbok;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
		
	}
	
	@FXML
	public void handleLagre() {
		
	}
	
	@FXML
	public void handleNavn() {
		
	}
	
	@FXML
	public void handleBeskrivelse() {
		
	}
	
}
