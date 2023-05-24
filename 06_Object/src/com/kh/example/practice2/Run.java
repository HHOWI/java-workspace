package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
//		System.out.println(c.round());
//		System.out.println(c.area());
		
		System.out.println(2*c.radius*Circle.PI);
		System.out.println(c.radius*c.radius*Circle.PI);
		
		c.incrementRadius();
		
//		System.out.println(c.round());
//		System.out.println(c.area());
		
		System.out.println(2*c.radius*Circle.PI);
		System.out.println(c.radius*c.radius*Circle.PI);
		
	}

}
