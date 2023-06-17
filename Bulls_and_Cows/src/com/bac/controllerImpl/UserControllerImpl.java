package com.bac.controllerImpl;

import com.bac.model.User;

public interface UserControllerImpl {

	public boolean login(String id, String password);

	public void signUp(User user);

	public User updateNickname();

	public void deleteProfile(String id);

}
