package com.sharma.dataStructure.arrays.minandmax;

public class MinAndMax {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 1, 7, 8, 9, 11, 6,-1,90,-10,3,899};
        int min = a[0], max = a[0];

        for(int i = 1;i<a.length;i++)
            if (min > a[i])
                min = a[i];
            else if (max < a[i])
                max = a[i];


        System.out.println("Min Value "+min +" and Value Max "+max);

    }
}
