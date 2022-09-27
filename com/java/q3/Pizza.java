package com.java.q3;

public class Pizza {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE;

		public String getSize() {
			switch (this) {
			case SMALL:
				return "24cm";

			case MEDIUM:
				return "30cm";

			case LARGE:
				return "35cm";
			default:
				return null;
			}
		}

		public static void main(String[] args) {
			System.out.println("The size of the pizza is " + Size.SMALL.getSize());
		}
	}
}
