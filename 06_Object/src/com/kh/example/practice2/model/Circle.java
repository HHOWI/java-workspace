package com.kh.example.practice2.model;

public class Circle {

	public final static double PI = 3.14;
	public int radius = 1;
	
	public void incrementRadius() {
		radius++;
	}
	public double round() {
		return radius*2*PI;
	}
	public double area() {
		return radius*radius*PI;
	}
	
}
