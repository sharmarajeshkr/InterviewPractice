package com.sharma.com.design.miscellaneous.DI.ClientCode;

import com.sharma.designPattern.miscellaneous.DI.consumer.Consumer;
import com.sharma.designPattern.miscellaneous.DI.messageInjector.EmailServiceInjector;
import com.sharma.designPattern.miscellaneous.DI.messageInjector.MessageServiceInjector;
import com.sharma.designPattern.miscellaneous.DI.messageInjector.SMSServiceInjector;

public class AppClient {
    public static void main(String[] args) {
        // Using DI

        String msg = "Hi Sharma";
        String email = "sharma@abc.com";
        String phone = "999999999";
        // Injecting Service using DI

        MessageServiceInjector injector = null;
        Consumer consume = null;

        //Send email
        injector = new EmailServiceInjector();
        consume = injector.getConsumer();
        consume.processMessages(msg, email);


        //SMS Sent
        injector = new SMSServiceInjector();
        consume = injector.getConsumer();
        consume.processMessages(msg, email);




    }
}
