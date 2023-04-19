package com.sharma.dataStructure.arrays.missingElement;

/*
    For natural Number :  Find Missing value from List to n numbers
        1. find the sum of n natural number  = n(n+1)/2
        2. find the sum of provided array value
        3 . Missing number is = ( sum of N number - Sum of array numbers)

        Time Complex : 0(n)
 */

public class NaturalNumberSingleMissingValueInSorted {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,8,9,10,11,12};

        int sumArray = 0;
        int n = a[a.length-1];
        int sumNumbers = n*(n+1)/2;
        for(int i=0;i<a.length;i++)
            sumArray += a[i];

        System.out.println("Missing Number is :"+(sumNumbers-sumArray));
    }
}
