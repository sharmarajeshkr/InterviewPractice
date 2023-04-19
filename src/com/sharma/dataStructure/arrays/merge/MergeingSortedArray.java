package com.sharma.dataStructure.arrays.merge;

public class MergeingSortedArray {
    /* MergeArray : On Sorted Individual array say array a and array b, Store the merged array in the new array c
        Size of array c is size = (size of array a + size of array b)
    *   Algo : -1. Create new array of size = (size of array a + size of array b)
                2. Take 3 pointer i,j,k
                3. i -> array a at 0 index, j -> array b at 0 index , k -> array c at 0 index
                        (array c is responsible to hold values from array a and array b)
                4. Using loop from k = 0 to k < array c length
                5. compare (array a [index] < array b [index])
                    if True - > copy ( array a [index]  into array c [index])
                        Increment i by 1
                    if False - > copy ( array b [index]  into array c [index])
                        Increment j by 1
                // Time Complex : 0(n)
    * */
    // Time Complex : 0(n)
    public static void main(String[] args) {
        int a[] = {3,6,9,12,15,67};
        int b[] = {5,10,11,54,78};
        int c[] = new int[a.length+b.length];
        int i = 0;
        int j = 0;

        for (int k=0;k<c.length-1;k++){
            if (a[i] < b[j]) {
                c[k] = a[i]; i++;
            }else{
                c[k] = b[j]; j++;
            }
        }

    }
}
