package com.sharma.dataStructure.arrays.LinearSearch;

public class LinearSearchImprovementMoveToHead {
    public static void main(String[] args) {
        LinearSearchImprovementMoveToHead at = new LinearSearchImprovementMoveToHead();
        int arr[] = {32, 54, 76, 1, 5, 23, 90, 4};
        int indexMovetoHead = at.linearSearchMovetoFront(arr, 45);
        System.out.println("First time :  Linear Search using Move to Head Element found at index " + indexMovetoHead);

        // Searching again and again for the same key
        at.linearSearchMovetoFront(arr, 45);
        at.linearSearchMovetoFront(arr, 45);

        indexMovetoHead = at.linearSearchMovetoFront(arr, 45);
        System.out.println("After multiple Search time :  Linear Search using Move to Head Element found at index " + indexMovetoHead);


    }

    /* Linear Search Improvement
     1 . Move to Head or Move to Front : Searching for the key repetatily : Swap element with the first element in the array
        Time Complexcoty varies from Best Case :0(1) : Searching same key again and agin
        Worst Case : 0(n) : Search for the new key
     */
    private int linearSearchMovetoFront(int[] array, int elemntToSearch) {
        for (int i = 0; i < array.length - 1; i++)
            try {
                if (elemntToSearch == array[i]) {
                    int temp = array[0];
                    array[0] = array[i];
                    array[i] = temp;
                    return i;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return i;
            }
        return -1;
    }
}
