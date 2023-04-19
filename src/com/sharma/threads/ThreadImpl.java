package com.sharma.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadImpl {

    public static void main(String... args) {
        Thread even= new Thread() {
            public void run(){
                for(int i=0;i<10;i++)
                    if(i%2==0)
                        System.out.println(i);
            }

        };

        Thread odd= new Thread() {
            public void run(){
                for(int i=0;i<10;i++)
                    if(i%2!=0)
                        System.out.println(i);
            }

        };
        even.start();
        odd.start();
    }
}
