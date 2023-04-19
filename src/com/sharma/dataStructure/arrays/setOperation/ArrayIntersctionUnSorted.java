package com.sharma.dataStructure.arrays.setOperation;

public class ArrayIntersctionUnSorted {
    /*
        // Finding Duplicate Element in array a and array b
        To Perform array Intersection operation on un-sorted arrays,
            Say array a and array b
            Create Auxiliary array c size = size of array a + size of array b
         Step : 1. Take individual element from array a and array b and check whether element is equal
                2. If True copy element in array c else don't copy
        Time Complexity : m + (m*n) => n+(n^2) => 0(n^2)
    * */
    public static void main(String[] args) {
        int a[] = {3, 6, 9, 10, 15,110};
        int b[] = {5, 10, 11,3, 54, 78};
        int c[] = new int[getMaxLen(a,b)];
        int k =0;
        for(int i = 0;i<a.length;i++)
            for(int j= 0 ; j<b.length;j++)
                if (a[i] == b[j]){
                    c[k] = a[i];
                    k++;
                }
    }

    private static int getMaxLen(int a[],int b[]){
        if (a.length >= b.length) return a.length;
        return b.length;
    }
}
