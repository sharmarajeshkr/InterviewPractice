package com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern.chatMediator;

import com.sharma.com.design.designPattern.behavioral.mediatorDesignPattern.mediatorObject.User;

public interface ChatMediator {
    public void sendMeassage(User user, String msg);
    public void addUsers(User user);
}

