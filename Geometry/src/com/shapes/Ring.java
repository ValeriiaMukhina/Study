package com.shapes;

public class Ring extends Circle {

	private double rS;

	public Ring(double r, double rS) {
		super(r);
		this.rS = rS;
	}

	@Override
	public double perimeter() {
		// Perimeter
		return super.perimeter() - 2 * Math.PI * rS;
	}

	@Override
	public double area() {
		// Area
		return super.area() - Math.PI * rS * rS;
	}

}
