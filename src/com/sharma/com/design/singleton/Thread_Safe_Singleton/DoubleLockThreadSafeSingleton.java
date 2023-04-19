package com.sharma.com.design.singleton.Thread_Safe_Singleton;

public class DoubleLockThreadSafeSingleton {
    private static DoubleLockThreadSafeSingleton instance;

    private DoubleLockThreadSafeSingleton(){}

    public  DoubleLockThreadSafeSingleton getInstance() {
        if(instance == null){
            synchronized (DoubleLockThreadSafeSingleton.class){
                if(instance == null){
                    instance = new DoubleLockThreadSafeSingleton();
                }
            }
        }


        return instance;

    }
}
