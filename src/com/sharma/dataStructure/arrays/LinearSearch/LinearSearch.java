package com.sharma.dataStructure.arrays.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int arr[] = {32, 54, 76, 1, 5, 23, 90, 4};

        System.out.println("##########  Linear Search  ##########");
        // Time Complexcoty varies from Best Case :0(1) - Worst Case : 0(n)
        int index = ls.linearSearch(arr, 124);
        System.out.println(" Provided Element found at index " + index);


    }

    /*
     Linear Seach : Search the element in the Array one-by-one on successful
     Search return index position where its found
     UnSuccessfull Search return -1
     Time Complexcoty varies from Best Case :0(1) - Worst Case : 0(n)*/
    private int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length - 1; i++)
            if (elementToSearch == array[i])
                return i;
        return -1;
    }
}
