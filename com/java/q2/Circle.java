package com.java.q2;

public class Circle extends Shape {

	private double radius;

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getTotalLengh() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void displayContent() {
		System.out.println("---------------------------Circle--------------------------------");
		System.out.println(getArea());
		System.out.println(getTotalLengh());
		System.out.println(getType());
		System.out.println(getRadius());
	}

}
