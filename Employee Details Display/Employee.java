package com.tcs;
import java.util.ArrayList;
import java.util.*;
public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<EmpConstructor> emps = new ArrayList<EmpConstructor>();
		System.out.println("Enter Employees Details: ");
		for(int  i=1;i<=2;i++) {
			System.out.print("Enter Id	: ");
			int id = sc.nextInt();
			System.out.print("Enter Name	: ");
			String name = sc.next();
			System.out.print("Enter Salary	: ");
			double sal = sc.nextDouble();
			System.out.print("Enter Desg	: ");
			String desg = sc.next();
			emps.add(new EmpConstructor(id,name,sal,desg));
			System.out.println();
			System.out.println("Employee "+i+" is added");
			System.out.println();
		}
		System.out.println("*****Employee Details*****");
		for( EmpConstructor t:emps) {
			t.Display();
			System.out.println();
		}
		
		
	}
}
