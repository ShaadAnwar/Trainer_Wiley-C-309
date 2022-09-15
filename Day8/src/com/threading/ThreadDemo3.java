package com.threading;

public class ThreadDemo3 {
	public static void main(String[] args) {
	
		Thread thread=new Thread() {
			public void run() {
				System.out.println("run is invoked");
			}
			
		};
		thread.start();
		
		Runnable thread2=new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run for runnable is invoked");
			}
			
		};
		
	}

}
