package com.sharma.com.design.designPattern.miscellaneous.DI;

import com.sharma.com.design.designPattern.miscellaneous.DI.consumer.Consumer;
import com.sharma.com.design.designPattern.miscellaneous.DI.messageService.MessageService;

public class MyApplication implements Consumer {

    private MessageService messageService;

    public MyApplication(MessageService messageService){
        this.messageService = messageService;
    }

    @Override
    public void processMessages(String msg, String rec) {
        messageService.sendMessage(msg,rec);
    }
}
