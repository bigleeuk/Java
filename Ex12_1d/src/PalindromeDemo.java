public class PalindromeDemo {
	public static void main(String[] args) {
		String[] str = new String[4];
		str[1] = "Straw? No, too stupid a fad, I put soot on warts.";
		str[0] = "?Wow?";
		str[2] = "radar";
		str[3] = "lee hyoung wook";

		for (int i = 0; i < str.length; i++)
			System.out.println("str[" + i + "] : " + Palindrome.checkPalindrome(str[i]));
	}
}
