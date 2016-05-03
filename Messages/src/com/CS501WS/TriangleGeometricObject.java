package com.CS501WS;

public class TriangleGeometricObject extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	private static boolean Invalid = false;

	public TriangleGeometricObject() {

	}

	public TriangleGeometricObject(double side1, double side2, double side3,
			String color, boolean filled) throws InvalidSideException {
		if ((validTrianlge(side1, side2, side3)) == false) {
			System.out.println("Valid Triangle");
			Invalid = false;
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			this.setColor(color);
			this.setFilled(filled);
		}
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double tSide1) {
		if (tSide1 < 1) {
			Invalid = true;
			System.out.println("Invalid side.");
		}
		this.side1 = tSide1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double tSide2) {
		if (tSide2 < 1) {
			Invalid = true;
			System.out.println("Invalid side.");
		}
		this.side2 = tSide2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double tSide3) {
		if (tSide3 < 1) {
			Invalid = true;
			System.out.println("Invalid side.");
		}
		this.side3 = tSide3;
	}

	public static double getArea(double side1, double side2, double side3) {
		if (Invalid == false) {
			double area;
			double s;
			s = .5 * (side1 + side2 + side3);
			area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			System.out.println("The area of the triangle is " + area);
			return area;
		}
		return 0;
	}

	public static double getPerimeter(double side1, double side2, double side3) {
		if (Invalid == false) {
			double perimeter;
			perimeter = side1 + side2 + side3;
			System.out.println("The perimeter of the triangle is " + perimeter);
			return perimeter;
		}
		return 0;
	}

	public void printTriangle() {
		if (Invalid == false) {
			System.out.println("Triangle is created on:" + getDateCreated()
					+ "\nArea is :" + getArea(side1, side2, side3)
					+ "\nPerimeter is :" + getPerimeter(side1, side2, side3)
					+ "\nColor is : " + getColor() + "\nIs filled :"
					+ isFilled());
		}

	}

	public boolean validTrianlge(double a, double b, double c) {
		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			return false;
		} else {
			Invalid= true;
			System.out.println("Invalid triangle");
			return true;
		}

	}
}
