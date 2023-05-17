package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	/*
	 * 삼항 연산자
	 * [표현법] 조건식 ? 식1 : 식2;
	 * 
	 * -조건식에는 주로 비교, 논리 연산자가 사용됨
	 * -조건식의 결과가 true 이면 식 1을 수행. false 라면 식 2를 수행.
	 * 	 */
	
	public static void main(String[] args) {
		F_Triple f = new F_Triple();
//		f.method1();
//		f.method2();
//		f.practice1();
		f.practice2();
		
	}
	public void method1() {
		
		int num = 0;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = sc.nextInt();
		
		// 입력받은 정수가 양수인지 음수인지 판단
		result = (num > 0) ? "양수이다." : "음수이다.";
		System.out.println(result);
		
		// 양수이다, 음수이다, 0이다
	}
	public void method2() {
		
		int num = 0;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = sc.nextInt();
		result = (num > 0) ? "양수이다." : (num < 0) ? "음수이다." : "0이다";
		
		System.out.println(result);

	}
	public void practice1() {
		/*
		 * 문제 1
		 * 
		 * 사용자한테 두 개의 정수값을 입력받아서 두 정수의 곱셈결과 100보다 큰 경우 "결과가 100 이상입니다" 아닌 경우 " 결과가 100보다 작습니다" 출력
		 * 
		 * 
		 */
		int num1 = 0;
		int num2 = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수값 입력 > ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수값 입력 > ");
		num2 = sc.nextInt();
		
		result = (num1 * num2 >= 100) ? "결과가 100 이상입니다." : "결과가 100보다 작습니다.";
		System.out.println(result);
		
	}
	/*
	 * 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력받아서 입력한 문자가 대문자이면 "알파벳 대문자이다." 아닌 경우 " 알파벳 대문자가 아니다." 출력 
	 */
	public void practice2() {
		
		char ch = 'a';
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 하나 입력하세요 > ");
		
		ch = sc.nextLine().charAt(0);

		
		result = ((ch >= 'A') && (ch <= 'Z')) ? "알파벳 대문자이다" : "알파벳 대문자가 아니다.";
		System.out.println(result);
	}
}
