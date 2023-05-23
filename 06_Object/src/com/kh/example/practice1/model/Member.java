package com.kh.example.practice1.model;

import java.util.Scanner;

public class Member {

	Scanner sc = new Scanner(System.in);
	
 public String memberId;
 public String memberPwd;
 public String memberName = "김민수";
 public int age;
 public char gender;
 public String phone;
 public String email;
 
 public void changeName(String name) { //매개변수!
	 memberName = name;
	 
 }
 public void printName() {
	 System.out.println(memberName);
 }

}
