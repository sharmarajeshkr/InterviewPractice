package com.sharma.com.design.designPattern.miscellaneous.DI.messageInjector;

import com.sharma.com.design.designPattern.miscellaneous.DI.MyApplication;
import com.sharma.com.design.designPattern.miscellaneous.DI.consumer.Consumer;
import com.sharma.com.design.designPattern.miscellaneous.DI.messageService.EmailServiceImpl;

public class EmailServiceInjector implements  MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        Consumer c =   new MyApplication(new EmailServiceImpl());
        return c;
    }
}
