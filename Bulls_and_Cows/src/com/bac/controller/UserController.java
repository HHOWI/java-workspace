package com.bac.controller;

import java.util.ArrayList;
import java.util.List;

import com.bac.model.User;

public class UserController {

	private static UserController instance;
	private List<User> userList;
	private User loggedInUser;

	private UserController() {
		userList = new ArrayList<>();
	}

	public static synchronized UserController getInstance() {
		if (instance == null) {
			instance = new UserController();
		}
		return instance;
	}

	public boolean login(String id, String password) {
		for (User user : userList) {
			if (user.getId().equals(id) && user.getPassword().equals(password)) {
				loggedInUser = user;
				System.out.println(user.getNickname() + "님 환영합니다!");
				return true;
			}
		}
		return false;
	}

	public void signUp(User user) {

		if (isDuplicateId(user.getId())) {
			System.out.println("이미 사용 중인 아이디입니다. 다른 아이디를 선택해주세요.");
			return; // 회원가입 거부
		}

		userList.add(user);
		System.out.println("회원가입이 완료되었습니다.");
	}

	private boolean isDuplicateId(String id) {
		for (User user : userList) {
			if (user.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public void updateNickname(String newNickname) {
		loggedInUser.setNickname(newNickname);
		System.out.println("닉네임이 " + newNickname + " 으로 변경되었습니다.");

	}

	public boolean deleteProfile(String id, String password) {
		if (loggedInUser != null && loggedInUser.getId().equals(id) && loggedInUser.getPassword().equals(password)) {
			userList.remove(loggedInUser);
			loggedInUser = null;
			return true;
		} else {
			return false;
		}
	}
	
	public User getLoggedInUser() {
	    return loggedInUser;
	}
	
}
