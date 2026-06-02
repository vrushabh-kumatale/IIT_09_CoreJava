package com.sunbeam;

class Person {
	String name = "Vrushabh";
	
	void display() {
		System.out.println("Name:"+name);
	}
}

class Student extends Person {
	
	int marks = 80;
	
	void showMarks() {
		System.out.println("Marks:"+marks);
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.display();
		s.showMarks();

	}

}
