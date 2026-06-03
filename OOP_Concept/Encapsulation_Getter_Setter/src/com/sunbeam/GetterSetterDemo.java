package com.sunbeam;

class Student {
	
	int rollNo;
	String name;
	
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class GetterSetterDemo {
	
	public static void main(String[] args) {
		
		Student s = new Student(9,"Akash");
		
		//using Constructor
		System.out.println("Roll No :"+s.getRollNo());
		System.out.println("Name1:"+s.getName());
		
		//Set Values
		s.setRollNo(10);
		s.setName("Vrushabh");
		
		//Get Values
		
		System.out.println("Roll No:"+s.getRollNo());
		System.out.println("Name:"+s.getName());

	}

}
