import java.util.Scanner;
public class Ex7_4 {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int[] sort= new int [5];
		System.out.println("write sort element !!!");
		for(int i=0; i<5;i++){
			sort[i]=keyboard.nextInt();			
		}
		Arraysorter.bubblesort(sort);
		for(int i=0;i<5;i++){
			System.out.println(sort[i]);
		}

	} 
} 




