
public class minException extends Exception{ 

	public minException(){
		super("miniute isnt range");
	}
	public minException(String message){
		super(message);
	}
	public String getMessage(){
		return "miniute isnt range";
	}
}
