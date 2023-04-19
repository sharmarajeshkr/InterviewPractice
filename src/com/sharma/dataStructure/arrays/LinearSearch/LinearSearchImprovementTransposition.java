package com.sharma.dataStructure.arrays.LinearSearch;

public class LinearSearchImprovementTransposition {
    public static void main(String[] args) {
        LinearSearchImprovementTransposition ls = new LinearSearchImprovementTransposition();
        int arr[] = {32, 54, 76, 1, 5, 23, 90, 4};
        /* Linear Search Improvement
     1 . Transposition : Searching for the key repetatily : Every time move the key to 1 step up
        Time Complexcoty varies from Best Case :0(1) : Searchinf same key again and agin
        Worst Case : 0(n) : Search for the new key
     */
        int indexTranspositionSearch = ls.linearSearchTransposition(arr, 4);
        System.out.println("First time :  Linear Search using Transposition Element found at index " + indexTranspositionSearch);

        // Searching Same key again and again
        ls.linearSearchTransposition(arr, 4);
        ls.linearSearchTransposition(arr, 4);
        ls.linearSearchTransposition(arr, 4);

        indexTranspositionSearch = ls.linearSearchTransposition(arr, 4);
        System.out.println("After multiple time :  Linear Search using Transposition Element found at index  " + indexTranspositionSearch);

    }

    /* Linear Search Improvement
     1 . Transposition : Searching for the key repeatedly : Every time move the key to 1 step up
        Time Complexity varies from Best Case :0(1) : Searching same key again and again
        Worst Case : 0(n) : Search for the new key
     */
    private int linearSearchTransposition(int[] array, int elemntToSearch) {
        for (int i = 0; i < array.length - 1; i++)
            try {
                if (elemntToSearch == array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    return i;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return i;
            }
        return -1;
    }
}
