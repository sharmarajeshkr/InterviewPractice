package com.sharma.com.design.miscellaneous.DI.messageInjector;

import com.sharma.designPattern.miscellaneous.DI.MyApplication;
import com.sharma.designPattern.miscellaneous.DI.consumer.Consumer;
import com.sharma.designPattern.miscellaneous.DI.messageService.MessageService;
import com.sharma.designPattern.miscellaneous.DI.messageService.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new SMSServiceImpl());
    }
}
