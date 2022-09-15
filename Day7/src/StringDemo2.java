
public class StringDemo2 {
	public static void main(String[] args) {
	
		String str1=new String("java").intern();//Forcefully putting the String object outside of constant pool 
		//intern method pushes the string explicitly in the constant pool 
		String str2="java";
		
		System.out.println(str1==str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}

}
