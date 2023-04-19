package com.sharma.com.design.designPattern.creation.singleton;

/*
    Singleton Design Pattern : 1 . Restrict class Initialization and ensure only 1 object is created.
    Types : Eager Initialization : If singleton class is not using lot of resource (DB Connection,FileSystem)
            static block Initialization : Same as Eager extra : Exception Handling.
            Lazy Initialization : This Implementation work fine in single threaded Environment.
            Thread Safe : This Implementation work fine in multi threaded Environment.
                Double Checked locked :
            Bill Pugh Singleton


    Way :   1. Class must be public<Access modifier>
            2. Attribute must be static and class type
            3. private constructor
            4. method that responsible to create object and return object

*/
public class Singleton{}


 class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return  instance;
    }
}


class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            System.out.println("Exception occurred while creating instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return  instance;
    }

}

class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if ( instance == null)
            instance = new LazySingleton();

        return  instance;
    }
}


class ThreadSafeSingletion{
    private static ThreadSafeSingletion instance;
    private ThreadSafeSingletion(){}

    // Thread Safe
    public synchronized static ThreadSafeSingletion getInstance(){
        if ( instance == null)
            instance = new ThreadSafeSingletion();

        return instance;
    }

    // Using double checked locked
    public static  ThreadSafeSingletion getInstanceUsingDoubleLocking(){
        if (instance == null) {
            synchronized (ThreadSafeSingletion.class){
                if (instance == null)
                     instance = new ThreadSafeSingletion();
            }
        }
        return  instance;
    }

}


class BillPughSingleton{
    private BillPughSingleton(){}

    private static class SingletonHelper{
      private  static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}









