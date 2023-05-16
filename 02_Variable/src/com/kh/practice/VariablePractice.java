package com.kh.practice;

import java.util.Scanner;

public class VariablePractice { 
	
	//FQCN 패키지명 + 클래스명

	public static void main(String[] agrs) {
		
		VariablePractice vp = new VariablePractice();
//		vp.method1();
//		vp.method2();
		vp.method3();
//		vp.method4();
		
	}
	
	public void method1() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();		
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("더하기 결과 : %d\n", num1 + num2);
		System.out.printf("빼기 결과 : %d\n", num1 - num2);
		System.out.printf("곱하기 결과 : %d\n", num1 * num2);
		System.out.printf("나누기 몫 결과 : %d\n", num1 / num2);
		
}
	
	public void method2() {

		int adult = 10000;
		int youth = 7000;
		
		System.out.printf("성인 2명 : %d\n", adult = adult * 2);
		System.out.printf("청소년 3명 : %d\n\n", youth = youth * 3);
		System.out.printf("총 금액 : %d\n", adult + youth);
	}
	
	public void method3() {
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		int num = x;
		x = y;
		y = z;
		z = num; // 여기 부분! - 2를 사용하지 않고 다시 생각해보실래요? // 이렇게 푸는게 맞을까요?
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
	
	public void method4() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();	
		
		System.out.printf("첫번째 문자 : %s\n", str.charAt(0));
		System.out.printf("마지막 문자 : %s", str.charAt(str.length()-1)); // 오! 잘하셨습니다 :)

	}
}