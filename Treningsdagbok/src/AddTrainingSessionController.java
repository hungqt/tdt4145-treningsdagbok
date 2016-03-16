import javafx.fxml.FXML;
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
	
	public void setMain(Main main){
		this.main = main;
	}
	
	@FXML
	public TrainingSession getTrainingSessionInfo(){
		String dateString = dato.toString();
		String startTime = tid.toString();
		String duration = varighet.toString();
		String shape = personligForm.toString();
		trainingSession = new TrainingSession(dateString, startTime, duration, shape);
		
		return trainingSession;
	}
}
