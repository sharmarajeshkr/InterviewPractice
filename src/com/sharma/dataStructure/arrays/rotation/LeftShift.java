package com.sharma.dataStructure.arrays.rotation;

public class LeftShift {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 78, 8};
        // Left Shift
        leftShift(a);
        displayArray(a);

        // Left Shift and Rotate
        letfShfitRotate(a);
        displayArray(a);

    }
    // Time Complexity : 0(n)
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    // Time Complexity : 0(n)
    private static void leftShift(int a[]){
        int arrLength = a.length;
        int i = 0;
        for(i=0;i<arrLength-1;i++)
            a[i] = a[i + 1];
        if (i == arrLength-1)
            a[i] = 0;
    }

    // Time Complexity : 0(n)
    private static void letfShfitRotate(int [] arr){
        int temp = arr[0];
        int i = 0;
        for (i=0;i<arr.length-1;i++)
                arr[i] = arr[i+1];
        if(i== arr.length-1)
            arr[i] = temp;

    }
}
