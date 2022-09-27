package com.java.q2;

public class Square extends Rectangle {

	public Square(Points p1, Points p2, Points p3, Points p4) {
		super(p1, p2, p3, p4);
	}

	@Override
	public String getType() {
		return "Square";
	}

}
