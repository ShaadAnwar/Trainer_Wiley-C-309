package com.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.fileio.Animal;

public class Dog extends Animal implements Serializable{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		FileOutputStream fis=new FileOutputStream("dog.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(d);
		System.out.println("Dog is serialized");
		
		
		FileInputStream fs=new FileInputStream("dog.txt");
		ObjectInputStream ois=new ObjectInputStream(fs);
		
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.name);
		
		
	}

}
