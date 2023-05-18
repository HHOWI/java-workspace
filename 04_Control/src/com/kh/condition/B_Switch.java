package com.kh.condition;

import java.util.Scanner;

public class B_Switch {

	Scanner sc = new Scanner(System.in);

	/*
	 * switch문
	 * 
	 * [표현법]
	 * 
	 * switch(조건식) {
	 * 		case 값1:
	 * 			... 조건식의 결과가 값1과 같을 경우 실행 코드 ...
	 * 			break;
	 * 		case 값2:
	 * 			... 조건식의 결과가 값2와 같을 경우 실행 코드 ...
	 * 			break;
	 * 		default:
	 * 			... 조건식의 결과가 일치하는 case문이 없을 때 실행 코드 ...
	 * }
	 * 
	 * - case문의 수는 무제한.
	 * - 조건식 결과는 정수, 문자, 문자열이어야 한다.
	 * - 조건문을 빠져나오려면 break가 필요하다.
	 * - default문은 생략 가능.
	 */
	
	public void method1() {
	
		/*
		 * 숫자를 입력받아
		 * 1 - 빨간색, 2 - 파란색, 3 - 초록색, 이외 - 잘못 입력하셨습니다
		 */
		
		int num = 0;
		String result = null;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
//		if(num == 1) {
//			result = "빨간색";
//		}
//		else if(num == 2) {
//			result = "파란색";
//		}
//		else if(num == 3) {
//			result = "초록색";
//		}
//		else {
//			result = "잘못 입력하셨습니다.";
//		}
		
		switch(num) {
		
		case 1:
			result = "빨간색";
			break;
		case 2:
			result = "파란색";
			break;
		case 3:
			result = "초록색";
			break;
		default:
			result = "잘못 입력하셨습니다.";		
		}
		
		System.out.print(result);
					
	}
	/*
	 * 등급별 권한
	 * 1 : 관리권한, 글쓰기권한, 읽기권한
	 * 2 : 글쓰기 권한, 읽기권한
	 * 3 : 읽기권한
	 */
	public void practice1() {
	
		int num = 0;
		String result1 = null;
		String result2 = null;
		String result3 = null;

		
		System.out.print("등급을 입력하세요 : ");
		num = sc.nextInt();
		
//		switch(num) {
//			
//			case 1:
//				result1 = "관리권한, 글쓰기권한, 읽기권한";
//				break;
//			case 2:
//				result1 = "글쓰기권한, 읽기권한";
//				break;
//			case 3:
//				result1 = "읽기권한";
//				
//		}
		switch(num) {
		
		case 1:
			result1 = "관리권한";
		case 2:
			result2 = "글쓰기권한";
		case 3:
			result3 = "읽기권한";
		}
		System.out.printf("%s\n%s\n%s", result1, result2, result3);
		
	}
	/*
	 * 월을 입력했을 때 계절을 출력
	 * 
	 * 3, 4, 5 : 봄
	 * 6, 7, 8, : 여름
	 * 9, 10, 11 : 가을
	 * 12, 1, 2 : 겨울
	 * 
	 * 월 > 5
	 * 봄
	 * 
	 * 월 > 11
	 * 가을
	 */
	public void practice2() {
		
		int month = 0;
		String season = null;
		
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		
		switch(month) {
		
		case 3: case 4: case 5: season = "봄";  break;
		case 6: case 7: case 8: season = "여름"; break;
		case 9: case 10: case 11: season = "가을"; break;
		default: season = "겨울";

		}
		System.out.print(season);	
				
				
	}
	public static void main(String[] args) {
		B_Switch b = new B_Switch();
//		b.method1();
//		b.practice1();
		b.practice2();
	}

}
