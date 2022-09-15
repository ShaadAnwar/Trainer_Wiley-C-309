package com.threading;

class Test 
{ 
    public synchronized void count() //At a time not more more than one thread can access this method
    { 
        for (int i = 0; i < 3; i++) 
        { 
        	System.out.print(Thread.currentThread().getName()+" :");
            System.out.println(i); 
            
            try 
            { 
                Thread.sleep(400); 
                
            } 
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
} 
  
class MyThread1 extends Thread { 
   
    Test test; 
  
    MyThread1 (Test test) { 
        this.test = test; 
    } 
  
    @Override
    public void run() { 
        test.count(); 
    } 
} 
  
public class SynchronizedMethod 
{ 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); //Object of Apple class that is shared amoung threads
  
        MyThread1 thread1 = new MyThread1(obj); 
        MyThread1 thread2 = new MyThread1(obj); 
  
        thread1.start(); 
        thread2.start(); 
    } 
} 

