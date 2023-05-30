package com.youtube.model;

public class User {

	private String email;
	private String phone;
	private String id;
	private String pwd;
	private String nickName;
	private char gender;
	
	Video video;
	
	public User() {}
	
	public User(String email, String phone, String id, String pwd, String nickName, char gender) {
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.pwd = pwd;
		this.nickName = nickName;
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", pwd=" + pwd + ", nickName=" + nickName
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
