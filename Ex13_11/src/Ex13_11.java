import java.util.Scanner;
import java.io.*;
public class Ex13_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName ="words.txt";
		  String outputFile="output.txt";
		  String str="";
		  Scanner inputStream = null;
		  PrintWriter outputStream =null;
		  try
		  {
			  inputStream =new Scanner(new File(fileName));
			  outputStream =new PrintWriter(outputFile);
			  while(inputStream.hasNextLine())
			  {
				  str=inputStream.nextLine();
				  if(str.length()>4)
				  {
				  if(str.charAt(str.length()-4)=='d'&&str.charAt(str.length()-3)=='o'&&str.charAt(str.length()-2)=='u'&&str.charAt(str.length()-1)=='s')
				  {
					  System.out.println(str);
					  outputStream.println(str);
				  }
				  }
			  } 
			  System.out.println();
			  System.out.println("the output is stored new file.");
			  inputStream.close();
			  outputStream.close();
		  }
		  catch(FileNotFoundException e)
		  {
			  System.out.println("Proble opening file "+fileName);
			  System.exit(0);
		  }
	}

}
