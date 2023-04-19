package com.sharma.dataStructure.arrays.rotation;

public class SwapNegativePositiveNumber {
    public static void main(String[] args) {
        int[] a = {1, -11, -20, -3, -4, 5, 6, -78, -8, 10, -45, 67, 22};
        negativePositiveNumber(a);
        displayArray(a);
    }

    private static void negativePositiveNumber(int a[]) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            while (a[i] < 0) i++;
            while (a[j] >= 0) j--;
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

    }

    // Time Complexity : 0(n)
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
