package treningsdagbok;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
    //Lager hovedvinduet 
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Treningsbuddy");
        
        
        initRootLayout();   
        
        showVelkommen();
        
    }
    
    public void initRootLayout(){
    	try {
    		System.out.println("3");
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            System.out.println(4);
            loader.setLocation(Main.class.getResource("fxml/RootLayout.fxml"));
            System.out.println(5);
            rootLayout = (BorderPane) loader.load();
            
            
            System.out.println("1");

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            System.out.println("2");
            
            //kobler sammen RootLayoutController med Main
            RootLayoutController controller = loader.getController();
            controller.setMain(this);
            
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    }
    
public void showVelkommen(){
	
        try {
            // Load user view.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("fxml/Velkommen.fxml"));
            AnchorPane userView = (AnchorPane) loader.load();

            // Set user view into the center of root layout.
            rootLayout.setCenter(userView);
            
            //Kobler UserViewController med Main
            WelcomeController controller = loader.getController();
            controller.setMain(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void showNyOvelse(){
	
    try {
        // Load user view.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("fxml/NyOvelse.fxml"));
        AnchorPane userView = (AnchorPane) loader.load();

        // Set user view into the center of root layout.
        rootLayout.setCenter(userView);
        
        //Kobler UserViewController med Main
        NyOvelseController controller = loader.getController();
        controller.setMain(this);
        
    } catch (IOException e) {
        e.printStackTrace();
    }
}

	/**
	 * launcher programmet
	 * @param args
	 */
	public static void main(String[] args) {
	    launch(args);
	}

}
