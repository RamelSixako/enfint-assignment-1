package com.java.q2;

import java.util.ArrayList;

public class MainProgram {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		Points points = new Points(-2, 10);
		Rectangle rectangle = new Rectangle(new Points(-2, -6), new Points(-2, 4), new Points(7, 4), new Points(7, -6));
		Square square = new Square(new Points(0, 0), new Points(0, 5), new Points(5, 5), new Points(5, 0));
		Triangle triangle = new Triangle(new Points(-3, -1), new Points(2, 3), new Points(2, -1));
		Circle circle = new Circle(2);
		Line line = new Line(new Points(0, 0), new Points(0, 5));
		Parallelogram parallelogram = new Parallelogram(new Points(0, 0), new Points(5, 3), new Points(5, 7),
				new Points(0, 4), 20);

		shapes.add(line);
		shapes.add(circle);
		shapes.add(triangle);
		shapes.add(square);
		shapes.add(rectangle);
		shapes.add(points);
		shapes.add(parallelogram);

		for (int i = 0; i < shapes.size(); i++) {
			displayShapeData(shapes.get(i));
		}

	}

	private static void displayShapeData(Object shape) {
		if (shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
			System.out.println("---------------------------Triangle--------------------------------");
			System.out.println(triangle.getArea());
			System.out.println(triangle.getTotalLengh());
			System.out.println(triangle.getType());
			System.out.println("Point 1 = " + triangle.getP1().toString());
			System.out.println("Point 2 = " + triangle.getP2().toString());
			System.out.println("Point 3 = " + triangle.getP3().toString());
		}

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			System.out.println("---------------------------Circle--------------------------------");
			System.out.println(circle.getArea());
			System.out.println(circle.getTotalLengh());
			System.out.println(circle.getType());
			System.out.println(circle.getRadius());

		}

		if (shape instanceof Square) {
			Square square = (Square) shape;
			System.out.println("--------------------------Square---------------------------------");
			System.out.println(square.getArea());
			System.out.println(square.getTotalLengh());
			System.out.println(square.getType());
			System.out.println("Point 1 = " + square.getP1().toString());
			System.out.println("Point 2 = " + square.getP2().toString());
			System.out.println("Point 3 = " + square.getP3().toString());
			System.out.println("Point 4 = " + square.getP4().toString());
		}

		if (shape instanceof Parallelogram) {
			Parallelogram parallelogram = (Parallelogram) shape;
			System.out.println("---------------------------Parallelogram--------------------------------");
			System.out.println(parallelogram.getArea());
			System.out.println(parallelogram.getTotalLengh());
			System.out.println(parallelogram.getType());
			System.out.println("Point 1 = " + parallelogram.getP1().toString());
			System.out.println("Point 2 = " + parallelogram.getP2().toString());
			System.out.println("Point 3 = " + parallelogram.getP3().toString());
			System.out.println("Point 4 = " + parallelogram.getP4().toString());
		}

		if (shape instanceof Line) {
			Line line = (Line) shape;
			System.out.println("---------------------------Line--------------------------------");
			System.out.println(line.getArea());
			System.out.println(line.getTotalLengh());
			System.out.println(line.getType());
			System.out.println("Point 1 = " + line.getP1().toString());
			System.out.println("Point 2 = " + line.getP2().toString());
		}

		if (shape instanceof Points) {
			Points points = (Points) shape;
			System.out.println("---------------------------Points--------------------------------");
			System.out.println(points.getArea());
			System.out.println(points.getTotalLengh());
			System.out.println(points.getType());
			System.out.println(shape.toString());

		}

		if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			System.out.println("---------------------------Rectangle--------------------------------");
			System.out.println(rectangle.getArea());
			System.out.println(rectangle.getTotalLengh());
			System.out.println(rectangle.getType());
			System.out.println("Point 1 = " + rectangle.getP1().toString());
			System.out.println("Point 2 = " + rectangle.getP2().toString());
			System.out.println("Point 3 = " + rectangle.getP3().toString());
			System.out.println("Point 4 = " + rectangle.getP4().toString());
		}

	}

}
