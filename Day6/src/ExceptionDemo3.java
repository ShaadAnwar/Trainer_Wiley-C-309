import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//Try with Resource or Automatic Resource Management with try : update in jdk 1.7
public class ExceptionDemo3 {
	
	public void processFile() {
		
		File f=new File("first.txt");
		//FileInputStream fis=null;
		try (FileInputStream fis=new FileInputStream(f)){
			
		}
		catch(IOException io) {
			
		}
		
	}

}
