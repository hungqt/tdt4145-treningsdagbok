import java.util.List;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class deleteExerciseController {
	
	DBConnector db = new DBConnector();
	
	@FXML
	private ComboBox<String> cmbDelete;
	
	@FXML
	private Button btnDelete;
	
	public void FillComboBox(){
		List<String> exercises = db.getExerciseList(); // Need method for adding exercises
		cmbDelete.getItems().clear();
		for(String exercise: exercises){
			cmbDelete.getItems().add(exercise);
		}
		
	}
	@FXML
	public void deleteObject(){
		String value = (String)cmbDelete.getValue();
		//Delete using DB method
	}
}
