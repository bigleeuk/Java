import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.lang.NullPointerException;
import java.util.Scanner;
import java.util.Arrays;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key =new Scanner(System.in);
		System.out.println("Making name : xx.txt");
		String fileName =key.nextLine();
		PrintWriter outputStream =null;
		try{
			outputStream = new PrintWriter(fileName);
		}catch(FileNotFoundException e){
			System.out.println("Error open th file: "+fileName);
			System.exit(0);
		}
		
		System.out.println("Write integer");
		for(int i=0;i<10;i++){
//			System.out.println((int)(Math.random()*100 +3));
			outputStream.println((int)(Math.random()*100 +3));
		}
		outputStream.close();	
        Scanner inputStream = null;
        System.out.println("The file " + fileName +
                "\ncontains the following lines:\n");
            try {
                inputStream = new Scanner(new File(fileName));
            } catch(FileNotFoundException e) {
                System.out.println("Error opening the file " + fileName);
                System.exit(0);
            }
            int [] line = null;
            int max=0;
            int min=0;
            int sum=0,avg=0;
		while (inputStream.hasNextInt()) {
			int i=0;
			//Arrays.fill(line, 0);
            line[i] = inputStream.nextInt();
            System.out.println(line);
            i++;
            
            if(max<line[i])
            	max=line[i];
            if(min>line[i])
            	min=line[i];
            sum+=line[i];            		
        }
		outputStream.println(max);
		outputStream.println(min);
		outputStream.println(sum);
		outputStream.println(sum/10);
        inputStream.close();
    }
}


