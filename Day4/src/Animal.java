
//super class
//abstract class is incomplete class, which cannot be instantiated 
//any incomplete/abstract methods must be completed by the subclass, else subclass must be declared as an abstract class 
public abstract  class Animal {

	abstract void talk();//incomplete method. 
	public Animal() {
		
	}
	
	public void eat() {
		
		System.out.println("Animal eating generically");
	}
	public void sleep()//concrete methods
	{
		System.out.println("Animal sleeping generically");
	}
	public void breath() {
		System.out.println("Animal breathing generically");
	}
	
	
	public static void check() {
		System.out.println("check from animal");
	}
	
}
