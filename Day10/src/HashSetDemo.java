import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers=new HashSet<Integer>();//unique and unordered
		
		numbers.add(80);//int-->Integer
		numbers.add(87);
		numbers.add(67);
		numbers.add(98);
		numbers.add(87);//duplicate
		numbers.add(null);
		numbers.add(null);
		numbers.add(54);
		
		System.out.println(numbers);
		
		
		
	}

}
