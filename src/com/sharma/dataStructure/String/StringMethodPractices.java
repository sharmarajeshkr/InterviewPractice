package com.sharma.dataStructure.String;

public class StringMethodPractices {
    public static void main(String[] args) {
        String str = "Kumar Sharma";
        lowerCase(str);
        upperCase(str);
        countVowelAndConsonents(str);
        boolean validate = validateString(str);
        System.out.println(validate); // "Kumar@12" : False  "Kumar12" : True

        reverseString(str);

        // Checking Palindrom and find Greater String
        String str1 = "Psinter";
        String str2 = "Painter";
        checkPalindrom(str1,str2);

        String str3 = "decimal";
        String str4 = "mewical";
        anagram(str3,str4);
    }

    private static void findLength(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            i++;
        }
        System.out.println("Length is " + i);
    }

    private static void lowerCase(String str) {
        char a[] = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char) (a[i] + 32);
            }
        }
    }

    private static void upperCase(String str) {
        char a[] = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] = (char) (a[i] - 32);
            }
        }
    }

    private static void countVowelAndConsonents(String str) {
        char[] c = str.toCharArray();
        int cons = 0, vowel = 0;
        for (int i = 0; i < c.length; i++)
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
                vowel++;
            else
                cons++;
        System.out.println("Counsonent " + cons + " Vowel " + vowel);
    }

    private static boolean validateString(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++)
            if (!(a[i] >= 65 && a[i] <= 90) && !(a[i] >= 97 && a[i] <= 122) && !(a[i] >= 48 && a[i] <= 57))
                return false;
        return true;
    }

    private static void reverseString(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length / 2; i++) {
            char temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }

    private static void checkPalindrom(String str1, String str2) {
        if (str1.length() != str2.length())
            checkBiggerString(str1,str2);
        else {
            checkBiggerString(str1,str2);
        }
    }
    private static void checkBiggerString(String str1, String str2) {
        char a1[] = str1.toCharArray();
        char a2[] = str2.toCharArray();
        int j = 0;
        int i = 0;
        for (i = 0; i < a1.length; i++)
            if (a1[i] == a2[j]) {
                j++;
            } else {
                System.out.println("Not Palindrom");
                break;
            }
        // Extra : To check which string is bigger
        if ((i == j) &&(i==a1.length))
            System.out.println("Both String is equal and Palindrom");
        else if (a1[i] > a2[j]  ) {
            System.out.println(" Biggest String is " + str1);
        } else
            System.out.println(" Biggest String is " + str2);
    }

    private static void anagram(String str,String str2){
        int []c = new int [26];
        char a1[] = str.toCharArray();
        for(int i=0;i<a1.length;i++) {
            int asci = a1[i] - 97;
            if (c[asci] != 0)
                c[asci] += 1;
            else
                c[asci] = 1;
        }
        // Check whether character is available in hashtable
        char a[] = str2.toCharArray();
        for (int i = 0;i<a.length;i++) {
            int asci = a[i] - 97;
            if (c[asci] != 0)
                c[asci] -= 1;
            else {
                System.out.println("String is not anagram");
                break;
            }
        }

        }

}
