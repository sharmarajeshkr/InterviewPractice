package com.sharma.dataStructure.arrays.setOperation;

public class ArrayDiffernceUnSorted {
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
        int a[] = {6,3, 9, 15,10, 67};
        int b[] = {5, 10, 3,11, 54, 78};
        int c[] = new int[a.length + b.length];
        // Not Eorkiing

        int index = copyArray(a, c);
        differnceArrayUnSorted(b, c,index);
        displayArray(c);

    }

    private static void differnceArrayUnSorted (int []b,int c[],int index){
        int clen = index;
        int j=0;
        for (int i = 0;i<b.length;i++){

            if (b[i] != c[j]){
                c[clen] = b[i];
                clen++;
            }else{
                j++;
            }
        }

    }

    private static int copyArray(int[] a, int[] c) {
        int i = 0;
        for (i = 0; i < a.length - 1; i++)
            c[i] = a[i];
        return i;
    }


    private static void displayArray(int c[]){
        for(int i=0;i<c.length;i++)
            if(c[i] != 0)
                System.out.println(c[i]);
    }

}
