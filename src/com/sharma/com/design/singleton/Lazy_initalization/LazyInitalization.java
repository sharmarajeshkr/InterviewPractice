package com.sharma.com.design.singleton.Lazy_initalization;

public class LazyInitalization {
    private static  LazyInitalization instance;

    private LazyInitalization(){}

    public LazyInitalization getInstance() {
        if(instance == null)
            instance = new LazyInitalization();
        return instance;

    }
}
