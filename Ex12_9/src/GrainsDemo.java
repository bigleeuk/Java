import java.util.Scanner;
public class GrainsDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		long sq;
		long grains;
		long total = 0;

		System.out.print("k squares : input the number ");
		sq = keyboard.nextInt();
		while (sq> 64) {
			System.out.println("input is wrong");
			System.out.print("k squares : input the number ");
			sq = keyboard.nextInt();
		}
		System.out.print("grains : input the number");
		grains = keyboard.nextInt();
		for (int i = 1; i <= sq; i++)
			total += Grains.getTotalGrains(i, grains);
		System.out.println("total : " + total);
	}
}