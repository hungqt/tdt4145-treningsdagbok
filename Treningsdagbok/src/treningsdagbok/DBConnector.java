package treningsdagbok;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {
	//JDBC name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://mysql.stud.ntnu.no/thomborr_trening";
	
	//Database credentials
	static final String USER = "thomborr_login";
	static final String PASS = "12345";
	
	public List<String> getExerciseList(){
		List<String> exerciseList = new ArrayList<String>();
		
		try {
			//STEP 2: Register JDBC driver
		    try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    //Make a database connection
			System.out.println("Connectiing to database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected, bitch");
			
			//Create a statement
			System.out.println("Creating a statement");
			Statement stmt = conn.createStatement();
			System.out.println("Statement created");
			
			//Writing the SQL query
			System.out.println("SQL stuff");
			String sql = "SELECT * FROM EXCERCISE";
			System.out.println("SQL stuff sucessfull");
			
			//Execute the SQL query
			System.out.println("Before result set");
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ResultSet sucessfull");
			
			//Loop through column to find whatever
			while(rs.next()){
				String exerciseName = rs.getString("NAME");
				exerciseList.add(exerciseName);	
			}
			
			//Clean-up environment
		    rs.close();
		    stmt.close();
		    conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exerciseList;
		
	}
	
	public void setExercise(String name, String description, String category){
		try{
			Class.forName("com.mysql.jdbc.Driver");			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			System.out.println("Connectiing to database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected, bitch");
			
			System.out.println("Creating a statement");
			PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into EXCERCISE(NAME, DESCRIPTION, CATEGORY) values(?,?,?)");
			System.out.println("Statement created");
			
			stmt.setString(1, name);
			stmt.setString(2, description);
			stmt.setString(3, category);
			stmt.executeUpdate();
			System.out.println("OK");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void setTrainingSession(String date, String startTime, String duration, String shape, String performance, String name){
		try{
			Class.forName("com.mysql.jdbc.Driver");			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			System.out.println("Connectiing to database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected, bitch");
			
			System.out.println("Creating a statement");
			PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into TRAININGSESSION(DATE, TIME, DURATION, NOTE, FORM, PERFORMANCE, NAME) values(?,?,?,?,?,?,?)");
			System.out.println("Statement created");
			
			stmt.setString(1, date);
			stmt.setString(2, startTime);
			stmt.setString(3, duration);
			stmt.executeUpdate();
			System.out.println("OK");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setExecutedExercise(String name, String date, String startTime, String results){
		try{
			Class.forName("com.mysql.jdbc.Driver");			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			System.out.println("Connectiing to database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected, bitch");
			
			System.out.println("Creating a statement");
			PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into EXECUTEDEXERCISE(NAME, DATE, TIME, RESULT) values(?,?,?,?)");
			System.out.println("Statement created");
			
			stmt.setString(1, name);
			stmt.setString(2, date);
			stmt.setString(3, startTime);
			stmt.setString(4, results);
			stmt.executeUpdate();	
			System.out.println("OK");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void deleteExercise(String name){
		
		try {
			//STEP 2: Register JDBC driver
		    try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    //Make a database connection
			System.out.println("Connectiing to database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected, bitch");
			
			//Create a statement
			System.out.println("Creating a statement");
			Statement stmt = conn.createStatement();
			System.out.println("Statement created");
			
			//Writing the SQL query
			System.out.println("SQL stuff");
			String sql = "delete from EXCERCISE where EXCERCISE.NAME = '"+name+"'";
			System.out.println("SQL stuff sucessfull");
			
			//Execute the SQL query
			System.out.println("Before result set");
			stmt.executeUpdate(sql);
			System.out.println("ResultSet sucessfull");
			
			
			//Clean-up environment
		    stmt.close();
		    conn.close();
		    System.out.println("asd");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DBConnector test = new DBConnector();
//		test.deleteExercise("asd");
//		System.out.println(test.getExerciseList());
		//test.setExercise("Biceps curl", "curls for the gurls", "Styrketrening");
	
	}
	
}
