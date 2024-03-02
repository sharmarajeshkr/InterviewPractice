package com.sharma.com.design.behavioural.mediatorDesignPattern.mediatorObject;

import com.sharma.designPattern.behavioral.mediatorDesignPattern.chatMediator.ChatMediator;

public abstract class User {
    protected String uname;
    protected ChatMediator chatMediator;

    public User(ChatMediator chatMediator,String name){
        this.uname = name;
        this.chatMediator = chatMediator;
    }

    public abstract void sendMessage(String msg);
    public abstract void receiveMessage(String msg);


}
