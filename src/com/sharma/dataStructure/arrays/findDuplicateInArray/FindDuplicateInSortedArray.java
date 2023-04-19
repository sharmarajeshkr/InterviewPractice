package com.sharma.dataStructure.arrays.findDuplicateInArray;


public class FindDuplicateInSortedArray {
    public static void main(String[] args) {
        int a[] = {2,4,5,5,7,8,8,8,9,11};
        int count =0;
        System.out.println("Find Duplicate");
        findDuplicate(a);
        System.out.println("Duplicate with count");
        findDuplicateWithCount(a);


    }
    // Time Compl : 0(n)
    private static void findDuplicate(int a[]){
        int duplicateValue = 0;
        for(int i=0;i<a.length-1;i++)
            if (a[i] == a[i + 1] && a[i] != duplicateValue){
                System.out.println(a[i]);
                duplicateValue = a[i];
            }
    }
    // Time Compl : 0(n)
    private static void findDuplicateWithCount(int a[]){
        int j = 0;
        for (int i=0;i<a.length-1;i++)
            if(a[i] == a[i+1]){
                j = i+1;
                while (a[j] == a[i]) j++;
                System.out.println("Duplicate Value "+a[i] +" Number of times : "+ (j-i));
                i = j-1;
            }
    }


}
