package com.placetube.model;


// "위치기반" 동영상 플랫폼 + SNS
// 본인 주변에서 촬영된 영상들 노출 일종의 지역 SNS/커뮤니티 역할도 수행

public class User {

	public String email;
	public String phone;
	public String id;
	public String pwd;
	public String nickName;
	public char gender;
	public String place;
	
	public boolean login() { // 로그인
		return false;
	}
	
	public boolean signUp() { // 회원가입
		return false;
	}
	
	public User viewProfile() { // 프로필 보기
		return null;
	}
	
	public User updateProfile() { // 프로필 수정
		return null;
	}
	public boolean deleteProfile() { // 계정 삭제
		return false;
	}
}
