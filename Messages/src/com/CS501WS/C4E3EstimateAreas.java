package com.CS501WS;

/* Assignment exercise 4.3
 * BookEdition 10e
 * Author - Vijay Tewari
 * CS-501-WS
 */
public class C4E3EstimateAreas {

	public static void main(String[] args) {
	//Atlanta, GA -84.3879 33.7489
	//Orlando, FL -81.3792 28.5383
	//Savannah, GA -81.0998 32.0835
	//Charlotte, NC -80.8431, 35.2270
		
	double atlLon = -84.3879;
    double atlLat = 33.7489;
    double mcoLon = -81.3792;
    double mcoLat = 28.5383;
    double savLon = -81.0998;
    double savLat = 32.0835;
    double cltLon = -80.8431;
    double cltLat = 35.2270;
    
	//Divide 4 cities into 2 triangles
	//Triangle 1 - Atlanta Savannah Charlotte
	//Triangel 2 - Atlanta Savannah Orlando
	double atlsav = 0;
	double atlclt = 0;
	double savclt = 0;
	double savmco = 0;
	double atlmco = 0;
		
	//Calculate distance between atl and sav
	atlsav = findDistanceOfGreatCircle(savLat, atlLat, savLon, atlLon);//Calculate distance between atl and sav
	atlclt = findDistanceOfGreatCircle(atlLat, cltLat, atlLon, cltLon);//Calculate distance between atl and clt
	savclt = findDistanceOfGreatCircle(savLat, cltLat, savLon, cltLon);//Calculate distance between sav and clt
	savmco = findDistanceOfGreatCircle(savLat, mcoLat, savLon, mcoLon );//Calculate distance between sav and mco
	atlmco = findDistanceOfGreatCircle(atlLat, mcoLat, atlLon, mcoLon);//Calculate distance between atl and mco
	
	System.out.println("Distance between Atlanta and Savannah is :" +atlsav + " km");
	System.out.println("Distance between Atlanta and Charlotte is :" +atlclt+ " km");
	System.out.println("Distance between Savannah and Charlotte is :" +savclt+ " km");
	System.out.println("Distance between Savannah and Orlando is :" +savmco+ " km");
	System.out.println("Distance between Atlanta and Orlando is :" +atlmco+ " km");
	
	double t1 = findArea(atlsav,atlclt,savclt);
	System.out.println("The area of the cities Atlanta, Savannah and Charlotte is : " + t1 + "SqKm");
	double t2 = findArea(atlsav,atlmco,savmco);
	System.out.println("The area of the cities Atlanta, Savannah and Orlando is : " + t2 + "SqKm");
	double tArea = t1+t2;
	
	System.out.println("Total Area between the four cities are :" + tArea + "SqKm" );
	}
	
	public static double findDistanceOfGreatCircle(double x1, double x2, double y1, double y2)
	{
		double dist = 0;
		double radius = 6371.01;
    	dist = radius * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))
    			*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
    	return dist;
	}
	
    public static double findArea(double side1, double side2, double side3)
    { 
    	double area; double s;
        s = .5 * (side1 + side2 + side3);
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }



}
