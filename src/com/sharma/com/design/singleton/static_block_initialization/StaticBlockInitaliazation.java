package com.sharma.com.design.singleton.static_block_initialization;

public class StaticBlockInitaliazation {

    private static StaticBlockInitaliazation instance;

    static {
        try {
            instance = new StaticBlockInitaliazation();
        }catch (Exception e){
            throw  new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private StaticBlockInitaliazation(){}

    public StaticBlockInitaliazation getInstance(){
        return instance;
    }

}
