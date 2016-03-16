import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddExerciseController {
	
	private TrainingSession trainingSession;
	
	public AddExerciseController(TrainingSession trainingSession){
		System.out.println("går inn i konstruktør");
		this.trainingSession = trainingSession;
		System.out.println("constructor ok");
	}
	
	// Refererer til Main
		private Main main;
		/**
		 * @param main Main-instansen som instansierer denne og som inneholder metodene for å bytte til de andre viewene.
		 */
		public void setMain(Main main) {
			this.main = main;
		}
	
	DBConnector db = new DBConnector();
	
	@FXML
	private ComboBox<String> cmbExercises;
	
	@FXML
	private TextField comment;
	
	@FXML
	private Button btnAnotherOne;
	
	@FXML
	private Button btnDone;
	
	@FXML
	private TextField personligForm;
	
	public void FillComboBox(){
		List<String> exercises = db.getExerciseList(); // Need method for adding exercises
		cmbExercises.getItems().clear();
		cmbExercises.setValue(exercises.get(0));
		for(String exercise: exercises){
			cmbExercises.getItems().add(exercise);
		}
	}
	
	
}