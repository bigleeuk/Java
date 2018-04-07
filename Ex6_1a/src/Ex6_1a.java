import java.util.Scanner;
public class Ex6_1a {
	public static void main(String[] args) {
		Scanner keyboard =  new Scanner(System.in);
		Time t1= new Time();
		t1.setTime2(14, 45, true);
	     System.out.println(t1.getHour() +" : "+ t1.getMinute());
				
	}
}
