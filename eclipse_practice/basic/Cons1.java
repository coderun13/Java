package com.codes.basic;

public class Cons1 {
	int roll;
	String name;
	public Cons1(int roll, String name) {
		this.roll = roll;
		this.name = name;
		
	}
	void result() {
		System.out.println("Name = " +name+" Roll = "+roll);
	}
	
	public static void main(String[] args) {
		Cons1 obj = new Cons1(2, "snehal");
		obj.result();
	}

}
