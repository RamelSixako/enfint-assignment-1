package com.java.q2;

public class Points extends Shape {

	private int x;
	private int y;

	public Points() {
		this(0, 0);
	}

	public Points(Points p) {
		this(p.x, p.y);
	}

	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	public double calculateDistance(Points p) {
		double xDiff = this.getX() - p.getX();
		double yDiff = this.getY() - p.getY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getTotalLengh() {
		return 0;
	}

	@Override
	public String getType() {
		return "Point";
	}

	@Override
	public String toString() {
		return "x:" + x + ",y:" + y;
	}
}
