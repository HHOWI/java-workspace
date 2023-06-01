package com.kh.practice;

public class S23Ultra extends SmartPhone implements Pen {

	public S23Ultra() {}

	String name = "S23 Ultra";
	String brand = "삼성";
	

	@Override
	public boolean pen() {
		return true;
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String tackCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "2억 화소 카메라";
	}
	public void printInformation() {
	
		super.printinfomation(name, brand); //부모 클래스 접근 super
		System.out.println("팬 탑재 여부 : " + pen());
	}
}
