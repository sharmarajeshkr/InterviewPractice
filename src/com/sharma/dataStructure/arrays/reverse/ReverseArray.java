package com.sharma.dataStructure.arrays.reverse;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 78, 8};
        int arrLength = a.length;
        int[] b = new int[arrLength];
        // Using extra array to store the reverse array
        reverseArrayAuxlaryArray(a, b);
        displayArray(b);
        // Using same array : process and reverse
        reverseArray(a);
        displayArray(a);

    }

    // Reverse Array
    // Time Complexity : 0(n)
    private static void reverseArrayAuxlaryArray(int[] array1, int[] array2) {
        int arrLength = array1.length;
        for (int i = 1; i <= arrLength; i++)
            array2[i - 1] = array1[arrLength - i];
    }
    // Time Complexity : 0(n)
    private static void reverseArray(int[] arr) {
        int arrLength = arr.length;
        for (int i = 1; i <= arrLength / 2; i++) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[arrLength - i];
            arr[arrLength - i] = temp;
        }
    }
    // Time Complexity : 0(n)
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }


}
