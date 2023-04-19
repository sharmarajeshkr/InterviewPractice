package com.sharma.dataStructure.arrays.missingElement;

public class NotNaturalNumberSingleMissingValue {
    /*
    Time Complex : 0(n)
     Subtract array value with index
     (Approach : 1.  All the diff must be same till the missing element)
                 2.  Once Missing value is index found
                 3.  Missing Value = (value at index 0) + (index : Where missing difference found)
    */
    public static void main(String[] args) {
        int a[] = {6,7,8,9,10,11,12,13,15};
        int low = a[0];
        int missingValue  = 0;
        for(int i=0;i<a.length;i++)
            if ( ( a[i]-i) != low) {
                missingValue = low + i;
                break;
            }
        System.out.println("Missing Value is "+missingValue);


    }
}
