
public class timeException extends Exception {

	public timeException(){
		super(" it isnt  am or pm");
	}
	public timeException(String message){
		super(message);
	}
	public String getMessage(){
		return " it isnt  am or pm";
	}
}
