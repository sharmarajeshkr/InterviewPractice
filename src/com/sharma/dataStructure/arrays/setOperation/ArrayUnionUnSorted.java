package com.sharma.dataStructure.arrays.setOperation;

public class ArrayUnionUnSorted {
    /*
        To Perform array union operation on un-sorted arrays,
            Say array a and array b
            Create Auxiliary array c size = size of array a + size of array b
         Step : 1. Copy array a into array c
                2. Take individual element from array b and check whether element is available in array c
                3. If available don't copy
                4. If unavailable then copy the value

        Time Complexity : m + (m*n) => n+(n^2) => 0(n^2)
    * */
    public static void main(String[] args) {
        int a[] = {3, 6, 9, 12, 15, 67};
        int b[] = {5, 10, 11, 54, 78};
        int c[] = new int[a.length + b.length];


        int index = copyArray(a, c);
        arrayUnion(b, c, index-1);
        display(c);

    }

    private static int copyArray(int[] a, int[] c) {
        int i = 0;
        for (i = 0; i < a.length; i++)
            c[i] = a[i];
        return i;
    }

    private static void arrayUnion(int[] b, int[] c, int index) {
        for (int i = 0; i < b.length; i++){
                c[index+1] = b[i];
                index++;
        }
    }

    private static void display(int c[]){
        for(int i=0;i<c.length;i++)
            System.out.println(c[i]);
    }


}
