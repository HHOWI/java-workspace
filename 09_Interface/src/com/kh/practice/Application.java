package com.kh.practice;

public class Application {

	public static void main(String[] args) {
		IPhone14Pro iphone = new IPhone14Pro();
		iphone.printInformation();
		
		System.out.println();
		
		S23Ultra s23ultra = new S23Ultra();
		s23ultra.printInformation();
	}

}
