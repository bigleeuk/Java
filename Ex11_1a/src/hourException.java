
public class hourException extends Exception {

	public char[] getMessage;
	public hourException(){
		super("hour isnt range");
	}
	public hourException(String message){
		super(message);
	}
	public String getMessage(){
		return "hour isnt range";
	}
}
