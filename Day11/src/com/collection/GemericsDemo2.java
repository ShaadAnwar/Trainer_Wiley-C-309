package com.generics;


//create a generics class
class GenericsClassNumber<T extends Number> {

	// variable of T type
	private T data;

	public GenericsClassNumber(T data) {
		this.data = data;
	}

	// method that return T type variable
	public T getData() {
		return this.data;
	}
}

public class GemericsDemo2 {
	public static void main(String[] args) {

		// initialize generic class
		// with Integer data
		GenericsClassNumber<Integer> intObj = new GenericsClassNumber<>(5);
		System.out.println("Generic Class returns: " + intObj.getData());

		// initialize generic class
//		// with String data
//		GenericsClassNumber<String> stringObj = new GenericsClassNumber<>("Java Programming");
//		System.out.println("Generic Class returns: " + stringObj.getData());
	}
}



