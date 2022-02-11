package application;

public class Cryption {
	
	private String inputText, convertedText, key, operation, method;
	
	public void convert() {
		String returnText = "";
		if(operation.equalsIgnoreCase("decrypt")) {
			if(method.equals("Ceasar Cipher")) returnText = decryptWithCeasar();
			else if (method.equals("Vigenère Cipher")) returnText = decryptWithVigenere();
			else returnText = null;
		}
		else if(operation.equalsIgnoreCase("encrypt")) {
			if(method.equals("Ceasar Cipher")) returnText = encryptWithCeasar();
			else if (method.equals("Vigenère Cipher")) returnText = encryptWithVigenere();
			else returnText = null;
		}
		convertedText = returnText;
	}

	private String encryptWithVigenere() {
		
		return null;
	}

	private String encryptWithCeasar() {
		
		return null;
	}

	private String decryptWithVigenere() {
		
		return null;
	}

	private String decryptWithCeasar() {
		
		return null;
	}

	public String getInputText() {
		return inputText;
	}
	
	public String getConvertedText() {
		return convertedText;
	}
	
	public void setKey(String key) {
		this.key=key;
	}
	
	public void setInputText(String inputText) {
		this.inputText=inputText;
	}
	
	public void setOperation(String operation) {
		this.operation=operation;
	}
	
	public void setMethod(String method) {
		this.method=method;
	}
}

