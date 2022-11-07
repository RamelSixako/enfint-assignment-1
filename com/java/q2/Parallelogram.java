package com.java.q2;

public class Parallelogram extends Shape {

	private Points p1;
	private Points p2;
	private Points p3;
	private Points p4;
	private double height;

	/**
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public Parallelogram(Points p1, Points p2, Points p3, Points p4, int height) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.setHeight(height);
	}

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
	 * @return the p3
	 */
	public Points getP3() {
		return p3;
	}

	/**
	 * @param p3 the p3 to set
	 */
	public void setP3(Points p3) {
		this.p3 = p3;
	}

	/**
	 * @return the p4
	 */
	public Points getP4() {
		return p4;
	}

	/**
	 * @param p4 the p4 to set
	 */
	public void setP4(Points p4) {
		this.p4 = p4;
	}

	@Override
	public double getArea() {
		return (p1.calculateDistance(p2) * height);
	}

	@Override
	public double getTotalLengh() {
		return 2 * (p1.calculateDistance(p2) + p2.calculateDistance(p3));
	}

	@Override
	public String getType() {
		return "Rectangle";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void displayContent() {
		System.out.println("---------------------------" + getType() + "--------------------------------");
		System.out.println(getArea());
		System.out.println(getTotalLengh());
		System.out.println(getType());
		System.out.println("Point 1 = " + getP1().toString());
		System.out.println("Point 2 = " + getP2().toString());
		System.out.println("Point 3 = " + getP3().toString());
		System.out.println("Point 4 = " + getP4().toString());

	}

}
