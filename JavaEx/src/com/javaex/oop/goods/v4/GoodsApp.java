package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods("LG Gram", 1500000);
		
		Goods smartphone = new Goods("iPhone SE", 650000);
		
		notebook.info();
	}

}