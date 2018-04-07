public class InvalidMinuteException extends InvalidTimeException {
	public InvalidMinuteException() {
		super("Invalid minute!");
	}

	public InvalidMinuteException(String message) {
		super(message);
	}

	public static boolean checkTime(String time) {
		int min = Integer.parseInt(time.substring(3, 5));
		if ((min >= 0 && min <= 60))
			return true;

		else
			return false;
	}
}
