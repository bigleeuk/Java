import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// substring
		Scanner keyboard = new Scanner(System.in);
		String sentence1, sentence2;
		String str1;
		int idx, len,len2;
		System.out.println("input a string");
		sentence1 = keyboard.nextLine();
		idx = sentence1.indexOf(" ");
		len = sentence1.length();
		sentence2 = sentence1.substring(0, idx);
		sentence1 = sentence1.substring(idx + 1, len) + " " + sentence2;
		len2= sentence1.length();
		str1 = sentence1.substring(0, 1);
		str1 = str1.toUpperCase();
		sentence1 = str1 + sentence1.substring(1,len2);

		System.out.println(sentence1);

	}

}