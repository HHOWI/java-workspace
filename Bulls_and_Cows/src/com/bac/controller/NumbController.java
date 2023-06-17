package com.bac.controller;

import java.util.ArrayList;
import java.util.List;

import com.bac.model.Numb;

public class NumbController {

	Numb number = null;
	List<String> numbers = new ArrayList<>();

	public void selectNum(String input) {

		for (int i = 0; i < input.length(); i++) {
			String number = Integer.toString(Character.getNumericValue(input.charAt(i)));
			numbers.add(number);

		}

		number = new Numb(numbers.get(0), numbers.get(1), numbers.get(2));
		
		System.out.println(number);
	}

}
