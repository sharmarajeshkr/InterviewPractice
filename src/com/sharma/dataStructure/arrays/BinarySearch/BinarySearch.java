package com.sharma.dataStructure.arrays.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {4, 8, 10, 15, 33, 34, 37, 39, 41, 43, 18, 21, 24, 27, 29};
        /*
            1. Pre Condition : Array or provided list must in the sorted order
            2. Step 1: Take 3 pointer/variable low,high and mid
            3. Step 2: Check whether mid element is the key element
            4. Step 3: if key element is smaller than mid element then assign high = mid - 1
            5. Step 4: if key element is greater than mid element then assign low = mid + 1
            6. Step 5: Repeat the step till key element equals to mid element
         */

        Arrays.sort(array);
        BinarySearch bs = new BinarySearch();
        int index = bs.BinarySearch(array, 18);
        System.out.println("Element found at index " + index);
        // Invalid Search
        index = bs.BinarySearch(array, 13428);
        System.out.println("Invalid Search Element found at index " + index);
    }

    // Time Complex : 0(n)
    private int BinarySearch(int[] array, int elementToSearch) {
        int low = 0;
        int high = array.length;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (mid >= array.length)
                return -1;
            else if (elementToSearch == array[mid])
                return mid;
            else if (elementToSearch > array[mid])
                low = mid + 1;
            else if (elementToSearch < array[mid])
                high = mid - 1;
        }
        return -1;
    }
}
