import java.util.Scanner;

public class FiboDemo {
	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Puts number");
		num = keyboard.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Fibo.Fib(i);
			if (i == 0)
				System.out.println("Fibonacci :" + (i + 1) + " = " + arr[i]);
			else if (i == 1)
				System.out.println("Fibonacci :" + (i + 1) + " = " + arr[i]);
			else
				System.out.println("Fibonacci :" + (i + 1) + " = " + arr[i] + "   " + arr[i] + "/" + arr[i - 1] + " = "
						+ (double) arr[i] / arr[i - 1]);
		}
	}
}