package com.CS555;

public class AreaOfTriangle {
	 public  double findArea(double side1, double side2, double side3)
	    { 
	    	double area; double s;
	        s = .5 * (side1 + side2 + side3);
	        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	        return area;
	    }
}
