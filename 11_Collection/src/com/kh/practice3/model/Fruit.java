package com.kh.practice3.model;

public class Fruit extends Farm {

	public Fruit() {
		super();
	}

	public Fruit(String kind, String name) {
		super(kind, name);
	}

	@Override
	public String toString() {
		return "과일 : " + getName();
	}

	
}
