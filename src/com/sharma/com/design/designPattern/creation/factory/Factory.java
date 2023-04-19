package com.sharma.com.design.designPattern.creation.factory;

/*
The factory design pattern is used when we have a superclass with multiple sub-class and based on input
we need to return one of the sub-class.

 */


public class Factory {
    public static void main(String[] args) {
        Computer cf = ComputerFactory.getComputer("Server","12","250","Multi core");
        System.out.println(cf);
        // Calendar.getInstance();
        // valueOf() from wrapper class
       // Integer.valueOf(12);


    }
}

class ComputerFactory{
    public static Computer getComputer(String type,String ram,String hdd,String cpu){
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram,hdd,cpu);
        return new Server(ram,hdd,cpu);
    }
}

abstract class Computer{
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();

    public String toString() {
        return "RAM"+this.getRAM()+" HDD "+getHDD()+"  CPU "+this.getCPU();

    }
}

class PC extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    PC(String ram,String hdd,String cpu){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public String getRAM(){
        return this.ram;
    }

    public String getHDD(){
        return this.hdd;
    }

    public String getCPU(){
        return this.cpu;
    }

}

class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    Server(String ram,String hdd,String cpu){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public String getRAM(){
        return this.ram;
    }

    public String getHDD(){
        return this.hdd;
    }

    public String getCPU(){
        return this.cpu;
    }

}