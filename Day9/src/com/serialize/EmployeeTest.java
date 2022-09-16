package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Justin",65000);
		try {
			FileOutputStream fos=new FileOutputStream("employee.dat");//opened the file in the write mode so that I can add object
			ObjectOutputStream oos=new ObjectOutputStream(fos);//create objectoutputstream to pass object as ouput
			oos.writeObject(e1);
			System.out.println("Object is serialized ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Deserialization Process 
		
		FileInputStream fis=new FileInputStream("employee.dat");
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(fis);
			Employee retrievedEmployee=(Employee)ois.readObject();
			System.out.println(retrievedEmployee);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
