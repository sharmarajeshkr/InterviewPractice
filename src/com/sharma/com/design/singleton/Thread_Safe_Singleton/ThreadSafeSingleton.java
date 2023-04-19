package com.sharma.com.design.singleton.Thread_Safe_Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public synchronized ThreadSafeSingleton getInstance() {
        if(instance == null)
            instance = new ThreadSafeSingleton();
        return instance;

    }
}
