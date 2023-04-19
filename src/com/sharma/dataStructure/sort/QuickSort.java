package com.sharma.dataStructure.sort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

/*

QuickSort is a Divide and Conquer algorithm.
It picks an element as pivot and partitions the given array around the picked pivot.
There are many different versions of quickSort that pick pivot in different ways.

    1. Always pick first element as pivot.
    2. Always pick last element as pivot (implemented below)
    3. Pick a random element as pivot.
    4. Pick median as pivot.




    Quick sort :    All the elements in Left side from   X (index/value) are smaller
                    All the elements in Right side  from   X (index/value) are Greater

                    Smallest Value( Left Hand) <-------  X ---------> Greater Value (Right Hand)


 */
public class QuickSort {
    QuickSort(){
        System.out.println("Hello");
    }
    QuickSort q = new QuickSort();

    public static void main(String[] args) throws ParseException{


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy G");
        Date par = null;

            par = sdf.parse("30/01/-2020 AD");

       // System.out.println(sdf.format(par));

       /* System.out.println(Pattern.matches("^[^\\d].*","123abc"));
        System.out.println(Pattern.matches("^[^\\d].*","abc123"));
        System.out.println(Pattern.matches("(^[^\\d].*)(\\d)","123abcxyz"));
        System.out.println(Pattern.matches("(^[^\\d].*)(\\d)","abc123xys"));*/

        int j = 0;
        char c[] = {'a','d','e','i','k','n','V','v'};
        char mov[] = {6,5,4,3,10,4,5,3,5,3,1,7};
        for(char m : mov){
            j += m;
            j %= c.length;
           // System.out.println(c[j]);

        }

        //QuickSort x = new QuickSort();

    int a = 260;
        byte b = (byte)a;
     //   System.out.println(b);


       // Arrays.parallels
       // int a1 = Integer.parseInt("10.87");
        //System.out.println( a1);


       /* double d = 20.324;
        int sum = 6;
        float f = 5.1f;
        System.out.println(d+sum+f);*/

        ArrayList ona = new ArrayList();
        ona.add("A");
        ona.ensureCapacity(3);
        System.out.println(ona.size());





















        int A[] = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3,Integer.MAX_VALUE};
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = A.length;

        sort(A, 0, n-1);

        System.out.println("sorted array");
        printArray(A);

    }
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */

    static int partitionTest(int A[],int l,int h){
        int pivot=A[l];
        int i=l,j=h;
        do
        {
            do{
                i++;
            }while(A[i]<=pivot );
            //System.out.println(A[i]<=pivot);

            do{j--;}
            while(A[j]>pivot);
            //System.out.println(A[j]>pivot);
            if(i<j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }while(i<j);
        int temp = A[l];
        A[l] = A[j];
        A[j] = temp;


        return j;
    }

    private static  int partElement(int a[], int low, int high){
        int pivot = a[low];
        int i = low;
        int j = high;

        do{
            do { i++; } while (a[i] <= pivot);
            do { j--; } while (a[j] > pivot);
            if (i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }while (i < j);
        int temp = a[low];
        a[i] = a[j];
        a[j] = temp;

        return j;
    }


    private static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
          arr[] --> Array to be sorted,
          low  --> Starting index,
          high  --> Ending index */
   private static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partitionTest(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi);
            sort(arr, pi+1, high);
        }
    }


    /* A utility function to print array of size n */
   private static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


}
