package com.sharma.com.design.behavioural.mediatorDesignPattern.mediatorObject;

import com.sharma.designPattern.behavioral.mediatorDesignPattern.chatMediator.ChatMediator;

public class UserMediatorImpl extends User{

    public UserMediatorImpl(ChatMediator chatMediator,String name){
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.uname+": Sending Message="+msg);
        chatMediator.sendMeassage(this,msg);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(this.uname+": Received Message:"+msg);
    }
}
