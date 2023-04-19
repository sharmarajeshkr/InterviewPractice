package com.sharma.com.design.builderDesignPattern;

/*
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns
when the Object contains a lot of attributes.
-> major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
    Too Many arguments to pass
    Some of the parameters might be optional but in Factory pattern,we are forced to send all the parameters and optional parameters need to send as NULL.
 */

import java.util.ArrayList;
import java.util.List;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues

        /*Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println(comp);*/



        // [{1:2},{2:25},{25:42},{3:42},{42:-1},{6:-1}
        int[] arr =     {1,2,25,3,42,6};
        System.out.println(arr[0]);
        List<String> l = new ArrayList<String>();
        String a = "";
        int val = 0;

               for (int i = 0 ; i<arr.length; i++){
                   int gs = -1;
                   try{
                       for(int j = i+1; j<=arr.length; j++){
                           val = arr[i];
                           gs = arr[j];
                           try{
                               if (arr[i]<arr[j]){
                                   l.add("{"+val+":"+gs+"}");
                                   break;
                               }else if (arr[i]<arr[j+1]) {
                                   l.add("{"+val+":"+arr[j+1]+"}");
                                   break;
                               } else {
                                   gs= -1;
                                   l.add("{"+val+":"+gs+"}");
                               }
                           }catch (ArrayIndexOutOfBoundsException e){
                               gs= -1;
                               l.add("{"+val+":"+gs+"}");
                               // System.out.println(e.toString());
                           }
                       }

                   }catch (ArrayIndexOutOfBoundsException e){
                       l.add("{"+val+":"+gs+"}");
                   }

           }
        System.out.println(l);

    }
}
