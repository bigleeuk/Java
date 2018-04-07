public class Ex4_2a {
	public static void main(String[] args) {
		MoterBoat mb= new MoterBoat();
		MoterBoat mb2= new MoterBoat();
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
		
		
	}
	

}