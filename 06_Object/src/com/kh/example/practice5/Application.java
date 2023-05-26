package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;

public class Application {

	static Scanner sc = new Scanner(System.in);

	static EmployeeController employeeController = new EmployeeController();

	static Employee viewEmployee = new Employee();

	static int empNo = 0;
	static String name = null;
	static char gender = '\u0000';
	static String phone = null;
	static String dept = null;
	static int salary = 0;
	static double bonus = 0;

	public static void main(String[] args) {

		Application app = new Application();

//		int choice = app.employeeMenu();
//		for (; choice != 9;) {
//
//			app.employeeMenu();
//
//			if (choice == 1) {
//
//				app.insertEMP();
//
//			} else if (choice == 2) {
//
//				app.updateEMP();
//
//			} else if (choice == 3) {
//
//				app.printEMP();
//
//			}
//
//		}
//
//		System.out.println("프로그램을 종료합니다.");

		boolean check = true;
		int select = app.employeeMenu();
		while (check) {
			switch (select) {
			case 1:
				app.insertEMP();
				break;
			case 2:
				app.updateEMP();
				break;
			case 3:
				app.printEMP();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			}
		}

	}

	public int employeeMenu() {
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");

		System.out.print("메뉴 번호를 누르세요 : ");

		return Integer.parseInt(sc.nextLine());

	}

	public void insertEMP() {
		System.out.print("사원 번호 : ");
		empNo = Integer.parseInt(sc.nextLine());
		System.out.print("사원 이름 : ");
		name = sc.nextLine();
		System.out.print("사원 성별 : ");
		gender = sc.nextLine().charAt(0);
		System.out.print("전화 번호 : ");
		phone = sc.nextLine();

		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char answer = sc.nextLine().charAt(0);

		if (answer == 'y') {
			System.out.print("사원 부서 : ");
			dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			salary = Integer.parseInt(sc.nextLine());
			System.out.print("보너스 율 : ");
			bonus = Double.parseDouble(sc.nextLine());

			employeeController.add(empNo, name, gender, phone, dept, salary, bonus);

		} else {

			employeeController.add(empNo, name, gender, phone);

		}
	}

	public void updateEMP() {
		System.out.println("사원의 어떤 정보를 수정하시겠습니까? ");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");

		System.out.print("메뉴 번호를 누르세요 : ");
		int input = Integer.parseInt(sc.nextLine());

		switch (input) {
		case 1:
			System.out.print("전화 번호 입력 : ");
			phone = sc.nextLine();

			employeeController.modify(phone);
			break;

		case 2:
			System.out.print("사원 연봉 입력 : ");
			salary = Integer.parseInt(sc.nextLine());

			employeeController.modify(salary);
			break;

		case 3:
			System.out.print("보너스 율 입력 : ");
			bonus = Double.parseDouble(sc.nextLine());

			employeeController.modify(bonus);
			break;

		case 9:
			break;

		}

	}

	public void printEMP() {

		System.out.println(employeeController.info());

	}
}
