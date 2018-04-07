import java.util.Scanner;
import java.io.*;
public class Ex13_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="haberman.txt";
		Scanner inputStream =null;
		String arr[]=null,str="",temp;
		int total1=0,total2=0,c1=0,c2=0;
		double average1,average2;
		try
		{
			inputStream = new Scanner(new File(fileName));
			
			while(inputStream.hasNextLine())
			{
				temp=inputStream.nextLine();
				str=str+temp+" ";
			}
			arr=str.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				String[] newArr=arr[i].split(",");
			
				if(newArr[3].equals("1"))
				{
					total1+=Integer.parseInt(newArr[2]);
				
					c1++;
				}
				else
				{
					total2+=Integer.parseInt(newArr[2]);
					c2++;
				}
			}
			average1=(float)total1/c1;
			average2=(float)total2/c2;
			System.out.println("average who survived 5 years or longer : "+average1);
			System.out.println("average who died within 5 years :"+average2);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening file "+fileName);
			System.exit(0);
		}
	}

}
