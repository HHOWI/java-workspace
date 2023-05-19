package com.kh.loop;

import java.util.Scanner;

public class C_For {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		.. 실행 코드 ..
	 * }
	 * 
	 * - 주어진 횟수만큼 코드를 반복 실행하는 구문
	 * - 초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * - 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나간다.
	 * - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 * 
	 */
	// 1~5 출력
	public void method1() {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		for(int i=0; i<5; i++) {
			System.out.println(i+1);
		}
	}
	// 1~5 반대로 출력
	public void method2() {
		
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
	}
	// 1~10 사이의 홀수만 출력
	public void method3() {
		
		for(int i=0; i<=10; i++) {
			if(i%2 == 1) {
			System.out.println(i);
			}
		}
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);		
		}
		}
	// 1~10 사이의 짝수만 출력
	/*
	 * continue문
	 * 
	 * - continue문은 반복문 안에서 사용
	 * - 반복문 안에서 continue문을 만나게 되면 "현재 구문"을 종료
	 * - 반복문을 벗어나는 건 아님! 다음 반복을 계속 수행
	 */
	public void method4() {
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		for(int i=1; i<=10; i++) {
			if(i%2!=0) continue;
			System.out.println(i);
		}		
	}
	// 1~10까지의 합계
	public void method5() {		
		int num = 0;
		
		for(int i = 0; i<=10; i++) {		
			num += i; 
			System.out.println("1부터" + i + "까지의 합계 : " + num);
		}
		System.out.println(num);
	}
	// 1부터 사용자가 입력한 수 까지의 합계
	public void method6() {
		int num = 0;
		int sum = 0;
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {		
			sum += i; 
		}
		System.out.println("1부터" + num + "까지의 합계 : " + sum);
	}
	// 1부터 랜덤값까지의 합계
	public void method7() {
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출해서 매번 다른 랜덤값을 얻어낼 수 있음!
		 */
		
		double random = Math.random(); // 0.0 <= random < 1.0
		random = Math.random() * 10; // 0.0 <= random < 10.0
		random = Math.random() * 10 + 1; // 1.0 <= random < 11.0
		int num = (int) random; // 형변환으로 소수점 버리기
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합계 : " + sum);
	}
	/*
	 * H
	 * e
	 * l
	 * l
	 * o
	 */
	public void method8() {
		
//		for(char ch = 'H'; ch <= 'o'; ch++ ) {
//			switch(ch) {
//			case 'H': case 'e': case 'o':
//				
//			System.out.println(ch); break;
//			
//			case 'l':
//			
//			System.out.println(ch);
//			System.out.println(ch); break;
//			}
//		}
		
		String str = "Hello";
		
			for(int i=0; i<=4; i++) {
				System.out.println(str.charAt(i));
			}
	}
	// 사용자한테 입력받은 문자열 출력
	public void method9 () {
		String str = null;
		int num = 0;
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine();
		num = str.length();
		
		for(int i=0; i<num; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	// 구구단 - 2단 출력
	public void method10() {
		int dan = 0;
		int result = 0;
		
		for(int i=1; i<=9; i++) {
			dan = 2;
			result = dan * i;
			System.out.println(dan + " X " + i + " = " + result);
		}
		
	}
	// 사용자가 입력한 단을 출력
	public void method11() {	
		int dan = 0;
		int result = 0;
		
		System.out.print("단을 입력하십시오 : ");
		dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++) {
			result = dan * i;
			System.out.println(dan + " X " + i + " = " + result);
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}		
	}
	
	public void method12() {
		int result = 0;
		
		for(int dan = 2; dan<=9; dan++) { //속에 있는 for문부터 반복. 조건식 false가 되면 그 밖의 for문 반복
				for(int i=1; i<=9; i++) {
						result = dan * i;
							System.out.println(dan + " X " + i + " = " + result);
				}
				System.out.println();
		}	
	}
	/*
	 *  *****
	 *  *****
	 *  *****
	 *  *****
	 */
	public void method13() {	
		for(int j = 0; j<4; j++) {
			for(int i = 0; i<5; i++) {			
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 * 1*** i=0 j=0
	 * *2** i=1 j=1
	 * **3* i=2 j=2
	 * ***4 i=3 j=3
	 */
	public void method14() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i==j) {
					System.out.print(i+1);
				}
				else {
					System.out.print("*");
				}			
			}
			System.out.println();
		}
	}
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public void method15() {
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {			
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	/*
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 */
	public void method16() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=1; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}			
	}
	public static void main(String[] args) {
		C_For c = new C_For();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
//		c.method6();
//		c.method7();
//		c.method8();
//		c.method9();
//		c.method10();
//		c.method11();
//		c.method12();
//		c.method13();
//		c.method14();
//		c.method15();
		c.method16();
	}

}
