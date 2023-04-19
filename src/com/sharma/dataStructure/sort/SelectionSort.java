package com.sharma.dataStructure.sort;

/*
 Step : Time Complex : 0(n^2)
 1 . Take 3 pointer all pointing to index 0
 2 . start i = 0 till length -1
 3 . start j=k=i (Stat with index 0 and increment based on i) till j reaches till length-1
 4 . if ( a[j] < a[k] ) then increment k (Now j and K point to same location)
 5 . Repeat step 4 till condition is false.
 6 . Now k is pointing to the lowest value in the array
 7 . swap i index value with k index value
 8 . at index i array has lowest value (Increment i by 1)
 Method : selectionSort(int a[])

*/

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {8, 6, 3, 2, 5, 4};
        selectionSort(a);
    }

    private static void selectionSort(int a[]) {
        // int[] arr = {8,6,3,2,5,4};
        int i = 0, k = 0, j = 0;
        for (i = 0; i < a.length - 1; i++) {
            for (j = k = i; j < a.length; j++) {
                if (a[j] < a[k])
                    k = j;
            }
            if (a[i] > a[k]) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }

        }
    }


}
