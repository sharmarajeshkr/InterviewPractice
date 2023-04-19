package com.sharma.java8;

@FunctionalInterface
interface FunctionalInterfaceExample {
    public void firstWork();

    @Override
    public String toString();                //Overridden from Object class

    @Override
    public boolean equals(Object obj);        //Overridden from Object class

   // default void getClass(); Compile time Error -->  from Object class
   // default int hashCode(); Compile time Error  -->  from Object class
}


@FunctionalInterface
interface Interface1 {

    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("Printing "+str);
    }

    //trying to override Object method gives compile-time error as
    //"A default method cannot override a method from java.lang.Object"

//	default String toString(){
//		return "i1";
//	}

}

@FunctionalInterface
interface Interface2 {

    void method2();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }

}

class MyClass implements Interface1,Interface2 {


    @Override
    public void method1(String str) {

    }

    @Override
    public void log(String str) {

    }

    @Override
    public void method2() {

    }


}



class A implements FunctionalInterfaceExample{

    @Override
    public void firstWork() {
        System.out.println("Hi ---");
    }
    public String toString(){
        return "overloaded toString";
    }

    public static void main(String[] args) {
        A a = new A();
        a.firstWork();
        System.out.println(a);
        //new A().toString();
    }
}
