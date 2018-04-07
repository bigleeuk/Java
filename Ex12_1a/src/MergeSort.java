public class MergeSort {
	public static void sort(int[] a) {
		if (a.length >= 2) {
			int halfLength = a.length / 2;
			int[] firstHalf = new int[halfLength];
			int[] lastHalf = new int[a.length - halfLength];

			divide(a, firstHalf, lastHalf);
			sort(firstHalf);
			sort(lastHalf);
			merge(a, firstHalf, lastHalf);
		}
	}

	private static void divide(int[] a, int[] firstHalf, int[] lastHalf) {
		for (int i = 0; i < firstHalf.length; i++)
			firstHalf[i] = a[i];

		for (int i = 0; i < lastHalf.length; i++)
			lastHalf[i] = a[firstHalf.length + i];
	}

	private static void merge(int[] a, int[] firstHalf, int[] lastHalf) {
		int firstHalfIndext = 0, lastHalfIndex = 0, aIndex = 0;
		while ((firstHalfIndext < firstHalf.length) && (lastHalfIndex < lastHalf.length)) {
			if (firstHalf[firstHalfIndext] < lastHalf[lastHalfIndex]) {
				a[aIndex] = firstHalf[firstHalfIndext];
				firstHalfIndext++;
			}

			else {
				a[aIndex] = lastHalf[lastHalfIndex];
				lastHalfIndex++;
			}
			aIndex++;
		}

		while (firstHalfIndext < firstHalf.length) {
			a[aIndex] = firstHalf[firstHalfIndext];
			aIndex++;
			firstHalfIndext++;
		}

		while (lastHalfIndex < lastHalf.length) {
			a[aIndex] = lastHalf[lastHalfIndex];
			aIndex++;
			lastHalfIndex++;
		}
	}
}