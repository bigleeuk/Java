import java.util.Scanner;
public class Ex7_1b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("write phone number!!!");
		String phnumber=keyboard.nextLine();
		char[] arry=phnumber.toCharArray();
		int[]frequency =new int[10];
		for(int i=0; i<10 ; i++){
			frequency[i]=0;
		}
		for(int i=0; i<phnumber.length();i++){
			if(phnumber.charAt(i)=='0')
				//System.out.println("10101");
				if((Character.isDigit(arry[i]-'0'))!=true)
						frequency[0]++;
			if(phnumber.charAt(i)=='1')
				if((Character.isDigit(arry[i]-'1'))!=true)
						frequency[1]++;
			if(phnumber.charAt(i)=='2')
				if((Character.isDigit(arry[i]-'2'))!=true)
						frequency[2]++;
			if(phnumber.charAt(i)=='0')
				if((Character.isDigit(arry[i]-'3'))!=true)
						frequency[3]++;
			if(phnumber.charAt(i)=='4')
				if((Character.isDigit(arry[i]-'4'))!=true)
						frequency[4]++;
			if(phnumber.charAt(i)=='5')
				if((Character.isDigit(arry[i]-'5'))!=true)
						frequency[5]++;
			if(phnumber.charAt(i)=='6')
				if((Character.isDigit(arry[i]-'6'))!=true)
						frequency[6]++;
			if(phnumber.charAt(i)=='7')
				if((Character.isDigit(arry[i]-'7'))!=true)
						frequency[7]++;
			if(phnumber.charAt(i)=='8')
				if((Character.isDigit(arry[i]-'8'))!=true)
						frequency[8]++;
			if(phnumber.charAt(i)=='9')
				if((Character.isDigit(arry[i]-'9'))!=true)
						frequency[9]++;
			else
				continue;
					
		}
		for(int i=0; i<10;i++){
			System.out.println(frequency[i]);
		}
	}

}
