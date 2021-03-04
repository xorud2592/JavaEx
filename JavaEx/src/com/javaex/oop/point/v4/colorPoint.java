package com.javaex.oop.point.v4;

public class colorPoint extends Point 
{
	private String color;
	
	public colorPoint(int x, int y, String color)
	{
		super(x,y);
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColot(String color)
	{
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.printf("색깔점[x=%d, y=%d, 색상=%s]를 그렸습니다.%n",getX(),getY(),color);
	}
	
	@Override
	public void draw(boolean show) 
	{
		String message = String.format("색깔점[x=%d, y=%d, 색상=%s]를 ",getX(),getY(),color);
		if(show)
			message += "그렸습니다.";
		else
			message += "지웠습니다.";
		System.out.println(message);
	}
}
