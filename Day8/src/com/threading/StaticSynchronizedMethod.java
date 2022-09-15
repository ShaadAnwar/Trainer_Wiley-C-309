package com.threading;

class Test1 {
//    synchronized static public void countIncrement() 
//    { 
//        System.out.println("Increment values");
//        for (int i = 0; i < 3; i++) 
//        { 
//            System.out.println(i); 
//            try 
//            { 
//                Thread.sleep(400); 
//            } 
//            catch (Exception e) 
//            { 
//                System.out.println(e); 
//            } 
//        } 
//    } 
	public void countIncrement() {
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			System.out.println("Increment values");
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

	synchronized public void countDecrement() {
		System.out.println("Decrement values");
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
//    synchronized static public void countDecrement() 
//    { 
//        System.out.println("Decrement values");
//        for (int i = 3; i > 0; i--) 
//        { 
//            System.out.println(i); 
//            try 
//            { 
//                Thread.sleep(400); 
//            } 
//            catch (Exception e) 
//            { 
//                System.out.println(e); 
//            } 
//        } 
//    } 
}

class TestThread extends Thread {

	Test1 test;

	TestThread(Test1 test) {
		this.test = test;
	}

	@Override
	public void run() {
		test.countIncrement();
		//test.countDecrement();
	}
}

public class StaticSynchronizedMethod {
	public static void main(String[] args) {
		Test1 obj = new Test1(); // Object of Apple class that is shared amoung threads

		TestThread thread1 = new TestThread(obj);
		TestThread thread2 = new TestThread(obj);

		thread1.start();
		thread2.start();
	}
}
