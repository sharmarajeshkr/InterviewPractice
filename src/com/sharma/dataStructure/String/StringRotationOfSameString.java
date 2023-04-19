package com.sharma.dataStructure.String;



// java2blog and blogjava2 are rotation of each other.
//
//java2blog and avablog2j are not rotation of each other.


public class StringRotationOfSameString {
    public static void main(String[] args) {
        System.out.println("java2blogjava2blog");
        System.out.println(new StringBuffer("java2blog").reverse());
        System.out.println(
                "java2blog and blogjava2 are rotation of each other : " + isRotation("java2blog", "blogjava2"));
        System.out.println(
                "java2blog and avablog2j are rotation of each other : " + isRotation("java2blog", "avablog2j"));
    }

    static boolean isRotation(String s1,String s2){
        boolean result = true;
        String s = s1+s1;
        if(!s.contains(s2))
            result = false;

            return result;
    }
}

