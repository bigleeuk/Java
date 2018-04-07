import java.util.ArrayList;
import java.util.Scanner;
public class Ex14_1b {
	public static void main(String[] args){
		ArrayList <Integer> list = new ArrayList<Integer>();
		Scanner key = new Scanner(System.in);
		int number;
		int average=0,sum=0;
		int i=0;
		while(true){
			number=key.nextInt();
			if(number<0)
				break;
			list.add(number);	
		}
		for( i=0; i < list.size();i++){
			sum=sum+list.get(i);
			average=sum/list.size();
		}
		System.out.println("average : " +average);
		for( i=0; i < list.size();i++){
			if(list.get(i) > average)
				System.out.println("above the average: "+list.get(i));
		}
	}
}
