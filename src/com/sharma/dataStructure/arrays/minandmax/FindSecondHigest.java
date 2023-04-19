package com.sharma.dataStructure.arrays.minandmax;

public class FindSecondHigest {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 1, 7, 8, 9, 11, 6,-1,90,-10,3,899};

        int highestMax = 0;
        int secondMax = 0;

        for ( int i = 0; i<a.length;i++){
            if (a[i] > highestMax){
                secondMax = highestMax;
                highestMax = a[i];
            }
        }

        System.out.println(highestMax +"--"+ secondMax);



    }
}
