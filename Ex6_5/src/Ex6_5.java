import java.util.Scanner;
public class Ex6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a measurement in inches");
		double inches =keyboard.nextDouble();
		double feet= Dimension.convertInchesToFeet(inches);
		System.out.println(inches+"inches = "+ feet +"feet");
		System.out.println("Enter a measurement in feet");
		feet =keyboard.nextDouble();
		inches=Dimension.convertFeetToINches(feet);
		System.out.println(feet + "feet ="+ inches + "inches.");
	}

}
