package com.sharma.dataStructure.search;

import java.util.Arrays;

public class SearchAlgo {
    public static void main(String[] args) {
        // int a[] = {15, -1, 10, 68, 2, -7};
        int a[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        Arrays.sort(a);
        int index =
                // linearSearch(a,68);
                //  binarySearch(a,0,a.length,68);
                jumpSearch(a, 610);
        System.out.println(index);
    }

    private static int linearSearch(int[] a, int searchElement) {
        for (int i = 0; i <= a.length; i++)
            if (a[i] == searchElement)
                return i;
        return -1;
    }

    private static int binarySearch(int[] a, int lower, int higher, int searchElement) {
        while (lower <= higher) {
            int mid = (lower + higher) / 2;
            if (a[mid] == searchElement)
                return mid;
            else if (a[mid] > searchElement)
                return binarySearch(a, mid - 1, higher, searchElement);
            else
                return binarySearch(a, mid + 1, higher, searchElement);
        }
        return -1;
    }

    private static int jumpSearch(int[] a, int searchElement) {
        int step = (int) Math.floor(Math.sqrt(a.length));
        for (int i = 0; i < a.length; ) {
            if (i > 0)
                step += step;
            if (step > a.length)
                step = a.length;
            for (int j = i; j < step; j++)
                if (a[j] == searchElement)
                    return j;
                else
                    continue;
            i = step;
        }
        return -1;

    }


}
