import java.util.Scanner;
public class Ex7_1a {

	public static void main(String[] args) {
		double total=0;
		double avg=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("write how many integer");
		int n= keyboard.nextInt();
		int []number=new int [n];
		for(int i=0; i<n;i++){
			System.out.println("write each integer");
			int n1=keyboard.nextInt();
			number[i]=n1;
			total+=number[i];
			n1=0;
		}
		avg=total/n;
		System.out.println("total="+avg);
		for(int i=0; i<n;i++){
			if(number[i]>avg)
				System.out.println(number[i]);
		}
	}

}
