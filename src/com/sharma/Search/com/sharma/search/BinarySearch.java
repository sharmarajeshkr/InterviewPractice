package com.sharma.Search.com.sharma.search;

public class BinarySearch {

    private static int binarySearch(int arr[], int value) {
        try {
            int min = 0;
            int max = arr.length;
            int mid = 0;
            int step = 0;

            while (max >= min) {
                mid = (max + min) / 2;
                step++;
                if (arr[mid] == value) {
                    System.out.println("Search Item found in Step " + step);
                    return mid;
                } else if (arr[mid] > value)
                    max = mid - 1;
                else min = mid + 1;
            }

        } catch (Exception e) {
            return -1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = i * 2 + 1;

        /*
         * for (int j : arr) System.out.println(j);
         */

        int target = 9; // 11 9
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element is not present in the given array.");
        } else {
            System.out.println("Element is present at index:" + result);
        }


    }

}
