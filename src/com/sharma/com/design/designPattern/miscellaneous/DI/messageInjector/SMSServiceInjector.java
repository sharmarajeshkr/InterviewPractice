package com.sharma.com.design.designPattern.miscellaneous.DI.messageInjector;

import com.sharma.com.design.designPattern.miscellaneous.DI.MyApplication;
import com.sharma.com.design.designPattern.miscellaneous.DI.consumer.Consumer;
import com.sharma.com.design.designPattern.miscellaneous.DI.messageService.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new SMSServiceImpl());
    }
}
