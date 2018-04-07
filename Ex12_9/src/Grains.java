public class Grains {
	public static long getTotalGrains(long a, long grains) {
		if (grains == 0)
			return 0;
		if (a == 1)
			return 1;
		else
			return getTotalGrains(a - 1, grains) * grains;
	}
}