
import java.util.List;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class deleteExerciseController {
	@FXML
	private ComboBox<String> cmbDelete;
	
	@FXML
	private Button btnDelete;
	
	DBConnector db = new DBConnector();
	
	public void FillComboBox(){
		List<String> exercises = db.getExerciseList(); // Need method for adding exercises
		cmbDelete.getItems().clear();
		cmbDelete.setValue(exercises.get(0));
		for(String exercise: exercises){
			cmbDelete.getItems().add(exercise);
		}
		
	}
	@FXML
	public void deleteObject(){
		String value = (String)cmbDelete.getValue();
		if(!db.exerciseInSession(value)){
			db.deleteExercise(value);
		}
		else{
			throw new IllegalArgumentException("Denne øvelsen finnes i flere treningsøkter og kan ikke fjernes");
		}
	}
}
