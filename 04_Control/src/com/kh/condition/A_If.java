package com.kh.condition;

import java.util.Scanner;

public class A_If {

	Scanner sc = new Scanner(System.in); // 인스턴스 변수 (밖에 있는 변수)

	/*
	 * if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { ..조건식이 참(true)일 때 실행할 코드.. }
	 * 
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 */
	public void method1() {
		int score = 40; // 지역 변수 (해당 메소드 안에서만 사용)

		// 60점 이상이어야 합격!

		if (score >= 60) { // 중괄호 꼭 사용!
			System.out.println("합격!");
		}
		if (score >= 60)
			System.out.println("합격!"); // 한줄로 쓸때는 중괄호 없어도 됨

		// 불합격!
		if (score < 60) {
			System.out.println("불합격!");
		}

		/*
		 * if-else문
		 * 
		 * [표현법]
		 * 
		 * if(조건식) { ...조건식이 참(true)일 때 실행할 코드... } else { ...조건식이 거짓(false)일 때 실행할
		 * 코드... }
		 * 
		 */

	}

	public void method2() {

		int score = 0;

		System.out.print("점수 입력 > ");
		score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}

		// 삼항연산자
		System.out.println((score >= 60) ? "합격!" : "불합격!");
	}

	public void method3() {

		String name = null;

		System.out.print("이름을 입력해주세요 > ");
		name = sc.nextLine();

		System.out.println("김민수" == name); // false
		System.out.println("김민수".equals(name)); // true, String 클래스의 equals() 메소드
		System.out.println("김민수".charAt(0)); // String 클래스의 charAt(0) 메소드

		// 본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."

		if ("김민수".equals(name)) {
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}
	}

	public void method4() {

		int num = 0;

		System.out.print("숫자 입력 > ");
		num = sc.nextInt();

		// 0보다 크면 "양수", 그게 아니면 "음수"
		// 중첩 if문 : if문 중첩해서 사용 가능!

		if (num > 0) {
			System.out.println("양수");
		} else {
//			System.out.println("움수");

			if (num == 0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("음수");
			}
		}

	}

	/*
	 * if-else if-else문
	 * 
	 * [표현법]
	 * 
	 * if(조건식1) { ..조건식1이 참(true)일 때 실행할 코드.. }
	 * 
	 * else if(조건식2) { ..조건식2가 참(true)일 때 실행할 코드.. } else { .. 위의 어느 조건식에도 만족하지 않을 때
	 * 실행할 코드 ..
	 * 
	 * - else if 수는 무제한. - else는 생략 가능.
	 */
	public void method5() {

		int num = 0;

		System.out.print("숫자 입력 > ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수이다.");
		} else if (num < 0) {
			System.out.println("음수이다.");
		} else {
			System.out.println("0 입니다.");
		}
	}

	/*
	 * 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력하라 - 90점 이상은 A 등급 - 90점 미만 80점 이상은 B 등급 -
	 * 80점 미만 70점 이상은 C 등급 - 70점 미만 60점 이상은 D 등급 - 60점 미만은 F 등급
	 */
	public void method6() {

		int score = 0;

		char grade = '\u0000';

		System.out.print("점수 입력 : ");
		score = sc.nextInt();

		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80 && score <= 90) {
			grade = 'B';
		} else if (score >= 70 && score <= 80) {
			grade = 'C';
		} else if (score >= 60 && score <= 70) {
			grade = 'D';
		} else if (score < 60 && score >= 0) {
			grade = 'F';
		} else {
			System.out.print("점수입력 오류");
		}

		System.out.println(grade);

	}

	/*
	 * 세 정수를 입력했을 때 짝수만 출력 num1 입력 > 3 num2 입력 > 4 num3 입력 > 6 4 6
	 */
	public void practice1() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		num3 = sc.nextInt();

		if ((num1 % 2) == 0) {
			System.out.println(num1);
		}
		if ((num2 % 2) == 0) {
			System.out.println(num2);
		}
		if ((num3 % 2) == 0) {
			System.out.println(num3);
		}
	}

	/*
	 * 정수 1개를 입력했을 때 음수면 minus, 양수면 plus, 0이면 zero, 짝수면 even, 홀이면 odd 출력
	 */
	public void practice2() {
		int num = 0;
		String pm = "";
		String oe = "";

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		if (num > 0) {
			pm = "plus";
			if (num % 2 == 0) {
				oe = "even";
			} else {
				oe = "odd";
			}
		} else if (num < 0) {
			pm = "minus";
			if (num % 2 == 0) {
				oe = "even";
			} else {
				oe = "odd";
			}
		} else {
			System.out.print("zero");
		}

		System.out.println(pm);
		System.out.println(oe);

	}

	public static void main(String[] args) {

		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();

//		a.practice1();
		a.practice2();
	}

}
