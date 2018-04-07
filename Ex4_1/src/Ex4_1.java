
public class Ex4_1 {

	public static void main(String[] args) {
		MotorBoat mb= new MotorBoat();
		double cursa,maxsa,travela,travelfuel;
		mb.capOftank=200;
		mb.amfuel=150;
		mb.maxs=120;
		mb.curs=60;
		mb.effi=0.7;
		mb.time=10;
		mb.writeOutput();
		cursa=mb.amountOfusedmax(mb.effi,mb.curs,mb.time);
		System.out.println(cursa);
		maxsa=mb.amountOfusedmax(mb.effi,mb.maxs,mb.time);
		System.out.println(maxsa);
		travela=mb.traveldis(mb.time,mb.curs);
		System.out.println(travela);
		travelfuel=mb.travelCurdis(mb.effi,mb.curs,mb.amfuel);
		System.out.println(travelfuel);
		
		
	}
	

}
