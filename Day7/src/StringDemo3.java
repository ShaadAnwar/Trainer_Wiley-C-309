import java.util.StringTokenizer;

public class StringDemo3 {
	public static void main(String[] args) {
		String data="Welcome to java programming";
		String[] words=data.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
		
		StringTokenizer tokens=new StringTokenizer("Welcome to java programming"," ");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		String complicatedString="Welcome to some *stuff $ which ## I am going to do @ I am Done [ how you are doing]";
		String[] meaningfulwords=complicatedString.split("[!,?.*_'@\\\\ ]+");
		for(String word:meaningfulwords) {
			System.out.println(word);
		}
		
		public static void print() {
			
		}
		
		
	}
	

}
