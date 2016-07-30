package com.shapes;

public class Triangle extends Shape {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double perimeter() {
		// Perimeter
		return a + b + c;
	}

	@Override
	public double area() {
		// Area
		double p = perimeter();
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
