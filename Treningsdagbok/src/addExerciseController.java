import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import koie.Main;
import koie.view.UserViewController;

public class addExerciseController {
	@FXML
	private TextField txtNavn;
	@FXML
	private TextField txtBeskrivelse;
	
	@FXML
	private void addExercise(){
		
		String navn = txtNavn.getText().toString();
		String beskrivelse = txtBeskrivelse.getText().toString();
		
		//addExercise i database objekt
	}
	@FXML
	private void goBack(){
		
	}
}
