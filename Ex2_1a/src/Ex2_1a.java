import java.util.Scanner;
public class Ex2_1a {
	public static void main(String[] args){
		System.out.println("write integer");
		Scanner Keybord= new Scanner(System.in);
		int num;
		num=Keybord.nextInt();
		System.out.println(num/1000);
		System.out.println((num%1000)/100);
		System.out.println(((num%1000)%100)/10);
		System.out.println(((num%1000)%100)%10);
		
	}
}