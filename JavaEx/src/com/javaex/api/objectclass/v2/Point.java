package com.javaex.api.objectclass.v2;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("Point(x=%d, y=%d)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point){
			return (x == ((Point)obj).x && y == ((Point)obj).y);
		}
		else {
			return super.equals(obj);
		}
	}
}
