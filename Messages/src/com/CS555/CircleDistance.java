package com.CS555;

public class CircleDistance {
	
	public  double findDistanceOfGreatCircle(double x1, double x2, double y1, double y2)
	{
		double dist = 0;
		double radius = 6371.01;
    	dist = radius * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))
    			*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
    	return dist;
	}
}
