package com.sharma.innerClass.annonomusInnerClass;


public class AnnonomusInnerClass {

    public static void main(String[] args) {
        // Overiding taste method instead of implemention by class

        AnnonomusCustomClass a = new AnnonomusCustomClass() {
            public void taste() {
                System.out.println("From class Inner Class");
            }

            ;
        };
        a.taste();

        AnnoInnerInterface ai = new AnnoInnerInterface() {
            @Override
            public void m1() {

            }

            @Override
            public String m2() {
                return null;
            }
        };
        ai.m1();
        ai.m2();


        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Provide implementation for run Method");
            }
        };
        Thread t1 = new Thread(run);
        t1.start();


        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Provide Implementation for run method");
                    }
                }
        );
        t2.start();


        Thread t3 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    if (i % 2 == 0)
                        System.out.println("Even " + i);
            }
        };

        Thread t4 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    if (i % 2 != 0)
                        System.out.println(i);
            }
        };
        t3.start();
        t4.start();
        // Joining the thread to get continus ans
        try {
            t3.join();
            t4.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class AnnonomusCustomClass {
    public void taste() {
        System.out.println("From class A");
    }
}

interface AnnoInnerInterface {
    public void m1();
    public String m2();
}