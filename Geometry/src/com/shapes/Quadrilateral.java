package com.shapes;

public class Quadrilateral extends Shape {

	protected double dim1;
	protected double dim2;
	protected double dim3;
	protected double dim4;

	public Quadrilateral(double dim1, double dim2, double dim3, double dim4) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
		this.dim4 = dim4;
	}

	@Override
	public double perimeter() {
		// Perimeter
		return dim1 + dim2 + dim3 + dim4;
	}

	@Override
	public double area() {
		// Area
		double p = perimeter() / 2;
		return Math.sqrt((p - dim1) * (p - dim2) * (p - dim3) * (p - dim4));
	}

}
