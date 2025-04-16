package com.codes.basic;

public class Thisexample {
	public Thisexample(int x) {
		System.out.println(x);
		
	}
	
	public Thisexample() {
		this(10); //calling first constructor in the second one
		
	}
	
	void show() {
		System.out.println("we are in show");
	}
	
	void display() {
		this.show();
		System.out.println("we are in display");
	}
	
	public static void main(String[] args) {
		Thisexample t = new Thisexample();
		
		t.display();

	}

}
