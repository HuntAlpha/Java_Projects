package com.tcs;
import java.util.*;
import java.util.ArrayList;

public class BookDetails {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<BookConstructor> books = new ArrayList<BookConstructor>();
	for(int i=1;i<=2;i++) {
		System.out.print("Enter Book Id	: ");
		int bid = sc.nextInt();
		System.out.print("Enter Book Name	: ");
		String bname = sc.next();
		System.out.print("Enter Book Code	: ");
		String bCode = sc.next();
		System.out.print("Enter Book Price: ");
		int price = sc.nextInt();
		books.add(new BookConstructor(bid,bname,bCode,price));
		System.out.println();
	}
	for(BookConstructor p:books) {
		p.display();
		System.out.println();
	}
}
}