package com.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student1 student = new Student1("Justin", 8.51,new Date(15,6,2021));
		System.out.println("Before Deserialization:");
		student.print();
		
		//Serialization
		FileOutputStream fileOut = new FileOutputStream("demo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fileOut);
		oos.writeObject(student);//Normal of of serializing objects
		
	//	oos.writeInt(student.getDt().getDd());
		
		
		oos.close();
		fileOut.close();		
		
		//Deserialization
		FileInputStream fileIn = new FileInputStream("demo.txt");
		ObjectInputStream ois = new ObjectInputStream(fileIn);		
		Student1 deserializedStudent = (Student1) ois.readObject();	
//		
//		int i=ois.readInt();
//		
//		Date date=new Date(i, 0, 0);
//		deserializedStudent.setDt(date);
//		
//		System.out.println("\nAfter Deserialization:"+i);
//		
		deserializedStudent.print();
//		
//		ois.close();
//		fileIn.close();
	}
}