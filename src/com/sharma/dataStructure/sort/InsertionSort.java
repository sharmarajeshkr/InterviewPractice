package com.sharma.dataStructure.sort;

/*

    Algorithm
        To sort an array of size n in ascending order:
        1: Iterate from arr[1] to arr[n] over the array.
        2: Compare the current element (key) to its predecessor.
        3: If the key element is smaller than its predecessor, compare it to the elements before.
            Move the greater elements one position up to make space for the swapped element.

        Another Example:
            12, 11, 13, 5, 6

           1.  Let us loop for i = 1 (second element of the array) to 4 (last element of the array)
           2. i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
                11, 12, 13, 5, 6
           3. i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
                11, 12, 13, 5, 6
           4. i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
                5, 11, 12, 13, 6
           5. i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
                5, 6, 11, 12, 13
* */

public class InsertionSort {
    public static void main(String[] args) {
        int A[]={11,13,7,12,16,9,24,5,10,3},n=10,i;
        //insertionSort(a,2);
        insertionSort(A);
    }

    private static void insertionSort(int a[]){
        int n = a.length;
        int j = 0; int key = 0;
        for (int i=1;i<n;i++){
            key = a[i];
            j = i-1;

            while(j > -1 && a[j] > key){
               a[j+1] = a[j];
               j--;
            }
            a[j+1] = key;
        }
    }

}
