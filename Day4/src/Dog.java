import java.io.FileNotFoundException;
import java.io.IOException;

//using extends keyword, you create subclass of existing class, which behaves like it. 
//subclass of Animal

public class Dog extends Animal{
	
	//method overriding
	public void talk() {
		System.out.println("Dog Barks !!");
	}
	
	public void read() {
		System.out.println("Get me Economics times");
	}
	
	public void trainMe() {
		
	}
	
	public static void check() {
		System.out.println("check from dog");
		
	}
	
	
	
	
	
}
