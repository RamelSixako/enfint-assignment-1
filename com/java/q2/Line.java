package com.java.q2;

public class Line extends Shape {

	private Points p1;
	private Points p2;

	/**
	 * @return the p1
	 */
	public Points getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Points p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Points getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Points p2) {
		this.p2 = p2;
	}

	/**
	 * @param p1
	 * @param p2
	 */
	public Line(Points p1, Points p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getTotalLengh() {
		return p1.calculateDistance(p2);
	}

	@Override
	public String getType() {
		return "Line";
	}

}
