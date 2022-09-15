package com.threading;

class ThreadOne extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
        	Thread.yield();
            System.out.println("Thread one is running");
           
        }
    }
}

class ThreadTwo extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread two is running");
        }
    }
}
 
public class ThreadYieldDemo
{
    public static void main(String args[])
    {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        
        threadOne.start();
        threadTwo.start();
        
        threadOne.setPriority(6);
    }
}

