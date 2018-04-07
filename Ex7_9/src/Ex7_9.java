import java.util.Scanner;
public class Ex7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int count=0,passw,repass;
		int[] key= new int [10];
		int[] tpass= new int [5];
		int[] fpass= new int [5];
		System.out.println("number : 0 1 2 3 4 5 6 7 8 9");
		for(int i=0; i<10 ; i++){
			key[i]=(int)(10.0*Math.random())%3+1;
			System.out.println(i+ " is changed "+ key[i]);
		}
	System.out.println("write password");
	passw=keyboard.nextInt();
	for(int i=4; i>=0;i--){
		tpass[i]=passw%10;
		passw=(passw-tpass[i])/10;
	}
	System.out.println("writen password is using");
	repass=keyboard.nextInt();
	for(int i=4; i>=0;i--){
		fpass[i]=repass%10;
		repass=(repass-fpass[i])/10;
	}
	for(int i=0; i<5;i++){
		  if(key[tpass[i]]==fpass[i])
              count++;
           else
              count=0;
	}
	System.out.println("falsepassword: ");
	 for(int i=0;i<5;i++){
         System.out.print(fpass[i]);
	 }
	 System.out.println(" ");
	 System.out.println("truepassword: ");
	 for(int i=0;i<5;i++){
         System.out.print(tpass[i]);
	 }
      if(count==5)
         System.out.println(" : correct!");
      else
         System.out.println(" : wrong number");
	}
		
}

