import java.util.Scanner;
public class MotorBoat {
	public int capOftank;
	public int amfuel;
	public int maxs;
	public int curs;
	public double effi;
	public int time;
	
	public void writeOutput(){
		System.out.println("capOftank : "+capOftank);
		System.out.println("amountOffuel : "+amfuel);
		System.out.println("maxspeed : "+maxs);
		System.out.println("Current spped : "+curs );
		System.out.println("efficient moter : "+effi);
//		System.out.println("the amount of fuel used : (maxspeed)and(current)"+amountOfusedmax(maxs)+amountOfusedmax(curs));
//		System.out.println("travel distance is(current) : "+traveldis(curs));
//		System.out.println("travel distance is(current) : "+travelCurdis(effi,curs,amfuel));
	}

	public double amountOfusedmax(double effi,int speed,int time){

		return (effi*(speed*speed)*time);
	}
	public int traveldis(int time,int speed){

		return (speed*time);
	}
	public double travelCurdis(double effi,int speed,int feul){
//		Scanner keyboard= new Scanner(System.in);
//		int time = keyboard.nextInt();
		return amfuel*(effi*curs);
	}

}
