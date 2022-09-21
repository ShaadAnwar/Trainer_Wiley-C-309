import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="wiley";
		Predicate<String> mypredicate=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length()<10;
			}
			
		};
		
		System.out.println(mypredicate.test("lkajsdlkjflkjasdf"));
		
		Predicate<String> mypredicate1=(data)->data.length()<10;
		System.out.println(mypredicate1.test("Unmesh"));

	}

}
