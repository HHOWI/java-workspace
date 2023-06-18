package com.bac;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.bac.controller.NumbController;
import com.bac.controller.UserController;
import com.bac.model.User;

public class Application {

	NumbController nc = new NumbController();
	UserController uc = UserController.getInstance();
	Scanner sc = new Scanner(System.in);
	User user = new User();
	int winCount = 0;

	public static void main(String[] args) {

		Application app = new Application();

		app.mainMenu();

	}

	private void mainMenu() {

		System.out.println("=== 숫자 야구 ===");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 룰 설명");
		System.out.println("9. 게임 종료");
		System.out.println();
		System.out.print("원하는 메뉴의 숫자를 입력해주세요 : ");

		try {

			int input = Integer.parseInt(sc.nextLine());

			switch (input) {
			case 1:
				this.login();
				break;

			case 2:
				this.signUp();
				System.out.println();
				this.mainMenu();
				break;

			case 3:
				this.rule();
				this.mainMenu();
				break;
			case 9:
				System.out.println("게임을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다. 1, 2, 3, 4, 9 중 하나를 입력해주세요.");
				System.out.println();
				this.mainMenu();
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 1, 2, 3, 4, 9 중 하나를 입력해주세요.");
			System.out.println();
			this.mainMenu();
		}

	}

	private void login() {

		System.out.println();
		System.out.println("=== 로그인 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();

		if (uc.login(id, password)) {
			this.memberMenu();
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			System.out.println();
			this.mainMenu();
		}

	}

	private void memberMenu() {

		System.out.println("=== 회원 메뉴 ===");
		System.out.println("1. 게임 시작");
		System.out.println("2. 닉네임 변경");
		System.out.println("3. 나의 승리 횟수");
		System.out.println("4. 계정 삭제");
		System.out.println("9. 로그아웃");
		System.out.println();
		System.out.print("원하는 메뉴의 숫자를 입력해주세요 : ");

		try {

			int input = Integer.parseInt(sc.nextLine());

			switch (input) {
			case 1:
				this.playGame();
				break;

			case 2:
				this.nickNameUpdate();
				System.out.println();
				this.memberMenu();
				break;

			case 3:
				this.winCount();
				System.out.println();
				this.memberMenu();
				break;
			case 4:
				this.deleteProfile();
				System.out.println();
				this.mainMenu();
				break;
			case 9:
				System.out.println("로그아웃되어 메인메뉴로 돌아갑니다.");
				System.out.println();
				this.mainMenu();

				break;
			default:
				System.out.println("잘못된 입력입니다. 1, 2, 3, 4, 9 중 하나를 입력해주세요.");
				System.out.println();
				this.mainMenu();
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 1, 2, 3, 4, 9 중 하나를 입력해주세요.");
			System.out.println();
			this.mainMenu();
		}

	}

	private void signUp() {

		System.out.println();
		System.out.println("=== 회원가입 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("닉네임 : ");
		String nickname = sc.nextLine();
		System.out.println();

		uc.signUp(new User(id, password, nickname));

	}

	private void nickNameUpdate() {

		System.out.println();
		System.out.println("=== 닉네임 변경 ===");
		System.out.print("변경할 닉네임을 입력해주세요 : ");

		String newNickname = sc.nextLine();

		uc.updateNickname(newNickname);
		this.memberMenu();

	}

	private void deleteProfile() {

		System.out.println();
		System.out.println("=== 계정삭제 ===");
		System.out.println("계정 삭제 전 아이디와 비밀번호를 다시 확인합니다.");
		System.out.print("현재 로그인한 계정의 아이디를 입력해주세요. : ");
		String id = sc.nextLine();
		System.out.print("현재 로그인한 계정의 비밀번호를 입력해주세요. : ");
		String password = sc.nextLine();

		if (uc.deleteProfile(id, password)) {
			System.out.println(id + "님의 계정이 삭제 완료되었습니다.");
		} else {
			System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			this.deleteProfile();
		}

	}

	private void rule() {

		System.out.println();
		System.out.println("=== 게임 규칙 ===");
		System.out.println("컴퓨터가 정한 서로 다른 0에서 9 까지의 3개의 숫자맞춰야 한다.");
		System.out.println("숫자를 불러서 결과를 확인한다.");
		System.out.println("숫자는 맞지만 위치가 틀렸을 때는 볼.");
		System.out.println("숫자와 위치가 전부 맞으면 스트라이크.");
		System.out.println("물론 무엇이 볼이고 스트라이크인지는 알려주지 않는다.");
		System.out.println("숫자와 위치가 전부 틀리면 아웃.");
		System.out.println("아웃이 2번 되기 전에 모두 맞추면 승리한다.");
		System.out.println();

	}

	private void playGame() {

		System.out.println("게임을 시작합니다.");
		System.out.println("컴퓨터가 정한 세개의 숫자를 맞춰야 합니다.");
		System.out.println();

		int ball = 0;
		int strike = 0;
		int out = 0;
		
		
		this.comSelNum();

		this.userSelNum();

		if() {
			
			winCount++;
		}
		
	}

	private void userSelNum() {
		System.out.println();
		System.out.println("=== 숫자 선택 ===");
		System.out.print("숫자 3개를 000 형식으로 입력해 주세요. : ");
		String input = sc.nextLine();

		List<String> numbers = new ArrayList<>();

		for (int i = 0; i < input.length(); i++) {
			String number = Integer.toString(Character.getNumericValue(input.charAt(i)));
			numbers.add(number);

		}

		if (numbers.get(0).equals(numbers.get(1)) || numbers.get(0).equals(numbers.get(2))) {
			System.out.println("3개의 숫자는 서로 중복되지 않아야 합니다.");
			this.userSelNum();
		} else {
			nc.selectNum(input);
		}

	}

	private void comSelNum() {

		List<String> numbers = new ArrayList<>();

		Random random = new Random();

		while (numbers.size() < 3) {

			int randomNumber = random.nextInt(10); // 0부터 9까지의 랜덤한 숫자 선택

			String number = Integer.toString(randomNumber);

			if (!numbers.contains(number)) {
				numbers.add(number);
			}
		}

	}

	private void winCount() {
	    User loggedInUser = uc.getLoggedInUser();
	        System.out.println(loggedInUser.getNickname() + "님은 " + winCount + "번 승리하셨습니다.");
	}

}
