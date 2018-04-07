import java.util.Scanner;
public class ExtendMotorBoat {
	public static final double maxs=150.0;
	public static final double capOftank=60.0;
	private double curs,amfuel,time;
	private double effi;
	public boolean equals(ExtendMotorBoat extendmotorboat ){
		return  (this.curs==extendmotorboat.curs)&&
				(this.amfuel==extendmotorboat.amfuel)&&
				(this.effi== extendmotorboat.effi);
	}
	public double getCurs() {
		return curs;
	}
	public void setCurs() {
		System.out.println(" Put current speed:");
		Scanner keyboard=new Scanner(System.in);
		curs=keyboard.nextDouble();
		if(curs>maxs){
			System.out.println("error: current speed is higher than max speed \n");
			while(curs>maxs){
				System.out.println("Retry");
				curs=keyboard.nextDouble();
			}
		}
		this.curs = curs;
	}
	public double getAmfuel() {
		return amfuel;
	}
	public void setAmfuel() {
		System.out.println(" Put current amount of fuel:");
		Scanner keyboard=new Scanner(System.in);
		amfuel=keyboard.nextDouble();
		if(amfuel>capOftank){
			System.out.println("error: amount of fuel is higher than capOftank \n");
			while(amfuel>capOftank){
				System.out.println("Retry");
				amfuel=keyboard.nextDouble();
			}
		}
		this.amfuel = amfuel;
	}
	public double getTime() {
		return time;
	}
	public void setTime() {
		System.out.println(" Put current time:");
		Scanner keyboard=new Scanner(System.in);
		time=keyboard.nextDouble();
		this.time = time;
	}
	public double getEffi() {
		return effi;
	}
	public void setEffi() {
		System.out.println(" Put current efficient:");
		Scanner keyboard=new Scanner(System.in);
		effi=keyboard.nextDouble();
		this.effi = effi;
	}
	public void writeOutput(){
		System.out.println("capOftank : "+capOftank);
		System.out.println("amountOffuel : "+amfuel);
		System.out.println("maxspeed : "+maxs);
		System.out.println("Current spped : "+curs );
		System.out.println("efficient moter : "+effi);

	}

	public double amountOfusedmax(double effi,double speed,double time){
		return (effi*(speed*speed)*time);
	}
	public double traveldis(double time,double speed){
		return (speed*time);
	}
	public double travelCurdis(double effi,double speed,double feul){
		return amfuel*(effi*curs);
	}
}


