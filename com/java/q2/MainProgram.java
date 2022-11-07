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
			((Triangle) shape).displayContent();
		} else if (shape instanceof Circle) {
			((Circle) shape).displayContent();
		} else if (shape instanceof Square) {
			((Square) shape).displayContent();
		} else if (shape instanceof Parallelogram) {
			((Parallelogram) shape).displayContent();

		} else if (shape instanceof Line) {
			((Line) shape).displayContent();
		} else if (shape instanceof Points) {
			((Points) shape).displayContent();
		} else {
			((Rectangle) shape).displayContent();
		}
	}
}
