package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader=null;
		try {
			FileReader fr=new FileReader(new File("first.txt"));
			String line=null;
			reader=new BufferedReader(fr);
			
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
