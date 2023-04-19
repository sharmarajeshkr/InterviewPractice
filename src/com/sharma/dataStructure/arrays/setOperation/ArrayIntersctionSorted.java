package com.sharma.dataStructure.arrays.setOperation;

public class ArrayIntersctionSorted {
    /*
        // Finding Duplicate Element in array a and array b
        To Perform array Intersection operation on un-sorted arrays,
            Say array a and array b
            Both arrays must be sorted.
    *   Algo : -1. Create new array of size = (size of array a + size of array b)
                2. Take 3 pointer i,j,k
                3. i -> array a at 0 index, j -> array b at 0 index , k -> array c at 0 index
                        (array c is responsible to hold values from array a and array b)
                4. Using loop from k = 0 to k < array c length
                5. compare (array a [index] == array b [index])
                    if True - > copy ( array a [index]  into array c [index])
                        Increment i by 1
                    if False - > Increment i,j by 1
                // Time Complex : 0(n)
         * */
    public static void main(String[] args) {
        int a[] = {3, 5,6, 10, 15,110,115};
        int b[] = {5, 10, 11, 54,78,110,115};
        int c[] = new int[getMaxLen(a,b)];

        sortedInsertionArray(a,b,c);
        displayArray(c);


    }

    private static int getMaxLen(int a[],int b[]){
        if (a.length >= b.length) return a.length;
        return b.length;
    }

    private static void sortedInsertionArray(int a[],int b[],int c[]) {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i >= j) {
       // for(int k=0;k<c.length*2;k++){
            if (i == a.length)
                return;
            if (a[i] == b[j] ) {
                c[index++] = a[i++];
                j++;
            }
            else if (a[i] > b[j])
                j++;
            else if (a[i] < b[j])
                i++;
        }
    }

    private static void displayArray(int c[]){
        for(int i=0;i<c.length;i++)
            if(c[i] != 0)
                System.out.println(c[i]);
    }

}
