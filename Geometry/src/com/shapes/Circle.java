package com.shapes;

public class Circle extends Shape {

	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double perimeter() {
		// Perimeter
		return 2 * Math.PI * r;
	}

	@Override
	public double area() {
		// Area
		return Math.PI * r * r;
	}

}