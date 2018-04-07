
public class Ex5_1 {
	public static void main(String[] args) {
		ExtendMotorBoat mb= new ExtendMotorBoat();
		ExtendMotorBoat mb2= new ExtendMotorBoat();
		double cursa,maxsa,travela,travelfuel;

		boolean a1;
		mb.setAmfuel();
		mb.setCurs();
		mb.setEffi();
		mb.setTime();
		mb.writeOutput();

		cursa=mb.amountOfusedmax(mb.getEffi(),mb.getCurs(),mb.getTime());
		System.out.println(cursa);
		maxsa=mb.amountOfusedmax(mb.getEffi(),mb.maxs,mb.getTime());
		System.out.println(maxsa);
		travela=mb.traveldis(mb.getTime(),mb.getCurs());
		System.out.println(travela);
		travelfuel=mb.travelCurdis(mb.getEffi(),mb.getCurs(),mb.getAmfuel());
		System.out.println(travelfuel);

		mb2.setAmfuel();
		mb2.setCurs();
		mb2.setEffi();
		mb2.setTime();
		mb2.writeOutput();
		cursa=mb2.amountOfusedmax(mb2.getEffi(),mb2.getCurs(),mb2.getTime());
		System.out.println(cursa);
		maxsa=mb2.amountOfusedmax(mb2.getEffi(),mb2.maxs,mb2.getTime());
		System.out.println(maxsa);
		travela=mb2.traveldis(mb2.getTime(),mb2.getCurs());
		System.out.println(travela);
		travelfuel=mb2.travelCurdis(mb2.getEffi(),mb2.getCurs(),mb2.getAmfuel());
		System.out.println(travelfuel);

		a1=mb.equals(mb2);
		System.out.println(a1);
	}


}

