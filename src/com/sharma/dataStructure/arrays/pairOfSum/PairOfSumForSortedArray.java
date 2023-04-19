package com.sharma.dataStructure.arrays.pairOfSum;

public class PairOfSumForSortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6,8,9,10,12,14};

        int i =0; int j = a.length-1;
        int sumPair = 10;
        while (i!=j){
            int res = a[i] + a[j];
            if ( res == sumPair ){
                System.out.println( a[i] +"---"+ a[j]);
                i++;
            }else if (res > sumPair) j--;
            else i++;

        }

    }
}
