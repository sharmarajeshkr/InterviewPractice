package com.sharma.com.design.designPattern.creation.abstractFactory;
   /*
    AbstractFactory design pattern Used in JDK
    //      javax.xml.parsers.DocumentBuilderFactory#newInstance()
    //      javax.xml.transform.TransformerFactory#newInstance()
    //      javax.xml.xpath.XPathFactory#newInstance()


    */

public class AbstractFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(
                            new PCFactory("2","120","core")
                        );
        System.out.println(pc);
    }
}

class ComputerFactory{

    public static Computer getComputer(ComputerAbstractFactory factory) {
      return  factory.createComputer();
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

class PC extends Computer {
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

class Server extends Computer {
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

interface ComputerAbstractFactory{
    public Computer createComputer();
}

class PCFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    PCFactory(String ram,String hdd,String cpu){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}

class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    ServerFactory(String ram,String hdd,String cpu){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}