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
	public User() {
	}
	public User(String email, String phone, String id, String pwd, String nickName, char gender, String place) {
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.pwd = pwd;
		this.nickName = nickName;
		this.gender = gender;
		this.place = place;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", pwd=" + pwd + ", nickName=" + nickName
				+ ", gender=" + gender + ", place=" + place + "]";
	}
	
	
}
