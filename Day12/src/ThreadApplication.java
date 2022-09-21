
public class ThreadApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t1=new Thread(Runnable target);
		
		/*Type 1: 
		 * Traditional Approach : You create a separate class which implemnets Runnable
		 * Object of that Runnable is wired inside the Thread constructor
		 */
		
		Thread t1=new Thread(new MyThread());
		t1.start();
		
		
		//Type 2:
		/*
		 * Anonymous inner class : create the body of the class, as and when required : Still more code 
		 */
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In the run method of r1");
			}
			
		};
		Thread t2=new Thread(r1);
		t2.start();
		
		//Type 3 : Anonymous class as an argument 
		Thread t3=new Thread(new Runnable() {
									@Override
									public void run() {
									// TODO Auto-generated method stub
										System.out.println("In the run method of method local ");
									}
								}
							);
		
		t3.start();
		
		
		
		Runnable r4=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In the run method of r1");
			}
			
		};
		
		//Lambda Expression: Functional interfaces
		//Function interface is the interface which provides a single functionality to implement 
		
		Runnable r5=()->System.out.println("In the method run ");
		Thread t5=new Thread(r5);
		t5.start();
		
		Thread t6=new Thread(()->System.out.println("In the method run "));
		
		
		
		
		
		
		
		
		
		
//		SampleInterface sampleInterface =new SampleInterface() {
//			
//			@Override
//			public void process() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void proces1() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
	}

}
