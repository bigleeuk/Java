import java.io.*;
import java.util.Scanner;
public class Ex13_2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName ="";
		
		try
		{
			Scanner keyboard =new Scanner(System.in);
			System.out.println("enter file name");
			fileName=keyboard.next();
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			for(int i=0;i<10;i++)
			{
				int k=(int)(Math.random()*10+1);
				outputStream.writeInt(k);
			}
			outputStream.close();			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file "+fileName);
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("problem with output to file "+fileName);
			System.exit(0);
		}
		
		try
		{
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
		int max=0,min=-1,sum=0,aInteger;
		double average;
		
		for(int i=0;i<10;i++)
		{
			aInteger=inputStream.readInt();
			System.out.print(aInteger+" ");
			if(min==-1)
				min=aInteger;
			if(max<aInteger)
				max=aInteger;
			if(min>aInteger)
				min=aInteger;
			sum+=aInteger;
		}
		average=sum/10;
		System.out.println();
		
		System.out.println("max: "+max+" min: "+min+" sum: "+sum+" average: "+average);
		
		inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file"+fileName);
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("Problem reading to file");
			System.exit(0);
		}
	}

}
