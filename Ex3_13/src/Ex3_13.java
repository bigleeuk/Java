import java.util.Scanner;
public class Ex3_13 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Write NUM");
		int num=keyboard.nextInt();
		int i,j;
		String aslisk="*";
		String newaslisk="";
		
			for(i=0;i<=num-1;i++){
				newaslisk+=aslisk;
				System.out.println(newaslisk);	
				
			}
			for(j=num-1;j>=0;j--){
			newaslisk=newaslisk.substring(0,j);
			System.out.println(newaslisk);
		}		
	}
}
