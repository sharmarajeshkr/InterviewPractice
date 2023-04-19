package com.sharma.practices.java8;


@FunctionalInterface
interface Interfas {
	public void methodOne();
}
public class Test {

	public static void main(String[] args) {

		Interfas i = ()->System.out.println("MethodOne Execution");
		
		i.methodOne();

	}
}