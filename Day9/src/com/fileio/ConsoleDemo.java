package com.fileio;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console=System.console();
		System.out.println("Enter your name :");
		String user=console.readLine();
		char[] password=console.readPassword();
		System.out.println("Welcome, "+user);
	}

}
