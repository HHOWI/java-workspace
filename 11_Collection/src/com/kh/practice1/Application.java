package com.kh.practice1;

import java.util.Scanner;

import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public static void main(String[] args) {

		Application app = new Application();

		app.mainMenu();

	}

	public void mainMenu() {

		try {

			boolean check = true;

			while (check) {

				int input = 0;

				System.out.println("=====메인메뉴=====");
				System.out.println("1. 마지막 위치에 곡 추가");
				System.out.println("2. 첫 위치에 곡 추가");
				System.out.println("3. 전체 곡 목록 출력");
				System.out.println("4. 특정 곡 검색");
				System.out.println("5. 특정 곡 삭제");
				System.out.println("6. 특정 곡 정보 수정");
				System.out.println("7. 곡명 오름차순 정렬");
				System.out.println("8. 가수명 내림차순 정렬");
				System.out.println("9. 종료");
				System.out.print("메뉴번호 입력 : ");

				input = Integer.parseInt(sc.nextLine());

				switch (input) {
				case 1:
					this.addList();
					break;

				case 2:
					this.addAtZero();
					break;

				case 3:
					this.printAll();
					break;

				case 4:
					this.searchMusic();
					break;

				case 5:
					this.removeMusic();
					break;

				case 6:
					this.setMusic();
					break;

				case 7:
					this.ascTitle();
					break;

				case 8:
					this.dascArtist();
					break;

				case 9:
					System.out.print("종료");
					check = false;
					break;

				}

			}

		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다 : " + e.getMessage());
			this.mainMenu();
		}

	}

	public void addList() {

		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String name = sc.nextLine();
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();

		if(mc.addList(new Music(name, artist))) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	

	}

	public void addAtZero() {

		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String name = sc.nextLine();
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();

		if(mc.addAtZero(new Music(name, artist))) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		
		for(Music music : mc.printAll()) {
			System.out.println(music);
			
		}	
	}

	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		Music music = mc.searchMusic(sc.nextLine());
		
		if(music!=null) {
			
		} else {
			System.out.println("검색할 곡이 없습니다.");
		}
	}

	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		Music music = mc.removeMusic(sc.nextLine());

		if(music!=null) {
			System.out.println(music + "을 삭제 했습니다.");
		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}

	}

	public void setMusic() {

		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		
		Music music = new Music();
		
		System.out.print("수정할 곡 명 : ");
		music.setTitle(sc.nextLine());
		System.out.print("수정할 가수 명 : ");
		music.setArtist(sc.nextLine());
		
		Music result = mc.setMusic(title, music);
		
		if(result!=null) {
			System.out.println(result + "의 값이 변경 되었습니다.");
		} else {
			System.out.println("수정할 곡이 없습니다.");
		}
	}

	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		
		for(Music music : mc.ascTitle()) {
			System.out.println(music);
		}
	}

	public void dascArtist() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		
		for(Music music : mc.dascArtist()) {
			System.out.println(music);
		}
	}

}
