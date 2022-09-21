//Updates in JDK 1.8 

public interface SampleInterface {
	public void process();//abstract method by default 
	public void proces1();
	
	//backward compatibility you can declare the methods as default
	//you can have any number of default methods in interface
	//default methods can be overridden in the subclass, if required
	public default void doTask() {
		
	}
	
	//static methods are written in interface to provide the common business logic to be shared
	//across all the subclasses
	public static void generateResource() {
		//common funcationality to connect the resource
	}

}
