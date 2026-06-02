package com.sunbeam;

class Calculator {
	
	void add(int a, int b) {
		
		System.out.println("Addition of 2 Numbers:"+(a + b));
		
	}
	
	void add(int a, int b, int c) {
		System.out.println("Addition of 3 Numbers:"+(a + b + c));
	}
	
	void add(double a, double b) {
		System.out.println("Addition of 2 double Numbers:"+(a + b));
		
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		
           Calculator c = new Calculator();
           
           c.add(10, 20);
           
           c.add(10, 20, 30);
           
           c.add(10, 30);
	}

}
