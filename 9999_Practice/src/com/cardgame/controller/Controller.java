package com.cardgame.controller;

import com.cardgame.model.Card;

public class Controller {

	Card c = new Card();
	
	public String drawcard(int suit, int num) {
		
		c.setSuit(suit);
		c.setNum(num);
		
		int suit = (int)Math.random()*4+1;
		int num = (int)Math.random()*13+1;
		
		String randomSuit = Integer.toString(suit);
				
		switch(randomSuit) {
		case 1: randomSuit = "스페이드";
				
			}
		
		
		return null;
	}
}
