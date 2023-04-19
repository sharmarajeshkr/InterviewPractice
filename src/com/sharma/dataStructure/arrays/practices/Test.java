package com.sharma.dataStructure.arrays.practices;

public class Test {
    public static void main(String[] args) {
        String st1 = "abnsdefsdekfdjfhec";
        String st2 = "abcde";

        char[] c1 = st1.toCharArray();
        char[] c2 = st2.toCharArray();

        int i = 0;
        int j = 0;

        while (j != c1.length && i != c2.length){
            if (c2[i] == c1[j]){
                i++; j =0;
            }else{
                j++;
            }
        }
    }

}
