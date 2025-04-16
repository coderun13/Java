package com.codes.basic;

import java.util.Scanner;

public class Methods {

	void show()
	{
		System.out.println("We are in show method");
	}
	
	int display(int x)
	{
		return x*x;
	}
	
	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.show();
		
		int z;
		System.out.println("enter integer value:");
		Scanner sc = new Scanner(System.in);
		z = sc.nextInt();
		System.out.println(obj.display(z));
	}

}
