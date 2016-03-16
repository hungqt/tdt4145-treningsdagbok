package treningsdagbok;


import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddTrainingSessionController {
	Main main;
	DBConnector dbc = new DBConnector();
	
	@FXML
	Date date;	
	@FXML
	TextField startTime;
	@FXML
	TextField duration;
	@FXML
	TextField shape;
	@FXML
	TextField performance;
	
	String dateString;
	String startTimeString;
	String durationString;
	String shapeString;
	String performanceString;
	
	public void setMain(Main main) {
		try{
			this.main = main;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getTrainingSessionInfo(){
		
		dateString = date.toString();
		startTimeString = startTime.toString();
		durationString = duration.toString();
		shapeString = shape.toString();
		performanceString = performance.toString();
	}
	
	public void getExercise(){
		
	}
	
}
