package com.CS501WS;

public class Rectangle {

	private double width = 0;
	private double length = 0;
	private String errorMessage;

	public Rectangle() {

	}

	public Rectangle(double _width, double _length) throws Exception {
		
		setWidth(_width);
		setLength(_length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) throws Exception {
		if(!(isValidNumber(width))){
			Exception e = new Exception(errorMessage);
            throw e;
		}
		else
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) throws Exception {
		if(!(isValidNumber(length))){
			Exception e = new Exception(errorMessage);
            throw e;
		}
		else
			this.length = length;
	}
	
	public double getAreaOfRectangle(){
		return getWidth() * getLength();
	}
	
	public double getPerimeterOfRectangle(){
		return  (2*getWidth()) + (2*getLength());
	}
	 public boolean isValidNumber(double dNumber)
	    {
	        if(dNumber > 0) return true;
	        errorMessage = "Invalid number" + " needs to be > 0";
			return false;
	    } 
	 public String getErrorMessage() { return errorMessage; }
}
