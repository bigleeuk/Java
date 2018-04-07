import java.util.Scanner;
public class Ex2_3b {

	public static void main(String[] args) {
		System.out.println(" Write radius and Depth ");
		Scanner Keyboard = new Scanner(System.in);
		double rad;
		double dep;
		rad = Keyboard.nextDouble();
		rad=rad/12;
		dep = Keyboard.nextDouble();
		
		double v;
		v=(3.14)*(rad*rad)*dep;
		System.out.println("V is : " + v);
		v=v*7.48;
		System.out.println("V(gallons) is " + v);
		
		
		
	}

}
