package com.sharma.dataStructure.arrays.sorted;

public class ArraySorted {
    public static void main(String[] args) {
        // Validate array is sorted or not
        int[] a = {1, 20, 30, 40, 50, 60, 78, 88};
        System.out.println("With sorted array "+isSorted(a));

        int[] b = {1, 20, 30, 400, 50, 60, 78, 88,0};
        System.out.println("With sorted array "+isSorted(b));

        String  testa = "aaa";
        testa.length();


    }
    // Time complxity : 0(n)
    private static boolean isSorted(int a[]){
        for(int i=0;i<a.length-1;i++)
            if (a[i] > a[i+1])
                return false;
            return true;
    }
}
