import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> myMap=new HashMap<String,String>();
		
		Map<String, List<String>> library=new HashMap<String, List<String>>();
		library.put("drama", Arrays.asList("","","",""));
		
		
		myMap.put("M101", "Yogesh");
		myMap.put("M102","Vivek");
		myMap.put("M103","Vivek");
		myMap.put("null", "Unmesh");
		System.out.println(myMap);
		String name=myMap.get("M102");
		System.out.println(name);
		
		String s=myMap.getOrDefault("M105", "Some Defaults");
		System.out.println(s);
		
		System.out.println(myMap);
		Set<Entry<String,String>> mySet=myMap.entrySet();
		System.out.println(mySet);
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
	}
	
	
	
}
