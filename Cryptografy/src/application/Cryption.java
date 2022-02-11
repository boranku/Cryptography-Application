package application;

public class Cryption {
	private String inputText, convertedText, key, status;
	private char method;
	
	public Cryption(String inputText, String key, String status, char method) {
		this.inputText = inputText;
		this.key = key;
		this.status = status;
		this.method = method;
		convertedText = convert();
		
	}
	
	public String convert() {
		String returnText = "";
		if(status.equalsIgnoreCase("decrypt")) {
			if(method == 'c') returnText = decryptWithCeasar();
			else if (method=='v') returnText = decryptWithVigenere();
			else returnText = null;
		}
		else if(status.equalsIgnoreCase("encrypt")) {
			if(method =='c') returnText = encryptWithCeasar();
			else if (method=='v') returnText = encryptWithVigenere();
			else returnText = null;
		}
		return returnText;
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
}

