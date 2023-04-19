package com.sharma.dataStructure.String;

public class StringAnagram {
    public static void main(String[] args) {
        // String word = "java2blog";
        // String anagram = "aj2vabgol";

        String word = "java2blog";
        String anagram = "aj2vabgol";

        boolean[] aux = new boolean[256];
        for( int i = 0; i< word.length();i++){
            //int key = word.charAt(i) - 97;
            aux[word.charAt(i)] = true;
        }

        for( int i = 0; i< anagram.length();i++){
            //int key = anagram.charAt(i) - 97;
            if (aux[word.charAt(i)] == false) {
                System.out.println("Not anagram");
                break;
            }
        }

        // 2 nd way

        System.out.println(isAnagram(word,anagram));
    }
   // String word = "java2blog";
   // String anagram = "aj2vabgol";
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
