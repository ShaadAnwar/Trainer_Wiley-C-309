import java.util.ArrayList;
import java.util.function.Consumer;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="Wiley";
//		//annonymous class implemnetation 
//		Consumer<String> myconsumer=new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		};
//		
//		myconsumer.accept(name);
//		
		
		
		Consumer<String> myconsumer1=(data)	-> System.out.println("Welcome , "+data);	
		myconsumer1.accept("mandar");
		
		
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("abc");
		myList.add("pqr");
		myList.add("xyz");
		
		myList.forEach((name)->System.out.println(name));
		System.out.println(myList);
		
		
		
		
		
		

	}

}
