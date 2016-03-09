    //Find the area between 4 cities.
	//GPS locations of 4 cities.
	//Atlanta, GA -84.3879 33.7489
	//Orlando, FL -81.3792 28.5383
	//Savannah, GA -81.0998 32.0835
	//Charlotte, NC -80.8431, 35.2270
package com.CS555;


public class CS555H06RefactorPractice {

	public static void main(String[] args) {

		
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
	double radius = 6371.01;	
	//Calculate distance between atl and sav
	
	atlsav = radius * Math.acos(Math.sin(Math.toRadians(savLat))*Math.sin(Math.toRadians(atlLat))+Math.cos(Math.toRadians(savLat))
			*Math.cos(Math.toRadians(atlLat))*Math.cos(Math.toRadians(savLon)-Math.toRadians(atlLon)));
	
	atlclt = radius * Math.acos(Math.sin(Math.toRadians(atlLat))*Math.sin(Math.toRadians(cltLat))+Math.cos(Math.toRadians(atlLat))
			*Math.cos(Math.toRadians(cltLat))*Math.cos(Math.toRadians(atlLon)-Math.toRadians(cltLon)));
	
	savclt = radius * Math.acos(Math.sin(Math.toRadians(savLat))*Math.sin(Math.toRadians(cltLat))+Math.cos(Math.toRadians(savLat))
			*Math.cos(Math.toRadians(cltLat))*Math.cos(Math.toRadians(savLon)-Math.toRadians(cltLon)));
	
	savmco = radius * Math.acos(Math.sin(Math.toRadians(savLat))*Math.sin(Math.toRadians(mcoLat))+Math.cos(Math.toRadians(savLat))
			*Math.cos(Math.toRadians(mcoLat))*Math.cos(Math.toRadians(savLon)-Math.toRadians(mcoLon)));
	
	atlmco = radius * Math.acos(Math.sin(Math.toRadians(atlLat))*Math.sin(Math.toRadians(mcoLat))+Math.cos(Math.toRadians(atlLat))
			*Math.cos(Math.toRadians(mcoLat))*Math.cos(Math.toRadians(atlLon)-Math.toRadians(mcoLon)));
	
	
	System.out.println("Distance between Atlanta and Savannah is :" +atlsav + " km");
	System.out.println("Distance between Atlanta and Charlotte is :" +atlclt+ " km");
	System.out.println("Distance between Savannah and Charlotte is :" +savclt+ " km");
	System.out.println("Distance between Savannah and Orlando is :" +savmco+ " km");
	System.out.println("Distance between Atlanta and Orlando is :" +atlmco+ " km");
	
	
	double s; double area1; double area2;
	//double side1 = 0; double side2 = 0; double side3 = 0;
	
    s = .5 * (atlsav + atlclt + savclt);
    area1 = Math.sqrt(s*(s-atlsav)*(s-atlclt)*(s-savclt));
    
    s = .5 * (atlsav + atlmco + savmco);
    area2 = Math.sqrt(s*(s-atlsav)*(s-atlmco)*(s-savmco));

    double tArea = area1+area2;
	
	System.out.println("Total Area between the four cities are :" + tArea + "SqKm" );
	}
	
}
