package com.shapes;

public class Square extends Rectangle {

	public Square(double dim1) {
		super(dim1, dim1);
	}

	@Override
	public double perimeter() {
		// Perimeter
		return 4 * dim1;
	}

	@Override
	public double area() {
		// Area
		return dim1 * dim1;
	}

}
