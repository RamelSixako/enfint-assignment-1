package com.java.q2;

public class Rectangle extends Parallelogram {

	/**
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public Rectangle(Points p1, Points p2, Points p3, Points p4) {
		super(p1, p2, p3, p4, 0);
	}

	@Override
	public double getArea() {
		return (getP1().calculateDistance(getP2()) * getP2().calculateDistance(getP3()));
	}

	@Override
	public double getTotalLengh() {
		return 2 * (getP1().calculateDistance(getP2()) + getP2().calculateDistance(getP3()));
	}

	@Override
	public String getType() {
		return "Rectangle";
	}

}
