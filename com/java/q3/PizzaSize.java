package com.java.q3;

public enum PizzaSize {

	SMALL("24cm"), MEDIUM("28cm"), LARGE("30cm"), EXTRALARGE("36cm");

	private final String size;

	PizzaSize(String string) {
		this.size = string;
	}

	public String getSize() {

		switch (this) {
		case SMALL:
			return size;

		case MEDIUM:
			return size;

		case LARGE:
			return size;
		case EXTRALARGE:
			return size;
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		System.out.println("The size of the pizza is " + PizzaSize.SMALL.getSize());
	}
}
