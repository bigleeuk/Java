public class InvalidTimeExceptionDemo {

	public static void main(String[] args) throws InvalidTimeException {
		String str1 = "09:00 Am";
		String str2 = "02:20 PM";
		String str3 = "15:24 PM";
		String str4 = "01:80 PM";

		check(str1);
		check(str2);
		check(str3);
		check(str4);
	}

	public static void check(String str) {
		try {
			int hour = Integer.parseInt(str.substring(0, 2));
			int minute = Integer.parseInt(str.substring(3, 5));
			String amOrPm = str.substring(6).toUpperCase();
			if (InvalidTimeException.checkTime(str) == true) {
				System.out.print(String.format("%02d", hour));
				System.out.print(":" + String.format("%02d", minute));
				System.out.println(" " + amOrPm);
			}

			else {
				if ((InvalidHourException.checkTime(str) == false) && (InvalidMinuteException.checkTime(str) == false))
					throw new InvalidTimeException();
				else if ((InvalidHourException.checkTime(str) == false)
						&& (InvalidMinuteException.checkTime(str) == true))
					throw new InvalidHourException();
				else
					throw new InvalidMinuteException();
			}

		} catch (InvalidHourException e) {
			System.out.println(e.getMessage());
		} catch (InvalidMinuteException e) {
			System.out.println(e.getMessage());
		} catch (InvalidTimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
