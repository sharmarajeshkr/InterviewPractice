package com.sharma.practices.java8;

public class RunnableLambda {
	
	public static void main(String[] args) {
//		Runnable  r = () -> {
//			for(int i=0;i<10;i++) 
//				System.out.println("Number of Child thread "+ i);
//		};
		
		
		
		
		Thread t = new Thread( () -> {
			for(int i=0;i<100;i++) 
				System.out.println("Number of Child thread "+ i);
		}) 
				
				;
		t.start();
		for(int i=0;i<10;i++) 
			System.out.println("Number of parent thread "+ i);
	}

}
