public class MonthException extends Exception {
	public MonthException() {
		super("Invalid month!");
	}

	public MonthException(String message) {
		super(message);
	}

	public static boolean checkMonth(String monthday) {
		int i;
		for (i = 0; i < monthday.length(); i++) {
			if (!((monthday.charAt(i)) >= '0' && (monthday.charAt(i)) <= '9'))
				break;
		}
		int month = Integer.parseInt(monthday.substring(0, i));

		if (month > 0 && month <= 12)
			return true;
		else
			return false;
	}
}

