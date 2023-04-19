package com.sharma.practices.java8;

public class UsingRunnable implements Runnable {
	
//	public void run() {
//		for(int i=0;i<10;i++)
//			System.out.println("Number of child thread "+ i);
//		
//	}
	
	public static void main(String[] args) {
		/*
		 * UsingRunnable ur = new UsingRunnable(); Thread t = new Thread(ur); t.start();
		 * for(int i=0;i<10;i++) System.out.println("Number of parent thread "+ i);
		 */

		new Thread(
				() -> {
					for(int i=0;i<10;i++)
						System.out.println("Number of parent thread "+ i);

				}

		).start();



		new Thread(
					new Runnable() {						
						@Override
						public void run() {
							for(int i=0;i<10;i++) 
								System.out.println("Number of parent thread "+ i);
							
						}
					}).start();
				
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
