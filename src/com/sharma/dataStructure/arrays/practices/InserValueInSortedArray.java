package com.sharma.dataStructure.arrays.practices;

public class InserValueInSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 20, 30, 40, 50, 60, 78, 88,0};
        insertValueSortedArray(a,5);
        displayArray(a);


    }
    /*
        Insert value in the sorted array,
            1. Array are fix in size befor we use we have to specify size
            2 . Once the size is defined it will store the default value based on the datatype
            3. In the operation we have to insert value in the middle
                1 .  way is create Auxiliary array with size = provided array size+1
                2 . Hard code value 0 in the last position assuming space is empty and after shift operation
                    0 will be occupied with previous values. (Below code)
     */
    // Time Complexity : 0(n)
    private static void insertValueSortedArray(int []array,int value){
        int arrLen = array.length-1;
        int i=0;
        for (i = arrLen;i>0;i--)
            if( array[i] > value && array[i] >0 )
                array[i] = array[i-1] ;
        if(array[i+1] < value)
            array[i+1] = value;

    }

    // Time Complexity : 0(n)
    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
