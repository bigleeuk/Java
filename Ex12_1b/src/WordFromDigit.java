public class WordFromDigit {
	public static void displayAsWords(int number) {
		String num = Integer.toString(number);
		int length = num.length();

		if (number >= 10) {

			for (int i = 0; i < num.length(); i++) {
				System.out.print(getWordFromDigit((int) (number / Math.pow(10, length - 1))) + " ");
				number -= ((int) (number / Math.pow(10, length - 1))) * Math.pow(10, length - 1);
				length--;
			}
		}

		else
			System.out.println(getWordFromDigit(number));
	}

	public static String getWordFromDigit(int digit) {
		String[] word = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		return word[digit];
	}
}
