import java.util.Scanner;
public class Ex3_10 {

	public static void main(String[] args) {
		double annual = 0,month = 0,daily = 0,newrate1=1,newrate2=1,newrate3=1;
		double i,j,k,rate=1;
		int account;
		Scanner keyboard=new Scanner(System.in);
		System.out.println(" Deposit money ");
		while(true){
			System.out.println(" ACCOUNT ");
			account=keyboard.nextInt();
			System.out.println(" RATE ");
			rate=keyboard.nextDouble();

			//입력받는다
			for(i=0;i<10;i++){
				
				newrate1*=(1+(rate/100));
				for(j=0;j<12;j++)
					newrate2*=(1+(rate/1200));
				for(k=0;k<365;k++)
					newrate3*=(1+(rate/36500));
				
			}
			annual=account*newrate1;
			month=account*newrate2;
			daily=account*newrate3;
			System.out.println(" annual : "+ annual );
			System.out.println(" month : "+ month);
			System.out.println(" daily : "+ daily);
			
		}

	}

 }

