public class Fibo {
	public static int Fib(int num) {
		if (num == 0)
			return 0;
		else if (num == 1)
			return 1;
		else
			return Fib(num - 1) + Fib(num - 2);
	}
}
