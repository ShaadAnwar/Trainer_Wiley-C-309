import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//capacity of collections :10
//load factor : 0.75
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		//ArrayList: AbstractArryaList, Collection,Object, List, AbstractCollection
		numbers.add(80);//int-->Integer
		numbers.add(87);
		numbers.add(67);
		numbers.add(98);
		numbers.add(54);
		System.out.println(numbers);
		
		
		numbers.add(1,78);
		System.out.println(numbers);
		ArrayList<Integer> numbers1=new ArrayList<Integer>();
		numbers1.add(99);
		numbers1.add(99);
		numbers1.add(99);
		
		numbers.addAll(numbers1);
		//printing all the elements of the arraylist
		System.out.println(numbers);
		
		
//		System.out.println("Element at index number 5 :"+numbers.get(5));
//		
//		//System.out.println(numbers);
//		
//		System.out.println(numbers.size());
//		
//		//traditional for loop: considers the index numbers, can traverse in forward as well as backward direction
//		for(int i=0;i<numbers.size();i++) {
//			int number=numbers.get(i);
//			System.out.println(number);
//		}
//		
//		//for each loop : enhanced for loop :: doesnt consider the index number, only traverse in the forward direction
//		for(int number: numbers) {
//			
//			System.out.println(number);
//			//numbers.remove(4);
//			
//		}
		
		//iterator:: doesnt consider the index number, only traverse in the forward direction
		
		Iterator<Integer> numberIterator=numbers.iterator();
		while(numberIterator.hasNext()) {
			int data=numberIterator.next().intValue();
			System.out.println(data);
			if(data%2==0)
			numberIterator.remove();
		}
		
		System.out.println(numbers);
		
		
		
		ListIterator<Integer> mylistIterator=numbers.listIterator();
		while(mylistIterator.hasPrevious()) {
			//mylistIterator.addk
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
