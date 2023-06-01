package com.kh._abstract.step2;

public class PotatoPizza extends Pizza {

	public PotatoPizza(int price, String storeName) {
//		super(price, storeName);
		this.price = price; 		// protected라서 this로도 가능
		this.storeName = storeName; //

	}

	@Override
	public void topping() {
		System.out.println("PotatoPizza Topping...");
	}

}
