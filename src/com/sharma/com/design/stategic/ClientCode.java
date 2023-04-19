package com.sharma.com.design.stategic;

public class ClientCode {
    public static void main(String[] args) {

        Context ct = new Context(new AddOperation());
        int sum = ct.executeStrategic(12,2);
        System.out.println(sum);

    }
}
