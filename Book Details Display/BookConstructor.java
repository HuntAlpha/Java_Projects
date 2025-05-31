package com.tcs;

public class BookConstructor {
	int bid;
	String bname;
	String bCode;
	double bprice;
	public BookConstructor(int bid, String bname, String bCode, double bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bCode = bCode;
		this.bprice = bprice;
	}
	public void display() {
		System.out.println("Book Id		: "+bid);
		System.out.println("Book Name	: "+bname);
		System.out.println("Book Code	: "+bCode);
		System.out.println("Book Price	: "+bprice);
	}
	
}
