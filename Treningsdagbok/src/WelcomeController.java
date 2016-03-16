
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WelcomeController {
	
	@FXML
	private Button btnNyOv;
	@FXML
	private Button btnRegTren;
	@FXML
	private Button btnTidligereTren;
	@FXML
	private Button btnSlettOv;
	
	// Refererer til Main
	private Main main;
	/**
	 * @param main Main-instansen som instansierer denne og som inneholder metodene for å bytte til de andre viewene.
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	public void handleNyOvelse() {
		main.showNyOvelse();
	}
	
	@FXML
	public void handleRegistrerTreningsokt() {
		main.showAddTrainingSession();
	}
	
	@FXML
	public void handleTidligereTreningsokter() {
		
	}
	
	@FXML
	public void handleSlettOving() {
		
	}
}
