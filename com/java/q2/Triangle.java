package com.java.q2;

public class Triangle extends Shape {

	private Points p1;
	private Points p2;
	private Points p3;

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
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(Points p1, Points p2, Points p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public double getArea() {
		double s = getTotalLengh() / 2;
		return Math.sqrt(
				s * (s - p1.calculateDistance(p2)) * (s - p2.calculateDistance(p3)) * (s - p3.calculateDistance(p1)));
	}

	@Override
	public double getTotalLengh() {
		return p1.calculateDistance(p2) + p2.calculateDistance(p3) + p3.calculateDistance(p1);
	}

	@Override
	public String getType() {
		return "Triangle" + "type:" + determineTriangleType();
	}

	public String determineTriangleType() {
		double[] sides = { p1.calculateDistance(p2), p2.calculateDistance(p3), p3.calculateDistance(p1) };
		for (double side : sides) {
			double currentSide = side;
			int result = 0;
			for (double s : sides) {
				if (side == s && side != currentSide) {
					result++;
				}
			}
			if (result == 3) {
				return "Equilateral";
			}

			if (result == 2) {
				return "Scalene";
			}

		}
		return "Isosceles";
	}

}
