package com.shapes;

public class Rectangle extends Quadrilateral {

	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2, dim1, dim2);

	}

	@Override
	public double perimeter() {
		// Perimeter
		return 2 * (dim1 + dim2);
	}

	@Override
	public double area() {
		// Area
		return dim1 * dim2;
	}

}