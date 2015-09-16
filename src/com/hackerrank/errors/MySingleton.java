package com.hackerrank.errors;

public class MySingleton {

	static MySingleton instance;

	public static MySingleton getInstance() {
		if (instance == null)
			instance = new MySingleton();
		return instance;
	}
	
	public void test(){
		System.out.println("function of signleton class Called");
	}
	public static void main(String []args){
		MySingleton.getInstance().test();
	}
}
