package com.sharma.dataStructure.sort;

// Time Comple : 0(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-64,25,65,12,22,11};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
        for(int i : arr)
            System.out.println(i);
    }
}
