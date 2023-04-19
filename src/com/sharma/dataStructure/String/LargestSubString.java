package com.sharma.dataStructure.String;


// String[] strArr={"java2blog","javaworld","javabean","javatemp"};
 // So Longest common prefix in above String array will be “java” as all above string starts with “java”.


public class LargestSubString {
    public static void main(String[] args) {
        // String[] strArr={"java2blog","javaworld","javabean","javatemp"};
        String[] strArr={"IndianArmy","IndianNavy","IndiaCement"};
        //  compare with 2 String
        String prefix = commonPrefix(strArr);
        System.out.println(prefix);
    }



    static String commonPrefix(String [] strarr){
        String prefixStr = strarr[0];
        for (int i =0 ; i< strarr.length;i++){
            prefixStr = findPrefix(prefixStr,strarr[i]);
        }
        return prefixStr;
    }

    static String findPrefix(String s1,String s2){
        String result = "";
        int n1 = s1.length();
        int n2 = s2.length();
        for(int i =0, j=0; i< n1-1 && j<n2-1; i++,j++){
            if (s1.charAt(i) != s2.charAt(j))
                break;
            result += s1.charAt(i);
        }
        return result;
    }


    static String minString(String[] strArr){
        String minStr = strArr[0];
        for (String s:strArr) {
            if (s.length() < minStr.length())
                minStr = s;
        }
        return minStr;
    }



}
