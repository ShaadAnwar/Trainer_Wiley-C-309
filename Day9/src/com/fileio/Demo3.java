package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("first.txt");
		try {
			FileInputStream fin=new FileInputStream(f);
			char c;
			while((c=(char) fin.read())!=-1) {
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		FileInputStream fin1=new FileInputStream("first.txt");
//		FileInputStream fin1=new FileInputStream(new File("first.txt"));
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
