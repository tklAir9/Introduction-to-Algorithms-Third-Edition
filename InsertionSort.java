//Insertion Sort By Uzair Hasan
//This was converted from pseduocode to Java
public class InsertionSort {
	public static void main(String[] args) {
		int A[] = { 5, 2, 4, 6, 1, 3 }; //Random test array
		int B[] = insertionSort(A);
	}

	public static int[] insertionSort(int[] B) { 
		for (int i = 1; i < B.length; i++) { //Notice that we start from index 1, since starting at 0 would be inefficient
			int key = B[i]; //Remember the current value we are observing
			int j = i - 1; //Move one index back as we will be evaluating whether the value before key is larger
			while (j >= 0 && B[j] > key) { //short circuit if we are out of index of array (-1)
				B[j + 1] = B[j]; // shift the value that is greater than key by one to the right
				j--; //Move the index value one back and repeat while loop
			}
			B[j + 1] = key; // Since whatever was shifted right last has a duplicate in the array and the key value is missng, remove the left dublicated value with key 
		}
		return B;
	}
}

//Any questions, feel free to email me and ask!
//uzairhasan12@hotmail.com
