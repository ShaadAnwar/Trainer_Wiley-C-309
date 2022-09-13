import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Exception : Program termination abruptly 
//Traditional way : if-else
//Oops way 
/*
 * Object->Throwable->Exception, Error
 * Exception->RunTimeExcption, IOException
 * 
 */

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] data= {10,0};
//		int value1,value2;
//		int add,sub,div,mul;
//		try {
//		value1=data[0];
//		value2=data[1];
//		add=value1+value2;
//		System.out.println("Addition ="+add);
//		sub=value1-value2;
//		System.out.println("Substraction ="+sub);
//		try {
//		div=value1/value2;
//		System.out.println("Division ="+div);
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("Cannot divied by zero");
//		}
//		mul=value1*value2;
//		System.out.println("Multiplication ="+mul);
//
//		}
//		catch(ArrayIndexOutOfBoundsException ab) {
//			System.out.println("initialize atleast 2 members in array");
//		}
//		
//		int ans = div(10, 0);
//		System.out.println("division =" + ans);
		div(10,2);
	}
	
	private static int div(int i, int j) {
		// TODO Auto-generated method stub
		try {
			int ans = i / j;
			return ans;
		} catch (ArithmeticException ae) {
			System.out.println("Cannot divide");
		}
		finally{
			System.out.println("finally invoked");
		}
		return 0;
	}
	
	

	
	public static void processFile() {
		File f=new File("a.txt");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(f);//exception occured
			
			//System.exit(0);
			while(fis.read()!=-1) {
				System.out.println("Processing file");
				//exception occurs 
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Finally called ");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	
	
	
	
}
