
public class Calculator {
	public int addNumbers(int x, int y) {
		
		return x+y;
	}
	public int substractNumbers(int x,int y) {
		return x-y;
	}
	
	
	public static void main(String[] args) {
		Calculator c1=new  Calculator();//create object
		int add=c1.addNumbers(10, 20);
		int sub=c1.substractNumbers(10, 2);
		System.out.println("Addition ="+add);
		System.out.println("Substraction ="+sub);
		
	}
	
}
