package com.placetube.impl;

import com.placetube.model.User;

public interface UserControllerImpl {

	public boolean login();

	public boolean signUp();

	public User viewProfile();

	public User updateProfile();

	public boolean deleteProfile();
	
}
