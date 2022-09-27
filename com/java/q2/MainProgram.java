package com.java.q2;

import java.util.ArrayList;

public class MainProgram {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		Points points = new Points(-2, 10);
		shapes.add(points);
		System.out.println(points.getArea());
		System.out.println(points.getTotalLengh());
		System.out.println(points.getType());
		System.out.println(points.toString());
		System.out.println("-----------------------------------------------------------");
		Rectangle rectangle = new Rectangle(new Points(-2, -6), new Points(-2, 4), new Points(7, 4), new Points(7, -6));
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getTotalLengh());
		System.out.println(rectangle.getType());
		System.out.println("Point 1 = " + rectangle.getP1().toString());
		System.out.println("Point 2 = " + rectangle.getP2().toString());
		System.out.println("Point 3 = " + rectangle.getP3().toString());
		System.out.println("Point 4 = " + rectangle.getP4().toString());
		System.out.println("-----------------------------------------------------------");
		Square square = new Square(new Points(0, 0), new Points(0, 5), new Points(5, 5), new Points(5, 0));
		System.out.println(square.getArea());
		System.out.println(square.getTotalLengh());
		System.out.println(square.getType());
		System.out.println("Point 1 = " + square.getP1().toString());
		System.out.println("Point 2 = " + square.getP2().toString());
		System.out.println("Point 3 = " + square.getP3().toString());
		System.out.println("Point 4 = " + square.getP4().toString());
		System.out.println("-----------------------------------------------------------");
		Triangle triangle = new Triangle(new Points(-3, -1), new Points(2, 3), new Points(2, -1));
		System.out.println(triangle.getArea());
		System.out.println(triangle.getTotalLengh());
		System.out.println(triangle.getType());
		System.out.println("Point 1 = " + triangle.getP1().toString());
		System.out.println("Point 2 = " + triangle.getP2().toString());
		System.out.println("Point 3 = " + triangle.getP3().toString());
		System.out.println("-----------------------------------------------------------");
		shapes.add(triangle);

		System.out.println(shapes.toString());

	}

}
