public class PhoneNumberDemo {
	public static void main(String[] args) {
		String num1 = "010-1234-5678";
		String num2 = "010312312--";
		System.out.println(PhoneNumber.countDigits(num1));
		System.out.println(PhoneNumber.countDigits(num2));
	}
}