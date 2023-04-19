package com.sharma.search;

public class JumpSearch {
	// Jump Search Algorithm is a relatively new algorithm for searching an element
	// in a sorted array.
	
	/*
	 * STEP 1: Jump from index 0 to index 4; STEP 2: Jump from index 4 to index 8;
	 * STEP 3: Jump from index 8 to index 12; STEP 4: Since the element at index 12
	 * is greater than 55 we will jump back a step to come to index 8. STEP 5:
	 * Perform linear search from index 8 to get the element 55.
	 */
	
	public static int jumpSearch(int[] arr, int x) {
		int n = arr.length;

		// Finding block size to be jumped
		int step = (int) Math.floor(Math.sqrt(n));

		// Finding the block where element is
		// present (if it is present)
		int prev = 0;
		int a = Math.min(step, n);
		while (arr[a - 1] < x) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}

		// Doing a linear search for x in block
		// beginning with prev.
		while (arr[prev] < x) {
			prev++;

			// If we reached next block or end of
			// array, element is not present.
			if (prev == Math.min(step, n))
				return -1;
		}

		// If element is found
		if (arr[prev] == x)
			return prev;

		return -1;
	}

	// Driver program to test function
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
		int x = 55;

		// Find the index of 'x' using Jump Search
		int index = jumpSearch(arr, x);

		// Print the index where 'x' is located
		System.out.println("\nNumber " + x + " is at index " + index);
	}
}