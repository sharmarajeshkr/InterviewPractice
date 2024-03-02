package com.sharma.com.design.behavioural.mediatorDesignPattern.chatMediator;

import com.sharma.designPattern.behavioral.mediatorDesignPattern.mediatorObject.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    List<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }


    @Override
    public void sendMeassage(User user, String msg) {
        for ( User u : users){
            //message should not be received by the user sending it
            if (u != user)
                u.receiveMessage(msg);
        }
    }

    @Override
    public void addUsers(User user) {
        this.users.add(user);
    }
}
