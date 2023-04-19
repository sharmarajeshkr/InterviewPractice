package com.sharma.search;

public class LinearSearch {
	// Time Complexity of Binary Search O(log n)
	// Array must be sorted order

	private boolean searchLinear(int[] arr, int value) {
		boolean result = false;
		if (arr == null)
			result = false;

		for (int i : arr)
			if (value == i) {
				result = true;
				break;
			}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++)
			arr[i] = i * 2 + 1;

		/*
		 * for (int j : arr) System.out.println(j);
		 */
		LinearSearch ls = new LinearSearch();
		int value = 9;
		if (ls.searchLinear(arr, value))
			System.out.println("Value found ");
		else
			System.out.println("Value not found ");

	}

}
