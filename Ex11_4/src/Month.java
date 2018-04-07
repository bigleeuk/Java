public class Month {
	private String monthday = "";
	private int month = 0;
	private int day = 0;

	public void setMonthDay(String newMonthday) {
		monthday = newMonthday;
		int i = 0;
		for (i = 0; i < monthday.length(); i++) {
			if (!((monthday.charAt(i)) >= '0' && (monthday.charAt(i)) <= '9'))
				break;
		}

		month = Integer.parseInt(monthday.substring(0, i));
		day = Integer.parseInt(monthday.substring(i + 1));
	}

	public String getMonthDay() {
		return monthday;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String convert() {
		switch (month) {
		case 1:
			return "JANUARY";
		case 2:
			return "FEBUARY";
		case 3:
			return "MARCH";
		case 4:
			return "APRILL";
		case 5:
			return "MAY";
		case 6:
			return "JUNE";
		case 7:
			return "JULY";
		case 8:
			return "AUGEST";
		case 9:
			return "SEPTEMBER";
		case 10:
			return "OCTORBER";
		case 11:
			return "NOVEMBER";
		case 12:
			return "DECENBER";
		}
		return "";
	}
}