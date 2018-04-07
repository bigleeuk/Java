public class Notation {
	private String time = "";
	private int hour = 0;
	private int minute = 0;
	private String amOrPm = "AM";

	public void setTime(String newTime) {
		time = newTime.substring(0, 2) + newTime.substring(3);
	}

	public String getTime() {
		return time;
	}

	public void notation() {
		hour = Integer.parseInt(time.substring(0, 2));
		minute = Integer.parseInt(time.substring(2));

		if (hour > 12 && hour <= 24) {
			hour -= 12;
			amOrPm = "PM";
		}
	}

	public String getTotalTime() {
		return String.format("%02d", hour) + ":" + String.format("%02d", minute);
	}
}
