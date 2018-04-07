public class InvalidHourException extends InvalidTimeException {
	public InvalidHourException() {
		super("Invalid hour!");
	}

	public InvalidHourException(String message) {
		super(message);
	}

	public static boolean checkTime(String time) {
		int hour = Integer.parseInt(time.substring(0, 2));
		if ((hour >= 0 && hour <= 12))
			return true;
		else
			return false;
	}
}


