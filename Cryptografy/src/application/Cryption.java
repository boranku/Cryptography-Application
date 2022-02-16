package application;

public class Cryption {
	
	private String inputText, convertedText, key, operation, method;
	
	public Cryption(String inputText, String key, String operation, String method) {
		this.inputText = inputText;
		this.key = key;
		this.operation = operation;
		this.method = method;
	}
	
	public void convert() {
		if(operation.equalsIgnoreCase("decrypt") && method.equals("Ceasar Cipher")) convertedText = decryptWithCeasar();
		else if (operation.equalsIgnoreCase("decrypt") && method.equals("Vigenère Cipher")) convertedText = decryptWithVigenere();
		else if(operation.equalsIgnoreCase("encrypt") && method.equals("Ceasar Cipher")) convertedText = encryptWithCeasar(); 
		else convertedText = encryptWithVigenere();
	}

	private String encryptWithVigenere() {
		
		return null;
	}

	private String encryptWithCeasar() {
		String returnText="";
		int keyValue = Integer.parseInt(key);
		keyValue = keyValue%26;
		for(int i=0; i<inputText.length(); i++) {
			char c = inputText.charAt(i);
			if(c>=65 && c<=90) {
				if (c+keyValue>90) {
					int tempKey = 90 - (c+keyValue);
					returnText = returnText + (char)(64+tempKey);
				}
			}
			else if(c>=97 && c<=122) {
				if (c+keyValue>122) {
					int tempKey = 122 - (c+keyValue);
					returnText = returnText + (char)(96+tempKey);
				}
			}
			else {
				returnText = returnText + c;
			}
		}
		return returnText;
	}

	private String decryptWithVigenere() {
		return null;
	}

	private String decryptWithCeasar() {
		String returnText="";
		int keyValue = Integer.parseInt(key);
		keyValue = keyValue%26;
		for(int i=0; i<inputText.length(); i++) {
			char c = inputText.charAt(i);
			if(c>=65 && c<=90) {
				if (c-keyValue<65) {
					int tempKey = 65 - (c-keyValue);
					returnText = returnText + (char)(91-tempKey);
				}
			}
			else if(c>=97 && c<=122) {
				if (c-keyValue<97) {
					int tempKey = 97 - (c-keyValue);
					returnText = returnText + (char)(123-tempKey);
				}
			}
			else {
				returnText = returnText + c;
			}
		}
		return returnText;		
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

