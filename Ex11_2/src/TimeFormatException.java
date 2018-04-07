public class TimeFormatException extends Exception {
	public TimeFormatException() {
		super("Invalid Time!");
	}

	public TimeFormatException(String message) {
		super(message);
	}

	public static boolean checkTime(String time) {
		for (int i = 0; i < time.length(); i++) {
			if (!(time.charAt(i) >= 48 && time.charAt(i) <= 57))
				return false;
			int hour = Integer.parseInt(time.substring(0, 2));
			int minute = Integer.parseInt(time.substring(2));
			if ((hour < 0 || hour > 24) || (minute < 0 || minute > 60))
				return false;
		}
		return true;
	}
}