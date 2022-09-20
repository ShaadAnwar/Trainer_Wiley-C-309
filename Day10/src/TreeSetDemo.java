import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers=new TreeSet<Integer>();//unique and unordered or sorted
		
		numbers.add(80);//int-->Integer
		numbers.add(87);
		numbers.add(67);
		numbers.add(98);
		numbers.add(87);//duplicate
		
		
		//numbers.add(null);
		numbers.add(54);
		
		System.out.println(numbers);
		
		
		
	}

}
