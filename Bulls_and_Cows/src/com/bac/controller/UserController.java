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
		userList.add(user);
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
}
