import java.util.Scanner;
import java.io.*;
public class Ex13_7 {
	static String resultStr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String abvFile="abbreviations.txt";
			String messageFile="message.txt";
			String str="",arr[];
			String outputFile="output.txt";
			Scanner inputStream1=null;
			Scanner inputStream2=null;
			PrintWriter outputStream=null;
			try
			{
				inputStream1=new Scanner(new File(abvFile));
				inputStream2=new Scanner(new File(messageFile));
				outputStream=new PrintWriter(outputFile);
				while(inputStream1.hasNextLine())
				{
					String temp=inputStream1.nextLine();
					str=str+temp+" ";
				}
				arr=str.split(" ");
				str="";
				while(inputStream2.hasNextLine())
				{
					String temp=inputStream2.nextLine();
					str=str+temp+" ";
				}
				resultStr=str;
				for(int i=0;i<arr.length;i++)
				addBrackets(resultStr,arr[i]);
			
				outputStream.println(resultStr);
				System.out.println("the output is stored to new file.");

			}
			catch(FileNotFoundException e)
			{
				System.out.println("Problem opening file ");
				System.exit(0);
			}
			inputStream1.close();
			inputStream2.close();
			outputStream.close();
		}
		public static void addBrackets(String str,String abv)
		{
			str=str.toLowerCase();
			if(str.indexOf(abv)==-1);
			else
			{
				int a=str.indexOf(abv);
				int b=str.lastIndexOf(abv);
				if(Character.isLetter(str.charAt(a-1))==false&&Character.isLetter(str.charAt(a+abv.length()))==false)
				{
					resultStr =resultStr.substring(0, a)+"<"+resultStr.substring(a, a+abv.length())+">"+resultStr.substring(a+abv.length());
				}
				if(a==b);
				else 
				{
					int idx=resultStr.lastIndexOf(">");
					str=resultStr.substring(idx+1);
					addBrackets(str,abv);
				}
			}
	}

}
