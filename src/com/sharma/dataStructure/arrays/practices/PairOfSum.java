package com.sharma.dataStructure.arrays.practices;

import java.util.HashSet;
import java.util.Set;

public class PairOfSum {
    public static void main(String[] args) {
        int a[] = {1,23,2,12,3,7,6,90,2,56,8};
        //In the bellow approach complexity is O(n^2)
        String s = pairSums(a,9);
        System.out.println(s);

        //

        String s1 = pairsSums(a,9);
        System.out.println(s1);
    }

    // O(n^2)
    private static String pairSums(int[] a,int sum){
        String res = "";
        for(int i =0;i<a.length-1;i++)
            for(int j =0;j<a.length-1;j++)
                if ( (a[i]+a[j]) == sum )
                    res += "{"+a[i]+","+a[j]+"}";
        return res;
    }

    private static String pairsSums(int[] a,int sum){
        String res = "";
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : a)
            set.add(i);
        for (int j=0;j<a.length;j++)
            if (set.contains(sum-a[j]))
                res += "{"+j+","+a[j]+"}";
            return  res;

    }



}
