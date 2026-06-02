package com.sunbeam;

class Person {

	void display() {
		System.out.println("I am a Person");
	}
}

class Student extends Person {

	@Override
	void display() {
		System.out.println("I am a Student");

	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.display();

	}

}
