import java.util.Scanner;
public class Ex2_3a {

	public static void main(String[] args) {
		System.out.println(" price ");
		Scanner Keyboard = new Scanner(System.in);
		int price;
		int cash=100;
		price = Keyboard.nextInt();
		// price ¹Þ±â
		int change=cash-price;
		System.out.println("change is " + change);
		System.out.println("25cent : " + (change/25));
		change=change%25;
		System.out.println("10cent : " + (change/10));
		change=change%10;
		System.out.println("5cent  : " + (change/5));
		
		
		
	}

}