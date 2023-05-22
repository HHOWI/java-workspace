package com.kh.loop;

import java.util.Scanner;

public class D_While {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * while(조건식) {
	 * 		.. 실행 코드 ..
	 * }
	 */
	public void method1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	/*
	 * break문
	 * - switch, 반복문 싱행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함된 반복문에서만 빠져나감
	 */
	
	// for문 무한루프=무한반복
//	public void method2() {
//		for(int i=1; i<=5;) {
//			System.out.println(i);
//			i++;
//		}
//			for(int i=1; ;) {
//				if(i<=5) {
//					System.out.println(i);
//				}
//				else {
//					break;
//				}
//				i++;
//			}
//		}
//		int i=1;
//		for(;;) {
//			if(i<=5) {
//				System.out.println(i);
//			}
//			else {
//				break;
//			}
//			i++;
//		}
//	}
//}
	public void method3() {
		int input = 0;
		while(true) {
			System.out.print("숫자 입력 > ");
			input = sc.nextInt();
			System.out.println(input);
		}
	}
	
	/*
	 * do-while문
	 * 
	 * [표현법]
	 * 
	 * do {
	 * 		.. 실행 코드 ..		
	 * } while(조건식);
	 * 
	 * - 조건과 상관없이 무조건 한 번은 실행
	 */
	public void method4() {
		int num = 1;
		
		while(num == 0) {
			System.out.println("while문");
		}
		
		do {
			System.out.println("do-while문");
		} while(num == 0);
	}
	
	//반복문 + 조건문
	/*
	 * 숫자 맞히기 게임!
	 * 1과 100 사이의 값을 입력해서 임의로 지정한(Random) 값을 맞히면 게임 끝!
	 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력!
	 * (예 : 57)
	 *  1과 100 사이의 값 입력 > 35
	 *  더 큰 수를 입력하세요.
	 *  1과 100 사이의 값 입력 > 70
	 *  더 작은 수를 입력하세요.
	 *  1과 100 사이의 값 입력 > 57
	 *  3번 만에 맞췄습니다.
	 */
	public void method5() {
		int num = 0;
		int random = (int)(Math.random() * 100) + 1;
		int count = 0;
	
			while(num!=random) { //num 값과 랜덤 값이 같지 않으면 반복
				System.out.print("1과 100 사이의 값 입력 : ");
				num = sc.nextInt();	//num 값 입력받음
			if(num>random) { //num 값이 랜덤 값보다 클 때 출력
				System.out.println("더 작은 수를 입력하세요.");	
			}
			else if(num<random) { //num 값이 랜덤 값보다 작을 때 출력
				System.out.println("더 큰 수를 입력하세요.");			
			}			
			count++; //반복할 때 마다 카운트
		}		//num 값과 랜덤 값이 일치하게 되면 빠져나옴
		System.out.println(count + "번 만에 맞췄습니다.");
		System.out.println(random);
		
	}
	/*
	 * -----------------------------------------
	 * 1.예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * -----------------------------------------
	 * 선택 > 1
	 * 예금액 > 5000
	 * 
	 * -----------------------------------------
	 * 1.예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * -----------------------------------------
	 * 선택 > 2
	 * 출금액 > 2000
	 * 
	 * -----------------------------------------
	 * 1.예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * -----------------------------------------
	 * 선택 > 3
	 * 잔고 > 3000
	 * 
	 * -----------------------------------------
	 * 1.예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * -----------------------------------------
	 * 선택 > 4
	 * 프로그램 종료
	 */
	public void method6() {
		int input = 0;
		int money = 0;
		String str = null;
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택 > ");
			//Integer.parseInt : Integer 클래스의 parseInt 메소드 (String -> int)
			
			input = Integer.parseInt(sc.nextLine());
			
//			if(input == 1) {
//				System.out.print("예금액 > ");
//				money = sc.nextInt();
//				System.out.println("");
//			} else if(input == 2) {
//				System.out.print("출금액 > ");
//				money = sc.nextInt();
//				System.out.println("");
//			} else if(input == 3) {
//				System.out.print("잔고 > ");
//				money = sc.nextInt();
//				System.out.println("");
//			} else {
//				System.out.print("프로그램 종료");
//				System.out.println(""); break;
//			}
			switch(input) {
			case 1: System.out.print("예금액 > ");
					money += Integer.parseInt(sc.nextLine());
					System.out.println(""); break;
			case 2: System.out.print("출금액 > ");
					money -= Integer.parseInt(sc.nextLine());
					System.out.println(""); break;
			case 3: System.out.print("잔고 > ");
					System.out.println(money);
					System.out.println(""); break;
			case 4: System.out.println("프로그램 종료");
					System.out.println(""); 
					run = false; break;
			}
		}
	
	}
	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
//		d.method5();
		d.method6();
	}

}
