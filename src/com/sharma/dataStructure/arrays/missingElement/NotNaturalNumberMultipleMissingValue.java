package com.sharma.dataStructure.arrays.missingElement;

public class NotNaturalNumberMultipleMissingValue {
    /*
    Time Complex : 0(n)
     Subtract array value with index
     (Approach : 1.  All the diff must be same till the missing element)
                 2.  Once Missing value is index found
                 3.  Missing Value = (value at index 0) + (index : Where missing difference found)
                 4.  Repeat the same till difference

     Here Time Complex = 0(n),
        While loop in the for would not be considered since it executed to fill the gap to find missing value.
    */
    public static void main(String[] args) {
        int a[] = {6,7,8,10,11,12,15,16};
        int low = a[0];
        for(int i=0;i<a.length;i++)
            if ( ( a[i]-i) != low) {
                while (low < ( a[i]-i)) {
                    System.out.println("Missing value " + (low + i));
                    low++;
                }
            }
    }
}
