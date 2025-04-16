package com.codes.inheritance;

class Parent{
	void display()
	{
		System.out.println("We are in parent class");
	}
}

public class Singleinheritance extends Parent {
	void show(){
	System.out.println("We are in child class");
	}
	
	public static void main(String[] args) {
	
		Singleinheritance s = new Singleinheritance();
		s.display();
		s.show();
	}
}