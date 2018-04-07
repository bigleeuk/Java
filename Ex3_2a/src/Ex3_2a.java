import java.util.Scanner;
public class Ex3_2a {

	public static void main(String[] args) {
		Scanner Keyboard=new Scanner(System.in);
		int max=0,min=0,num2=1,sum=0;
		int num=1;
		int i=0;
		double avg;
		while(num>=0)
		{
			System.out.println("write integer");
			 num=Keyboard.nextInt();
			 if(num<0)
				 break;
			 else if(min==0)
				 min=num;
			 max=(max>num)?max:num;
			 min=(min<num)?min:num;
			 sum+=num;
			 i++;	 
		}
		avg=(sum)/(i);
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		System.out.println("avg: "+avg);

	}

}
