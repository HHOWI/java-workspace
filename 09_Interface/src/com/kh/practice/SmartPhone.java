package com.kh.practice;

public abstract class SmartPhone implements Phone {

	public void printinfomation(String name, String brand) {
	
		System.out.println(name + "는" + brand + "에서 만들어졌고 제원은 다음과 같다.");
		System.out.println(makeCall());
		System.out.println(tackCall());
		System.out.println(picture());
		
		
	}
}
