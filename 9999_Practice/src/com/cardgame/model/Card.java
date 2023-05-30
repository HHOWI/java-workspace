package com.cardgame.model;

public class Card {

	private int suit;
	private int num;
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Card(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	public Card() {
	}
	
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", num=" + num + "]";
	}
	
	
}
