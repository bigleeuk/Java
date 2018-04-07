import java.util.Scanner;
public class Ex3_14 {

	public static void main(String[] args) {
		System.out.println("Enter the initaial velocity of the ball");
		Scanner keyboard=new Scanner(System.in);
		
		int bounce=0,time=0;
		double height=0;
		double vel=keyboard.nextDouble();
		vel=vel+32;
		while(bounce<5){
			
			if(height>=0){
				System.out.println("Time: "+time+ " height: " + height);
				System.out.println("velocity: "+ vel);
				System.out.println("bounce: "+ bounce);
				System.out.println("-------------------");
				vel=vel-32;
				height+=vel;
				time++;
				
			}
			
			else if(height<0){
				height=height*(-0.5);
				vel=vel*(-0.5);
				vel=vel-32;
				bounce++;
				if(bounce==5)
					break;
				System.out.println("Time: "+time+ " height: " + height);
				System.out.println("velocity: "+ vel);
				System.out.println("bounce: "+ bounce);
				System.out.println("-------------------");
				height+=vel;
				time++;
				
			}
			}
			
		}
	}


