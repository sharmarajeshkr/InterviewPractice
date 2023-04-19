package com.sharma.dataStructure.arrays.missingElement;
/*
Find Missing value in the unsorted Array
// This Tech work for sorting also to sort the value

Create array of size max number
Store element of array a into array based on index (ie.
//     a[0]  =  2 will store in array b at b[2] = 2
//     a[1]  =  7 will store in array b at b[7] = 7
//     a[2]  =  9 will store in array b at b[9] = 9
//      So on.
// Iterate array b from index 1 till length filter by value have 0
Index have 0 values are the missing number

 // Time Complex : 0(n)

*/

public class FindMissingValueInUnSortedArray {
    public static void main(String[] args) {
        int a[] = {2,7,9,4,11,8,3,5};
        int max = findMaxNumber(a);
        // Create array of size max number
        int b[] = new int[max+1];

        // Store element of array a into array based on index (ie.
        //     a[0]  =  2 will store in array b at b[2] = 2
        //     a[1]  =  7 will store in array b at b[7] = 7
        //     a[2]  =  9 will store in array b at b[9] = 9
        //      So on.
        // Iterate array b from index 1 till length filter by value have 0
        // Index have 0 values are the missing number
        // This Tech work for sorting also to sort the value
        hashTableStore(a,b);
        displayValues(b);
    }
    // Time Complex : 0(n)
    private static int findMaxNumber(int a[]){
        int temp = a[0];
        for (int i= 0 ;i<a.length;i++)
            if (temp < a[i])
                temp = a[i];
        return temp;
    }
    //Time Complex : 0(n)
    private static void hashTableStore(int a[],int b[]){
        for (int i=0;i< a.length;i++)
            b[a[i]] = a[i];
    }
    //Time Complex : 0(n)
    private static void displayValues(int a[]){
        for (int i=0;i< a.length;i++)
            if(a[i] == 0 && i != 0)
                System.out.println(i);
    }



}
