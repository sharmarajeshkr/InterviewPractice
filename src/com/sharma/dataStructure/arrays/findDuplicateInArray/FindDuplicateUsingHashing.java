package com.sharma.dataStructure.arrays.findDuplicateInArray;
// This will work for sorted and un-sorted array
public class FindDuplicateUsingHashing {
    public static void main(String[] args) {
       // int a[] = {2,4,5,5,7,8,8,8,9,11};
          int a[] = {8,3,6,4,6,5,6,8,2,7};
        int index = getMax(a);
        findDuplicate(index,a);

    }
    // Time Complx : 0(n)
    private static int getMax(int a[]){
        int maxNumber = 0;
        for(int i=0;i<a.length;i++)
            if (a[i] > maxNumber)
                maxNumber = a[i];
        return maxNumber;
    }
    // Time Complx : 0(n)
    private static void findDuplicate(int index,int a[]){
        int c[] = new int[index+1];
        for(int i=0;i<a.length;i++){
            if (c[a[i]] != 0)
                c[a[i]] += 1;
            else c[a[i]] = 1;
        }
        displayCount(c);
    }
    // Time Complx : 0(n)
    private static void displayCount(int a[]){
        for(int i=0;i<a.length;i++)
            if(a[i] >1)
                System.out.println(i +"-- count "+ a[i]);
    }



}
