package com.kh.step3;

import java.util.Scanner;

import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 변수 호출 방법
		 * - 참조변수.변수이름;
		 * 
		 * 메서드 호출 방법
		 * - 참조변수.메서드이름();				//매개변수가 없는 경우
		 * - 참조변수.메서드이름(값1, 값2, ...);	//매개변수가 있는 경우
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c1 = new Calculator();
		
		c1.a = 5;
		c1.b = 10;
		
		System.out.println(c1.max());
		System.out.println(c1.add());
		System.out.println(c1.substract());	
		System.out.println(Calculator.multiply(c1.a, c1.b));
		System.out.println(Calculator.divide(c1.a, c1.b));
		
		System.out.println("팩토리얼 : " + c1.factorial(c1.a));
	}

}
