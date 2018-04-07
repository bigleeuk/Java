import java.util.Scanner;
public class Ex5_12 {

	public static void main(String[] args) {
		Movie MB = new Movie();
		Movie MB1 =new Movie();
		boolean a1,a2,a3;
		Scanner keyboard =  new Scanner(System.in);
		System.out.println("Write information");
		String name1= keyboard.next();
		String name2= keyboard.next();
		String rate1= keyboard.next();
		String rate2= keyboard.next();
		MB.setMovie_name(name1);
		MB.setMPAA_rate(rate1);
		MB.getMPAA_rate();
		MB.evl_MPAA(MB.getMPAA_rate());
		MB.addRating();
		MB.getAverage(MB.count1, MB.count2, MB.count3, MB.count4, MB.count5);
		MB1.setMovie_name(name2);
		MB1.setMPAA_rate(rate2);
		MB1.getMPAA_rate();
		MB1.evl_MPAA(MB1.getMPAA_rate());
		MB1.addRating();
		MB1.getAverage(MB1.count1, MB1.count2, MB1.count3, MB1.count4, MB1.count5);
		a1=MB.equals(MB1);
		a2=MB.equals1(MB1);
		a3=MB.equals2(MB1);
		System.out.println("equals name is : "+ a1);
		System.out.println("equals MPAA is : "+ a2);
		System.out.println("equals average is : "+ a3);
	}

}
