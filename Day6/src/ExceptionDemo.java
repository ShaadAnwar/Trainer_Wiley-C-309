import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		doCalculation();
	}

	//unchecked exceptions and throws
	private static void doCalculation() throws ArithmeticException{
		// TODO Auto-generated method stub
		
	}

	
	//throws keyword used with checked exceptions
	private static void processFile(String fileName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(fileName);
	}
	
	

	

}
