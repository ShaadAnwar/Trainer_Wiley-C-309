import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo2 {
	
	public void processIt() {
		try {
			
			File f=new File("");
			FileInputStream fis=new FileInputStream(f);
		}
		catch(IOException |ArithmeticException | ArrayIndexOutOfBoundsException  e) {
			if(e instanceof IOException) {
				
			}
			if(e instanceof ArithmeticException ) {
				
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		
	}

}
