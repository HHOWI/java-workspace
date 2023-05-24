package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

	int lotto[] = new int[6];

	public String information() {
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) ((Math.random() * 45) + 1);
			
			for(int j = 0; j < i; j++)
			if(lotto[i] == lotto[j]) {
				lotto[i] = (int) ((Math.random() * 45) + 1); 
				i--;
				break;
			}
		}
		return Arrays.toString(lotto);
	}

}
