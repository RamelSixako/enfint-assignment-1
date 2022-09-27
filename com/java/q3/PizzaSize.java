package com.java.q3;

public enum PizzaSize {

	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public String getSize() {

		switch (this) {
		case SMALL:
			return "24cm";

		case MEDIUM:
			return "28cm";

		case LARGE:
			return "30cm";
		default:
			return null;
		}
	}

	public static void main(String[] args) {

	System.out.println("The size of the pizza is " + PizzaSize.SMALL.getSize());
	}
}
