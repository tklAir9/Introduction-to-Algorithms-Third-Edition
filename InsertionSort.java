
public class InsertionSort {
	public static void main(String[] args) {
		int A[] = { 5, 2, 4, 6, 1, 3 };
		int B[] = insertionSort(A);
		for (int ii = 0; ii < B.length; ii++) {
			System.out.println(B[ii]);
		}
	}

	public static int[] insertionSort(int[] B) {
		for (int i = 1; i < B.length; i++) {
			int key = B[i];
			int j = i - 1;
			while (j >= 0 && B[j] > key) {
				B[j + 1] = B[j];
				j--;
			}
			B[j + 1] = key;
		}
		return B;
	}
}
