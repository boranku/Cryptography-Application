package application;
import java.awt.TextArea;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	Stage window;
	Scene decrypt,encrypt;
	public void start(Stage stage) {
		window = stage;
		stage.setTitle("Cryptography App");
		stage.show();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/GUI.fxml"));
			Scene scene = new Scene(root);
			Button decryptButton = new Button("Decrypt");
			Button encryptButton = new Button("Encrypt");
			RadioButton VigenereD, VigenereE;
			RadioButton CeasarD, CeasarE;
			TextArea textE, textD;
			TextField keyE, keyD; 
			Label labelE, labelD;
			
//			decryptButton.setOnAction(event -> System.exit(0));
//			encryptButton.setOnAction(event -> System.out.println("saving "));
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
	
	public static void main(String[] args) {
		launch(args);
	}
}