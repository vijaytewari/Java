package com.CS501WS;

public class MyPoint {
	private double xValue;
	private double yValue;
	
	public MyPoint(){
		this.xValue=0;
		this.yValue=0;
	}

	public MyPoint(double x, double y){
		this.xValue=x;
		this.yValue=y;
	}
	
	public double getX() {
		return xValue;
	}

	public void setX(double x) {
		this.xValue = x;
	}

	public double getY() {
		return yValue;
	}

	public void setY(double y) {
		this.yValue = y;
	}

	public double distance(){
		
		return 0;
		
	}
	
	public double distance(double x, double y){
	double	d = Math.sqrt((x - xValue)*(x - xValue) + (y-yValue)*(y-yValue));
		//double d = (Math.pow(xValue - x,3)+ Math.pow(yValue -y, 2));
		return d;
	}
	
	
}
