package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

	public static void main(String[] args) {

//		Snack s = new Snack();
		SnackController scr = new SnackController();
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
//		s.setKind(sc.nextLine());
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		s.setName(sc.nextLine());
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		s.setFlavor(sc.nextLine());
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
//		s.setNumOf(Integer.parseInt(sc.nextLine()));
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
//		s.setPrice(Integer.parseInt(sc.nextLine()));
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		scr.saveData(s);
		
		if(scr.saveData(s)) {
			System.out.println("저장 완료되었습니다.");
			System.out.println(scr.confirmData());
		}
			
		
//		System.out.println(s.getKind() + "(" + s.getName() + " - " + s.getFlavor() + ") " + s.getNumOf() + "개 " + (s.getNumOf() *s.getPrice()) + "원");
//		System.out.println(s);
		
		
		
		
		
	}

}
