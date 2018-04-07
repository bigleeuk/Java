import java.util.Scanner;
public class NotationDemo {
	public static void main(String[] args) throws TimeFormatException {
		Scanner keyboard = new Scanner(System.in);
		Notation notation = new Notation();
		char re = 'o';

		while (true) {
			try {
				System.out.println("Format time");
				System.out.println("hour:minute");
				System.out.println("Enter time ,24-hour Notation ");
				notation.setTime(keyboard.nextLine());

				if (TimeFormatException.checkTime(notation.getTime()) == true) {
					notation.notation();
					System.out.println("That is the same :? "+notation.getTotalTime());
				}
				else
					throw new TimeFormatException();
				
				
			} catch (TimeFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("There is no such time as" + notation.getTime().substring(0, 2) + ":"
						+ notation.getTime().substring(2));
			}

			while (re != 'x') {
				System.out.println("RE? you write o OR x");
				re = keyboard.nextLine().charAt(0);
				if (re == 'O' || re == 'o')
					break;
				else if (re == 'x' || re == 'X') {
					System.out.println("Program is ending");
					System.exit(0);
				}

				else
					System.out.println("input is wrong!");

			}

		}
	}

}
