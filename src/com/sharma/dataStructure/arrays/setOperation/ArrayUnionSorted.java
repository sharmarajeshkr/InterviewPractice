package com.sharma.dataStructure.arrays.setOperation;

public class ArrayUnionSorted {
    /*
        To Perform array union operation on un-sorted arrays,
            Say array a and array b
            Create Auxiliary array c size = size of array a + size of array b
         Step : 1. Copy array a into array c
                2. Take individual element from array b and check whether element is available in array c
                3. If available don't copy
                4. If unavailable then copy the value
        Time Complexity : m + n => n+n => 0(n)
    * */
    public static void main(String[] args) {
        int a[] = {3, 6, 9, 12, 15, 67};
        int b[] = {5, 10, 11, 54, 78};
        int c[] = new int[a.length + b.length];
        mergeSort(a,b,c);
    }

    private static void mergeSort(int a[],int []b, int c[]){
        int i = 0; int j = 0 ;
        for (int k=0;k<c.length-1;k++)
            if (a[i] < b[j])
                c[k] = a[i++];
            else
                c[k] = b[j++];
    }

}
