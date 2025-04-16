package com.codes.basic;

public class StaticBlockExample {

	public StaticBlockExample(){
		System.out.println("we are in constructor");
	}
	static {
		System.out.println("we are in static block");
	}
	public static void main(String[] args) {
		StaticBlockExample st = new StaticBlockExample();
		System.out.println("we are in main function");

	}

}
