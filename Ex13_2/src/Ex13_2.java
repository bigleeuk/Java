import java.util.Scanner;
import java.io.*;
public class Ex13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[81];
		String fileName;
		int i=0,count=0;
		boolean flag=false;
		Scanner inputStream =null;
		Scanner key= new Scanner(System.in);
		System.out.println("input file name to open");
		fileName=key.next();
		try{
			inputStream = new Scanner (new File(fileName));
			while(inputStream.hasNextInt()){
				flag=false;
				int temp;
				if(i==0){
					arr[0]=inputStream.nextInt();
					i++;
					count++;
				}
				else{
					temp=inputStream.nextInt();
					for(int j=0;j<arr.length;j++){

						if(temp==arr[j])
							flag=true;
					}
					if(flag==false){
						arr[i]=temp;
						i++;
						count++;
					}
				}


			}
			
			int smallest=0,start=0,j,temp;
			for (i = 0; i < count; i++)
			{
				smallest = start;
				for (j = start; j < count; j++)
				{
					if (arr[j] < arr[smallest])
						smallest = j;
				}
				temp = arr[start];
				arr[start] = arr[smallest];
				arr[smallest] = temp;
				start++;
			}
			
			inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("problem opening file "+fileName);
			System.exit(0);
		}

		System.out.println("input file name to open");
		fileName=key.next();
		PrintWriter outputStream =null;

		try
		{
			outputStream =new PrintWriter(fileName);

			for(i=0;i<count;i++)
				outputStream.println(arr[i]);
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("problem opening file "+fileName);
			System.exit(0);
		}
		System.out.println("File was stored.");
		outputStream.close();
	}

}
