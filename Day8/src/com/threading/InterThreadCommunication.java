package com.threading;

class Printer 
{ 
    // Initial 100 paper are set in Printer
    int noOfPaper = 100; 

    // Synchronized the method for inter-thread communication 
    synchronized void printingPages(int pages) 
    { 
        System.out.println("Printing the Pages"); 
        for(int i = 0; i < 100; i++)
        {
            // Printing Pages
        	noOfPaper=noOfPaper-1;
        	//System.out.println("Availbale papers in tray:"+this.noOfPaper);
        }
        
        
        // If balance number of Papers are less than user input 
        // then wait for addPages() synchronized method   
        // and printing will resume after that
        if (this.noOfPaper < pages) { 

            System.out.println("Number of Papers in printer are less"); 
            try 
            { 
                System.out.println("Waiting...");
                wait(); //hold the execution for the synchronized method till resources gets availbale. Other thread will take up up the job to fill up the resources. 
            } 
            catch (Exception e) 
            { 
                
            } 
        } 
        
        System.out.println("After called notify() method number of Paper : " +    this.noOfPaper); 
        System.out.println("Printing process complete");
         
    } 

    synchronized void addPages(int noOfPages) 
    { 
        // Adding more Papers in Printer;
    	
        this.noOfPaper += noOfPages; 
        // After adding the paper in printer. Notify the Paused thread; 
        notify(); //notify the blocked/waited thread that I am done with the job, you can continue. 
    } 
} 

public class InterThreadCommunication { 

    public static void main(String args[]) 
    { 
        Printer printer = new Printer(); 
        // create two new thread and start them simultaneously 
        //First thread for print the pages
        Thread t1=new Thread() 
        { 
            @Override
            public void run() 
            { 
                // User want to print 120 pages
                printer.printingPages(120); 
            } 
        };
        t1.start();
        try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        // Second thread for Add pages in printer
        new Thread() { 
            @Override
            public void run() 
            { 
                // Add 100 more pages in Printer
                printer.addPages(100); 
            } 
        }.start(); 
    } 
} 

