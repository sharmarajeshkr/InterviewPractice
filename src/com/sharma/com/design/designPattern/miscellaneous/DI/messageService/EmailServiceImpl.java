package com.sharma.com.design.designPattern.miscellaneous.DI.messageService;


public class EmailServiceImpl implements MessageService{

    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        System.out.println("Email sent to "+rec+ " with Message="+msg);
    }
}