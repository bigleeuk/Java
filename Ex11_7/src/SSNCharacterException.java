public class SSNCharacterException extends Exception {
	public SSNCharacterException() {
		super("Invalid Social Security Character!");
	}

	public SSNCharacterException(String message) {
		super(message);
	}

	public static boolean checkCharacter(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (!(string.charAt(i) >= '0' || string.charAt(i) <= '9'))
				return false;
		}

		return true;
	}
}