import java.util.Scanner;
public class Ex2_1b {

	public static void main(String[] args) {
		System.out.println("write f");
		Scanner Keybord = new Scanner(System.in);
		float f;
		f=Keybord.nextInt();
		//C = 5 (F - 32) / 9
		System.out.println("Print C");
		System.out.println(5*(f - 32)/9 + " : C");
		
	}

}