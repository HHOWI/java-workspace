package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

/*
 * controller : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당. 처리후 결과를 여기서 출력하지 않고 결과값을 다시 view에 반환. view에서 처리.
 *
 */
public class SnackController {
	
	private Snack s = new Snack();
	
	public SnackController() {}
	
	// 데이터를 setter를 이용해 저장하고 저장 되었다는 결과를 반환
	public boolean saveData(Snack s) {
		
		this.s.setKind(s.getKind());
		this.s.setName(s.getName());
		this.s.setFlavor(s.getFlavor());
		this.s.setNumOf(s.getNumOf());
		this.s.setPrice(s.getPrice());
		
		return true;
	}
	
	// 저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return this.s;
	}
}
