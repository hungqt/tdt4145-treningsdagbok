import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
 
 public class AddTrainingSessionController {
	
 	private Main main;
 	private TrainingSession trainingSession;
 	
 	@FXML
 	DatePicker dato;
 	
 	@FXML
 	TextField tid;
 	
 	@FXML
 	TextField varighet;
 	
 	@FXML
 	TextField personligForm;
 	
 	@FXML
 	Button btnLegOv;
 	
 	@FXML
 	Button btnCancel;
 	
 	public void setMain(Main main){
 		this.main = main;
 	}
 	
 	@FXML
 	public TrainingSession getTrainingSessionInfo(TrainingSession session){
 		String dateString = dato.getValue().toString();
 		String startTime = tid.getText().toString();
 		String duration = varighet.getText().toString();
 		String shape = personligForm.getText().toString();
 		session = new TrainingSession(dateString, startTime, duration, shape);
 		
 		return session;
 	}
 	@FXML
 	public void cancel(){
 		main.showVelkommen();
 	}
 	
 	@FXML
 	public void showAddExercises(){
 		System.out.println("test");
 		trainingSession = getTrainingSessionInfo(trainingSession);
 		main.showAddExerciseToSession(trainingSession);
 	}
 }