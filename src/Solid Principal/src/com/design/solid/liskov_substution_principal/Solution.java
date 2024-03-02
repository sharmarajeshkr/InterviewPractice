package com.design.solid.liskov_substution_principal;

public class Solution {

    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int max_len = 1;
        int n = s.length();
        int st = 0, end = 0;
            // Even length
            for(int i = 0; i < n-1; ++i){
                int l = i;
                int r = 0;
                if (n%2 == 0)
                     r = i + 1;
                else
                     r = i;

                while(l >= 0 && r < n){
                    if(s.charAt(l) == s.charAt(r)){
                        l--; r++;
                    }else
                        break;
                }
                int len = r-l-1;
                if(len > max_len){
                    max_len = len;
                    st = l+1;
                    end = r-1;
                }
            }
        Integer out = (s.substring(st, end + 1)).length();
        return out.toString();
    }

    public static void main(String[] args) {
        String input = "badad"; // cbbd
       String s =  new Solution().longestPalindrome(input);
        System.out.println(s);
    }


}