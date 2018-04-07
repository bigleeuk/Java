public class InvalidTimeException extends Exception {
	public InvalidTimeException() {
		super("Invalid Time!");
	}

	public InvalidTimeException(String message) {
		super(message);
	}

	public static boolean checkTime(String time){
		int hour = Integer.parseInt(time.substring(0, 2));
		int minute = Integer.parseInt(time.substring(3, 5));
		String amOrPm = time.substring(6);
		if ((hour >= 0 && hour <= 12) && (minute >= 0 && minute <= 60)
				&& (amOrPm.equalsIgnoreCase("AM") || amOrPm.equalsIgnoreCase("PM")))
			return true;

		else
			return false;
	}
}
