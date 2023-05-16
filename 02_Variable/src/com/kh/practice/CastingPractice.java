package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] agrs) {
		
		CastingPractice cp = new CastingPractice();
		cp.method1();
//		cp.method2();
	}
		public void method1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자 : ");
			String str = sc.nextLine();		
			
			
			System.out.printf("A unicode : %d\n", str);
			System.out.printf("B unicode : %d", str + 1);

		}
		
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			int num1 = sc.nextInt();
			
			System.out.print("영어 : ");
			int num2 = sc.nextInt();
			
			System.out.print("수학 : ");
			int num3 = sc.nextInt();
			
			
			System.out.printf("국어 : %d\n", num1);
			System.out.printf("영어 : %d\n", num2);
			System.out.printf("수학 : %d\n", num3);
			System.out.printf("총점 : %d\n", num1 + num2 + num3);
			System.out.printf("평균 : %d", ((num1 + num2 + num3)/3));
		}
	}

