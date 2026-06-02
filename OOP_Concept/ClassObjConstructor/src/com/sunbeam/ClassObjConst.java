package com.sunbeam;

class Student {
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	void display() {
		System.out.println("Roll No:"+roll);
		System.out.println("Name:"+name);
	}
	
	
}

public class ClassObjConst {

	public static void main(String[] args) {
		
		Student s = new Student(1, "Vrushabh");
		
		s.display();
		

	}

}
