package com.tcs;

public class EmpConstructor {
	int id;
	String name;
	double salary;
	String desg;
	public EmpConstructor(int id,String name,double salary,String desg) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desg = desg;
	}
	public void Display() {
		System.out.println("Id	: "+id);
		System.out.println("Name	: "+name);
		System.out.println("Salary	: "+salary);
		System.out.println("Desg	: "+desg);
	}
}
