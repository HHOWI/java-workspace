package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] agrs) {
		
		OperatorPractice op = new OperatorPractice();
		
//		op.method1();
//		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
		op.method6();
	}
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("인원 수 : ");
		num1 = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		num2 = sc.nextInt();
				
		System.out.printf("1인당 연필 개수 : %d\n", num2 / num1);
		System.out.printf("남는 연필 개수 : %d", num2 % num1);
				
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 100;
		
		System.out.print("양수를 입력해주세요 > ");
		num1 = sc.nextInt();
		
		
		System.out.print(num1 - (num1 % num2));

	}
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean result = false;
		
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		num3 = sc.nextInt();
		
		result = (num1 == num2) && (num1 == num3); 
		System.out.println(result);
	}
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String result = null;
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.print(result);
		
	}
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String result = null;
		
		System.out.print("나이 : ");
		num = sc.nextInt();
		
		result = (num <= 13) ? "어린이" : (num > 19) ? "성인" : "청소년";
		System.out.print(result);
	}
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("사과의 갯수 : ");
		num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		num2 = sc.nextInt();
		
		num3 = (num1 / num2) + ((num1 % num2 < 10) ? 1 : 0);
		
		System.out.printf("필요한 바구니의 수 : %d", num3);
		
		
	}
}
