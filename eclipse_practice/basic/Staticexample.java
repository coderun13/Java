package com.codes.basic;

public class Staticexample {
	//static stores the previous value 
	static int counter = 0;
	public Staticexample()
	{
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) {
	Staticexample st1 = new Staticexample();
	Staticexample st2 = new Staticexample();
	Staticexample st3 = new Staticexample();
}
}