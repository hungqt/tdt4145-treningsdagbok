import java.util.Date;

public class TrainingSession {
	
	private String date;
	private String startTime;
	private String duration;
	private String shape;
	
	public TrainingSession(String date, String startTime, String duration, String shape){
		this.date = date;
		this.startTime = startTime;
		this.duration = duration;
		this.shape = shape;
	}
	
	public String getDate(){
		return date;
	}
	
	public String getStartTime(){
		return startTime;
	}
	
	public String getDuration(){
		return duration;
	}
	
	public String getShape(){
		return shape;
	}
	
}