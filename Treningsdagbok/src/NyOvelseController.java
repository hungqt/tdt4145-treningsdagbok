

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NyOvelseController {
	
	@FXML
	private TextField txtNavn;
	
	@FXML
	private TextArea txtBeskrivelse;
	
	@FXML
	private Button btnLagre;
	
	@FXML
	private Button btnTilbake;
	
	@FXML
	private ComboBox<String> cat;
	
	@FXML
	private Label feil;
	
	public DBConnector DB = new DBConnector();
	
	
	
	// Refererer til Main
	private Main main;
	/**
	 * @param main Main-instansen som instansierer denne og som inneholder metodene for å bytte til de andre viewene.
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	public void init(){
		FillComboBox();
	}
	
	@FXML
	public void handleTilbake() {
		main.showVelkommen();
	}
	
	@FXML
	public void handleLagre() {
		if (DB.setExercise(handleNavn(), handleBeskrivelse(), handleCombo())) {
			System.out.println("feil");
			feil.setVisible(true);
		}
		else {
			main.showVelkommen();
		}
		
	}
	
	@FXML
	public String handleNavn() {
		return txtNavn.getText();
	}
	
	@FXML
	public String handleBeskrivelse() {
		return txtBeskrivelse.getText();
	}
	
	@FXML
	public String handleCombo() {
		
		return cat.getValue();
	}
	
	public void FillComboBox(){
		System.out.println("hey");
		List<String> category = DB.getCategory(); // Need method for adding exercises
		cat.getItems().clear();
		cat.setValue("Kategori");
		for(String category1: category){
			cat.getItems().add(category1);
		}
	}
}
