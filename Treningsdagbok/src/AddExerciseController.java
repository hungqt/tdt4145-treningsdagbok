import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddExerciseController {
	
	@FXML
	private ComboBox<String> cmbExercises;
	
	@FXML
	private TextField comment;
	
	@FXML
	private Button btnDone;
	
	@FXML
	private TextField personligForm;
	
	public void FillComboBox(){
		List<String> exercises = new ArrayList<String>(); // Need method for adding exercises
		cmbExercises.getItems().clear();
		for(String exercise: exercises){
			cmbExercises.getItems().add(exercise);
		}
	}
	
	
}