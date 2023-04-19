package com.sharma.dataStructure.arrays.rotation;

public class RightShift {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 78, 8};
        int arrLength = a.length-1;
        // Time Complexity : 0(n)
        int i = 0;
        for(i=arrLength;i>0;i--)
            a[i] = a[i-1];
        if (i == 0)
            a[i] = 0;
        displayArray(a);

    }
    // Time Complexity : 0(n)
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
