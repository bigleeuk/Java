import java.util.Scanner;
public class Ex3_1a {

	public static void main(String[] args) {
		System.out.println("Put cash");
		Scanner Keyboard = new Scanner(System.in);
		int cash;
		cash=Keyboard.nextInt();
		if(cash<10)
			System.out.printf("charge=%d", 1);
		else if(cash<100)
			System.out.println("charge="+ (cash*0.1));
		else if(cash<1000)
			System.out.println("charge="+(5+cash*0.05));
		else
			System.out.println("charge="+ (40+cash*0.01));
		
	
	}

}
