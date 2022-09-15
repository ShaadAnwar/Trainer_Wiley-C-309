import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First class objects : which behaves like primitives, and you do not need new keyword ALWAYS to create object
		//String is immutable object
//		String str1="nothing";//new object is created on the heap and str1 is referring that object
//		System.out.println(str1);
//		str1="something";//another object is created on heap, and str1 is diverted to new object
//		//nothing... is eligible for garbage collection
//		System.out.println(str1);
//		
		String str2=new String("java");//creating a new object using new keyword
		String str3="java";
		StringTokenizer stk=new StringTokenizer("abc xyz"," ");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		String s="lkjfs,lkjf*\\lkjf";
		String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
		for(String token:tokens) {
			System.out.println(token);
		}
		//str3="javac";
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		//str2.sh
		/*
		 * In JVM memory there is  compartment, which is refered as String Pool a memeory inside heap memory
		 * All the unique String as occupied in this Pool 
		 * If new object contents are similar to existing one, the new memory will not get intiated. but reference will point
		 * to the existing object/memory 
		 *  
		 * 
		 */
		
		if(str2==str3) {
			System.out.println("Objects equal");
			//System.out.println("The memory address is " + JVM.addressOf(str2));
		}
		else
			System.out.println("Objects not equal");
		
		
		
		String s1="abc";
		String s2="xyz";
		
		//StringBuilder and StringBuffer
		/*
		 * Mutable versions of Strings
		 * Not first class objects 
		 */
		
		StringBuffer sb=new StringBuffer("abc");
		sb.toString();	
		StringBuilder sb1=new StringBuilder("xyz");

		
		String name1="abc";
		String name2="xyz";
		System.out.println(name1.hashCode());
		name1=name1+name2;
		System.out.println(name1.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
