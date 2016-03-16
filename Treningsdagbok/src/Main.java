
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private boolean isLogin = false; // True hvis man er logget in som admin false som bruker
    
    //Lager hovedvinduet 
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Trenings buddy");
        
        initRootLayout();  
        
        showVelkommen();
        
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("fxml/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
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