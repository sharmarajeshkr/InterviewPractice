package com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern;

import com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern.chatMediator.ChatMediator;
import com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern.chatMediator.ChatMediatorImpl;
import com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern.mediatorObject.User;
import com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern.mediatorObject.UserMediatorImpl;

public class MediatorDesignPattern {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();

        User u1 = new UserMediatorImpl(chatMediator,"Rajesh");
        User u2 = new UserMediatorImpl(chatMediator,"Sharma");
        User u3 = new UserMediatorImpl(chatMediator,"Ashish");
        User u4 = new UserMediatorImpl(chatMediator,"Pawan");



        chatMediator.addUsers(u1);
        chatMediator.addUsers(u2);
        chatMediator.addUsers(u3);
        chatMediator.addUsers(u4);

        u2.sendMessage("HI All");



    }
}
