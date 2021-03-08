package com.javaex.api.objectclass.v3;

public class Point implements Cloneable {

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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
