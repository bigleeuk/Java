import java.util.Scanner;
public class Ex3_2b {

	public static void main(String[] args) {
		System.out.println(" Read integer (0 ~100) ");
		Scanner Keyboard = new Scanner(System.in);
		int val=1;
		int acou=0;
		int bcou=0;
		int ccou=0;
		int dcou=0;
		int fcou=0;
		while(val<=100){
			val=Keyboard.nextInt();
			if(90<=val && val<=100){
				System.out.println("A: "+val);
				acou++;
			}
			else if(80<=val && val<=89){
				System.out.println("B: "+val);
				bcou++;
			}
			else if(70<=val && val<=79){
				System.out.println("C: "+val);
				ccou++;
			}
			else if(60<=val && val<=69){
				System.out.println("D: "+val);
				dcou++;
			}
			else if(0<=val && val<=59){
				System.out.println("F: "+val);
				fcou++;
			}		
		}
		System.out.printf("A count:%d B count:%d C count:%d D count:%d F count:%d",acou,bcou,ccou,dcou,fcou);
	}

}
