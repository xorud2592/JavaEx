package com.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(10);
		p1.draw();
		
		Point p2 = new Point(15, 30);
		p2.draw();
		
	}

}
