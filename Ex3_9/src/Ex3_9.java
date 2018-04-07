import java.util.Scanner;
public class Ex3_9 {

	public static void main(String[] args) {
		String word,word2="quit",newword;
		String arr;
		String newword2="";
		int len;
		System.out.println(" input word ");
		Scanner keyboard= new Scanner(System.in);
		word=keyboard.nextLine();
		while(!(word.equals(word2))){
			word=word.toLowerCase();
			newword=word;
			len=newword.length();
			arr=newword.substring(0,1); //한글자 출력
			newword=newword.substring(1,len);
			newword=newword+arr;
			System.out.println(newword);
		for(int i=1;i<=len;i++)
			newword2=newword2+newword.charAt(len-i);			
		if(word.equals(newword2)){
			System.out.println(" Correct ");
			newword2="";
			}
		else{
			System.out.println(" Not Correct  ");
			newword2="";
			}
		System.out.println("input the word");
		word=keyboard.nextLine();
		
		}
	}
}
	
