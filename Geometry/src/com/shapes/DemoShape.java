package com.shapes;

public class DemoShape {

	public static void main(String[] args) {

		Quadrilateral quadr = new Quadrilateral(2, 3, 4, 5);
		System.out.println("Perimeter of Quadrilateral = " + quadr.perimeter());
		System.out.println("Area of Quadrilateral = " + quadr.area());

		Rectangle rect = new Rectangle(2, 4);
		System.out.println("Perimeter of Rectangle = " + rect.perimeter());
		System.out.println("Area of Rectangle = " + rect.area());

		Square sq = new Square(2);
		System.out.println("Perimeter of Square = " + sq.perimeter());
		System.out.println("Area of Square = " + sq.area());

		Circle circle = new Circle(1);
		System.out.println("Perimeter of Circle = " + circle.perimeter());
		System.out.println("Area of Circle = " + circle.area());

		Ring ring = new Ring(2, 1);
		System.out.println("Perimeter of Ring = " + ring.perimeter());
		System.out.println("Area of Ring = " + ring.area());

		Triangle triangle = new Triangle(2, 5, 6);
		System.out.println("Perimeter of Triangle = " + triangle.perimeter());
		System.out.println("Area of Triangle = " + triangle.area());

		Trapezium trapezium = new Trapezium(2, 5, 6, 4);
		System.out.println("Perimeter of Trapezium = " + trapezium.perimeter());
		System.out.println("Area of Trapezium = " + trapezium.area());

	}

}
