import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddExerciseController {
	
	private TrainingSession trainingSession;
	// Refererer til Main
	private Main main;
<<<<<<< HEAD
=======
		
	
	public AddExerciseController(TrainingSession trainingSession){
		System.out.println("går inn i konstruktør");
		this.trainingSession = trainingSession;
		System.out.println("constructor ok");
		this.main = main;
		System.out.println("main ok");
	}
>>>>>>> 67a624584ebd3e8442c80eeaddb7b68ffeb33720
	
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
	
	
	public void setMain(Main main){
		this.main = main;
	}
	
	public void init(TrainingSession session){
		trainingSession = session;
		System.out.println("Gets here");
		FillComboBox();
	}
	
	public void FillComboBox(){
		System.out.println("Kjører FillComboBox");
		List<String> exercises = db.getExerciseList(); // Need method for adding exercises
		System.out.println("etter liste-laging");
		System.out.println(exercises);
		cmbExercises.getItems().clear();
		cmbExercises.setValue(exercises.get(0));
		System.out.println("før for-løkke");
		for(String exercise: exercises){
			cmbExercises.getItems().add(exercise);
		}
		System.out.println("etter for-løkke");
	}
	
	
}