package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WRite into file using byte hierary
		try {
			//Opening the file into write mode
			FileOutputStream fos=new FileOutputStream("first.txt",true);
			//FileOutputStream fos1=new FileOutputStream(null, tr)
			byte[] data="We are learning IO".getBytes();
			//String text=" Welcome";
			fos.write(data);
			System.out.println("Data added into the file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
