package com.sharma.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SumOfPair {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A, n);
    }

    static void printpairs(int arr[], int sum) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }


    static void sumOfPair() {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < A.length; i++)
            hashSet.add(i);
    }

    int temp ;


}

