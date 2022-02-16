package application;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
	
	Cryption object;
	
	@FXML
	Button encryptButton;
	@FXML
	Button decryptButton;
	@FXML
	RadioButton CeasarE;
	@FXML
	RadioButton VigenereE;
	@FXML
	RadioButton CeasarD;
	@FXML
	RadioButton VigenereD;
	@FXML
	TextField keyE;
	@FXML
	TextField keyD;
	@FXML
	TextArea textE;
	@FXML
	TextArea textD;
	
	public void encryptButtonClicked(){
		if(VigenereE.isSelected()) object = new Cryption(textE.getText(), keyE.getText(), "encrypt", VigenereE.getText());
		else object = new Cryption(textE.getText(), keyE.getText(), "decrypt", CeasarE.getText());
		object.convert();
		textE.appendText(object.getConvertedText());
	}
	
	public void decryptButtonClicked() {
		if(VigenereD.isSelected()) object = new Cryption(textD.getText(), keyD.getText(), "decrypt", VigenereD.getText());
		else object = new Cryption(textD.getText(), keyD.getText(), "decrypt", CeasarD.getText());
		object.convert();
		textD.appendText(object.getConvertedText());
	}
	
	
	
	
	

}