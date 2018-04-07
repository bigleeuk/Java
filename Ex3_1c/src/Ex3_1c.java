import java.util.Scanner;
public class Ex3_1c {

	public static void main(String[] args) {
		System.out.println(" Letter is ");
		Scanner Keyboard = new Scanner(System.in);
		String grd;
		char grd1;
		grd=Keyboard.next();
		grd1=grd.charAt(0);
		switch(grd1)
		{
			case 'A':
				System.out.println("gradeValue :" +grd1+ " :4");
				break;
			case 'B':
				System.out.println("gradeValue :" +grd1+" :3");
				break;
			case 'C':
				System.out.println("gradeValue :" +grd1+" :2");
				break;
			case 'D':
				System.out.println("gradeValue :" +grd1+" :1");
				break;
			default:
				System.out.println("F or other letter");
				System.out.println("gradeValue : 0 ");
				break;
				
				
			
		}
		
		

	}

}
