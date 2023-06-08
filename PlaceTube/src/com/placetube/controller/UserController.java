package com.placetube.controller;

import com.placetube.model.User;

public class UserController {

User user = null;
	
	
	public boolean login(String id, String password) {
		if(user!=null && user.getId().equals(id) && user.getPwd().equals(password)) {
			return true;
		}
		return false;
	}

	
	public void signUp(User user) {
		this.user = user;
	}

	public User viewProfile() { //프로필 보기 (로그인 된 경우)
		if(login(user.getId(), user.getPwd())) {
			return user;
		}
		return null;
	}

	public User updateProfile() { // 프로필 수정 (로그인 된 경우)
		if(login(this.user.getId(), this.user.getPwd())) {
			this.user = user;
		}
		return this.user;
	}

	public void deleteProfile(String id) { // 계정 삭제
		if(user.getId().equals(id)) {
			user = null;
		}
	}
}
