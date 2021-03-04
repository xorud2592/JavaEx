package com.javaex.oop.goods.v4;

public class Goods {
	private String name;
	private int price;
	
	public Goods(String name)
	{
		this.name = name;
	}
	public Goods(String name, int price)
	{
		this(name);
		this.price = price;
	}
	
	
	public String getName()
	{
		return name;
	}
	
//	public void setName(String name)
//	{
//		this.name = name;
//	}
	
	public int getPrice()
	{
		return price;
	}
	
//	public void setPrice(int price)
//	{
//		this.price = price;
//	}
	
	public void info()
	{
		System.out.printf("%s, %d원%n",
				name, price);
	}
}
