package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10, 100, 50);
		Circle c = new Circle(30, 40, 10);
		Point p = new Point(10, 20);
		String s = "Triangle";
		
		drawTest(r);
		drawTest(c);
		drawTest(p);
		drawTest(s);
		
	}

	private static void drawTest(Object obj)
	{
		if (obj instanceof Drawable) {
			((Drawable)obj).draw();
		}
		else {
			System.out.println("그리기 객체가 아닙니다.");
		}
	}
}
