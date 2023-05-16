package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] agrs) {
		
		CastingPractice cp = new CastingPractice();
		cp.method1();
//		cp.method2();
	}
	
	// 형변환(char <-> int) 를 활용해보세요! 할 수 있어요! // 챗gpt에 물어보니 charAt(0)을 빼먹었었네요. 해결했습니다. 말씀해주신 것처럼 입력받은 값 활용한 출력으로 코드 수정했어요(이건 안 물어보고 직접 했어요 :D) 
		public void method1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자 : ");
			char ch = sc.next().charAt(0);		
			int i = (int) ch;
			
			System.out.printf("%c unicode : %d\n", ch, i);
			System.out.printf("%c unicode : %d", ch + 1,  i + 1);

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
			System.out.printf("평균 : %.2f", (float) ((num1 + num2 + num3)/3)); // 잘하셨어요! 단, 평균은 소수점 둘째자리까지 나오게 해보실래요? //해결했습니다 :D
		}
	}

