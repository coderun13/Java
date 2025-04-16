package com.codes.basic;

public class ConsOverloading {
	
	public ConsOverloading() {
		System.out.println("Default");
	}
	
	public ConsOverloading(int x) {
		System.out.println(x);
	}
	
	public ConsOverloading(double x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		ConsOverloading obj1 = new ConsOverloading();
		ConsOverloading obj2 = new ConsOverloading(23.44);
		ConsOverloading obj3 = new ConsOverloading(21);
	}

}
