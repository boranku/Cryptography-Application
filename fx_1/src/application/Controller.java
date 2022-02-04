package application;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	public void switchToDecrypt(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/decrypt.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToEncrypt(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/encrypt.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}
