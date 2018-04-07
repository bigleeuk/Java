import java.util.Scanner;
public class Ex7_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg,s;
		Scanner keyboard1 = new Scanner(System.in);
		doublearr n= new doublearr();
		System.out.println(" init start ");
		n.init();
		System.out.println("write num1");
		int num1 = keyboard1.nextInt();
		System.out.println("write num2");
		int num2 = keyboard1.nextInt();
		avg=n.getAverage(n.number, num1);
		s=n.getSum(n.number,num2 );
		System.out.println("in num1 colum ,average row=" + avg);
		System.out.println("in num1 row ,sum colum=" + s);
		
		
	}
}
