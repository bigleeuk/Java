import java.util.Scanner;

public class MonthDemo {
	public static void main(String[] args) throws MonthException, DayException {
		Scanner keyboard = new Scanner(System.in);
		String MD = "";
		Month monthDay = new Month();
		System.out.println("FORMAT A  ;  B");
		System.out.println("Input Month and Day");
		monthDay.setMonthDay(keyboard.nextLine());

		try {
			MD = monthDay.getMonthDay();
			if (MonthException.checkMonth(MD) == true) {
				if (DayException.checkDay(MD) == true)
					System.out.println(monthDay.convert() + " " + monthDay.getDay());

				else
					throw new DayException();
			}

			else
				throw new MonthException();

		} catch (MonthException e) {
			System.out.println(e.getMessage());
		}

		catch (DayException e) {
			System.out.println(e.getMessage());
		}
	}
}
