package com.sharma.dataStructure.String;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "java2blog.com ";
        //duplicate character : a ======  count : 2
        //duplicate character : o ======  count : 2
        findDuplicateCharacter(str);

    }

    static void findDuplicateCharacter(String str){

        char [] ch = str.toCharArray();
        int [] aux = new int[256];
        for (int i = 0 ; i< ch.length;i++){
            if (aux[str.charAt(i)] == 0)
                aux[str.charAt(i)] = 1;
            else
                aux[str.charAt(i)] += 1;
        }

        for (int i = 0 ; i< aux.length;i++){
            if (aux[i] >1){
                System.out.println((char) i +" -- "+  aux[i] );
            }
        }

    }

}
