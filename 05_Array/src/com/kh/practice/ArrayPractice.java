package com.kh.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
		String fruit[] = new String[]{"사과", "파인애플", "복숭아", "자두", "메론"};
					
		System.out.print(fruit[2]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("정수 : ");
		num1 = Integer.parseInt(sc.nextLine());
		
		int input[] = new int[num1]; // 입력받은 정수만큼의 배열 크기(배열에 속한 값의 갯수)를 가짐
		
		for(int i = 0; i<num1; i++) {//입력받은 정수 만큼 반복
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			input[i] = Integer.parseInt(sc.nextLine()); //배열의 i번째 자리에 값 입력
			num2+=input[i]; //배열의 i번째 자리 수를 num2와 더한후 num2에 대입
		}
		System.out.println(Arrays.toString(input)); //배열의 모든 값 출력
		System.out.println(num2);		
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		String menu[] = {"치킨", "족발", "보쌈", "돈가스", "냉면"};
		String choice = null;
		String result = null;
		
		System.out.print("음식을 정해주세요 : ");
		choice = sc.nextLine();
		
		for(int i=0; i<menu.length; i++) { //메뉴 갯수만큼 반복
			if(choice.equals(menu[i])) { //정한 음식과 배열의 i번째 음식이 같다면
				result = "배달 가능"; break;//배달 가능에 대입 후 for문에서 빠져나옴(break)
			} else {
				result = "배달 불가능";
			}
		}
		System.out.print(result);
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		String input = null;
		
		System.out.print("주민등록번호 : ");
		input = sc.nextLine();
		
		char num[] = input.toCharArray(); // 입력받은 문자열을 문자로 배열
		char copy[] = new char[14]; // 복사받을 배열 선언 및 초기화
		
		System.arraycopy(num, 0, copy, 0, num.length); //num을 copy에 num 0에서 길이만큼(처음부터 끝까지) 복사
		
		for(int i=8; i<input.length(); i++) { // 성별자리 이후 부터 끝까지 반복
			copy[i] = '*'; // 성별자리 이후 부터의 배열에 * 대입
		}
		System.out.print(copy);		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
		String input = null;
	
		System.out.print("단어 입력 : ");
		input = sc.nextLine(); 

		char arr[] = input.toCharArray(); //입력 받은 문자열을 문자 배열로 변환
		int length = arr.length;		//배열의 길이
		
		for(int i=length - 1; i>=0; i--) { // 배열의 길이만큼 반복 ( -1 은 배열의 인덱스 값이 0부터 시작하기 때문)		
			System.out.print(arr[i]);	// 끝부터 출력
			
		}
		

		
	}
	
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		
//		ap.method1();
//		ap.method2();
//		ap.method3();
		ap.method4();
//		ap.method5();
		
	}
	
}
