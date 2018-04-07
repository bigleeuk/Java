public class SSNLengthException extends Exception {
	public SSNLengthException() {
		super("Invalid Social Security Number Length!");
	}

	public SSNLengthException(String message) {
		super(message);
	}

	public static boolean checkLength(String string) {
		if (string.length() == 9)
			return true;
		else
			return false;
	}
}
