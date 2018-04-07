import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class PeopleName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="people.txt";
		Scanner inputStream=  null;
        System.out.println("The file " + fileName +
                "\ncontains the following lines:\n");
            try {
                inputStream = new Scanner(new File(fileName));
            } catch(FileNotFoundException e) {
                System.out.println("Error opening the file " + fileName);
                System.exit(0);
            }
//            while (inputStream.hasNextLine()) {
//                String line = inputStream.nextLine();
//                System.out.println(line);
//            }
//            String []string =new String[20];
            int cnt=1;
    		while(inputStream.hasNext())
    		{
    			String first="",last="";
    			
    			first=inputStream.next();
    			last=inputStream.next();
    			String newFileName="person"+(cnt)+".txt";
    			PrintWriter outputStream =null;
    			try{
    				outputStream =new PrintWriter(newFileName);
    			}
    			catch(FileNotFoundException e){
    				System.out.println("Error opening file "+fileName);
    				System.exit(0);
    			}
    			outputStream.print(first+" ");
    			outputStream.println(last);
    			outputStream.close();
    			cnt++;
    		}
//            while(inputStream.hasNextLine()){
//            	int i=0;
//            	String line = inputStream.next();
//            	string[i]=line;
//            }
//            inputStream.close();
//            
//            for(int i=0;i<10;i=i+2){
//            	String []string1=new String[10];
//            	string1[i]=string[i]+" "+string[i+1];
//            }

//            PrintWriter outputStream = null;
//            try {
//                outputStream = new PrintWriter(fileName);
//            } catch(FileNotFoundException e) {
//                System.out.println("Error opening the file" + fileName);
//                System.exit(0);
//            }
//            System.out.println("Enter three lines of text:");
//            Scanner keyboard = new Scanner(System.in);
//            String []string1=new String[10];
//            for(int i=0;i<10;i=i+2){
//            	string1[i]=string[i]+" "+string[i+1];
//            }
//            for(int i=0;i<10;i=i+2){
//            	
//            }

//            outputStream.close();
//            System.out.println("Those lines were written to " + fileName);

         
	}

}
