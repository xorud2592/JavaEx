package com.javaex.oop.point.v3;

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
	}

}
