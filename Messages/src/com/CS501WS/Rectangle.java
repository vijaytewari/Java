package com.CS501WS;

public class Rectangle {

	private double width = 0;
	private double length = 0;

	public Rectangle() {

	}

	public Rectangle(double _width, double _length) {
		setWidth(_width);
		setLength(_length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getAreaOfRectangle(){
		return getWidth() * getLength();
	}
	
	public double getPerimeterOfRectangle(){
		return  (2*getWidth()) + (2*getLength());
	}

}
