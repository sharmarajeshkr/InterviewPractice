package com.sharma.dataStructure.String;

public class StringUniqueCharacter {
    public static void main(String[] args) {
        System.out.println("java2blog has all unique chars : "+ hasAllUniqueChars("java2blog"));
        System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
        System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
        System.out.println("world has all unique chars : "+ hasAllUniqueChars("world"));
    }

    static boolean hasAllUniqueChars(String str){
        boolean result = true;
        char [] ch = str.toCharArray();
        char [] aux = new char[256];
        for (int i = 0 ; i< ch.length;i++){
            if (aux[str.charAt(i)] == 0)
                aux[str.charAt(i)] = 1;
            else
                aux[str.charAt(i)] += 1;
        }

        for (int i = 0 ; i< ch.length;i++){
            if (aux[str.charAt(i)] > 1)
                result = false;
            }
        return result;
        }


}
