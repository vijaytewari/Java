package com.CS501WS;

public class C10E4MyPointTest {

	public static void main(String[] args) {
		double xPoint = 10;
		double yPoint = 30.5;
		
		MyPoint mylocation = new MyPoint();
		System.out.println("The formula uses in calculating the distance is Math.sqrt((x - xValue)*(x - xValue) - (y-yValue)*(y-yValue)); ");
		System.out.println("To calculate distance between two point where x, y are defaulted to 0,0 and the "
				+ "second point is (8,6)\nthe program will use the default constructor and calculate the distance.");
		System.out.println("\nSo the distance from location A(default) to location B(10,30.5) is:"
				+ " "+ mylocation.distance(xPoint, yPoint));
		
		MyPoint otherlocation = new MyPoint(xPoint, yPoint);
		System.out.println("\n\nTo calculate distance between two different location"
				+ " like were point A is (8,8) and point B is (15, 6) -\nthe program uses a second constructor were value can be passed "
				+ "and the value for classes member variable can be set");
		
		double xA1=8;
		double yA1=8;
		double xB2=15;
		double yB2=6;
		
		System.out.println("\nSet the x and y coordinates by calling the setter methods. Value set are 8, 8");
		otherlocation.setX(xA1);
		otherlocation.setY(yA1);
		
		System.out.println("\nCalling the distance method to calculate the distance between B point to set values of A point");
		System.out.println("The distance between A and B is : " + otherlocation.distance(xB2, yB2));
		
		

		System.out.println("\n\n\nThe formula used in calculating the distance is Math.sqrt((x - xValue)*(x - xValue) + (y-yValue)*(y-yValue)); ");
	}

}
