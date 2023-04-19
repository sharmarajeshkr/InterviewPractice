package com.sharma.com.design.designPattern.miscellaneous.DI.consumer;

// Common Method to consume message and rec
public interface Consumer {
    void processMessages(String msg, String rec);
}
