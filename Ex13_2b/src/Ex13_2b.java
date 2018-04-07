import java.io.*;
import java.util.Scanner;
public class Ex13_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName ="File.txt";
		int[] arr = new int[10];
		int i=0;
		Scanner inputStream =null;
		try
		{
			inputStream =new Scanner(new File(fileName));
			
			while(inputStream.hasNextInt())
			{
				arr[i]=inputStream.nextInt();
				i++;
			}
			
			inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening file "+fileName);
			System.exit(0);
		}
		ObjectOutputStream outputStream =null;
		String binaryFile="binary.dat";
		try
		{
			outputStream= new ObjectOutputStream(new FileOutputStream(binaryFile));
			
			for(i=0;i<10;i++)
			{
				if(i%2==0)
					outputStream.writeByte(arr[i]);
				else if(i%2==1)
				{
					int k=arr[i]-arr[i-1];
					outputStream.writeByte(k);
				}
			}	
				outputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Proble opening file "+fileName);
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("problem with file "+fileName);
			System.exit(0);
		}
		ObjectInputStream inputStream1 =null;
		
		try
		{
			inputStream1 =new ObjectInputStream(new FileInputStream(binaryFile));
			int[] nArr =new int[10];
			
			for(i=0;i<10;i++)
			{
				if(i%2==0)
					nArr[i]=inputStream1.readByte();
				else if(i%2==1)
					nArr[i]=inputStream1.readByte()+nArr[i-1];
				
				System.out.print(nArr[i]+" ");
			}
			inputStream1.close();
			
		}
			catch(FileNotFoundException e)
			{
				System.out.println("problem opening file "+binaryFile);
				System.exit(0);
			}
			catch(IOException e)
			{
				System.out.println("problem reaing the file "+binaryFile);
				System.exit(0);
			}
	}

}
