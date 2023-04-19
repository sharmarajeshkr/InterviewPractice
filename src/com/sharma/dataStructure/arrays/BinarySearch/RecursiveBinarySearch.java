package com.sharma.dataStructure.arrays.BinarySearch;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int array[] = {4, 8, 10, 15, 33, 34, 37, 39, 41, 43, 18, 21, 24, 27, 29};
        /*
            1. Pre Condition : Array or provided list must in the sorted order
            2. Step 1: Take 3 pointer/variable low,high and mid
            3. Step 2: Check whether mid element is the key element
            4. Step 3: if key element is smaller than mid element then assign high = mid - 1
            5. Step 4: if key element is greater than mid element then assign low = mid + 1
            6. Step 5: Repeat the step till key element equals to mid element

            Time Complexity :
                1 . Best Case : 0(1)
                2 . Worst case: 0(log n)
                3 . Unsuccessful Search : 0(log n)
                4 . Avg
         */

        Arrays.sort(array);
        RecursiveBinarySearch bs = new RecursiveBinarySearch();
        bs.binarySearchRecursive(array, 18);
        // Invalid Search
        bs.binarySearchRecursive(array, 13428);

    }

    private void binarySearchRecursive(int[] array, int elementToSearch) {
        int index = binarySearch(0, array.length, array, elementToSearch);
        System.out.println("Element found at index " + index);
    }

    private int binarySearch(int low, int high, int array[], int elementToSearch) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid >= array.length)
                return -1;
            else if (elementToSearch == array[mid])
                return mid;
            else if (elementToSearch > array[mid])
                return binarySearch(mid + 1, high, array, elementToSearch);
            else if (elementToSearch < array[mid])
                return binarySearch(low, mid - 1, array, elementToSearch);
        }
        return -1;
    }
}
