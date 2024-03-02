package com.sharma.com.design.behavioural.mediatorDesignPattern.chatMediator;

import com.sharma.designPattern.behavioral.mediatorDesignPattern.mediatorObject.User;

public interface ChatMediator {
    public void sendMeassage(User user, String msg);
    public void addUsers(User user);
}

