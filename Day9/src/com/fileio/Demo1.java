package com.fileio;

import java.io.File;
import java.io.IOException;

//Byte Hierarchy 
//Character Hierarchy
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("first.txt");
		try {
			if(!f.exists()) {
			f.createNewFile();
			System.out.println("New file is create");
			}
			else {
				System.out.println("File is already present");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
