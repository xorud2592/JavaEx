package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(10);
		p1.draw();
		p1.draw(false);
		
		Point p2 = new Point(15, 30);
		p2.draw();
		p2.draw(false);
		
		colorPoint cp = new colorPoint(20, 40, "검정");
		cp.draw();
		cp.draw(false);
		
		colorPoint cp2 = new colorPoint(30, 40, "빨강");
		cp2.draw();
		
		colorPoint cp3 = new colorPoint(50, 100, "파랑");
		cp.draw();
		cp.draw(false);
		
	}

}
