package treningsdagbok;
/*
 * Opprettet 22.09, Henrik 
 * Denne klassen styrer rootlayouten (der alle andre scener blir lagt oppå)
 * Kontrollerer menyen
 */



import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import treningsdagbok.Main;

public class RootLayoutController {
	
	// Refererer til Main
	private Main main;
	
	/**
	 *  Blir kalt av main
	 * @param main Main-instansen som instansierer denne og som inneholder metodene for å bytte til de andre viewene.
	 */ 
	public void setMain(Main main){
		this.main = main;
	}
	
	//Lukker appen
	@FXML
    private void handleExit() {
        System.exit(0);
    }
	
}