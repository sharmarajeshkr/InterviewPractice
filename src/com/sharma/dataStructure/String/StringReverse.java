package com.sharma.dataStructure.String;
// String  Reverse
public class StringReverse {
    public static void main(String[] args) {
        String s1 = "abcd";
        char []result = s1.toCharArray();
        int len = result.length;
        for (int i =0 ;i< len/2;i++){
             char temp = result[len-1-i];
              result[len-1-i] = result[i];
              result[i] = temp;
        }
    }
}
