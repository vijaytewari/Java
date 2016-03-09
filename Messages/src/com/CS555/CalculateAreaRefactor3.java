package com.CS555;

import java.util.List;

public class CalculateAreaRefactor3 {
	static double atlLon = 0;
	static double atlLat = 0;
	static double mcoLon = 0;
	static double mcoLat = 0;
	static double cltLon = 0;
	static double cltLat = 0;
	static double savLon = 0;
    static double savLat = 0;
    static double atlsav = 0;
    static double atlclt = 0;
    static double savclt = 0;
    static double savmco = 0;
    static double atlmco = 0;
    
    public static <list> void GetLongitudeLatitude(List<City> cities){
		for (int i=0; i<cities.size(); i++)	{
			switch(cities.get(i).cityCode){
			case "ATL":
				 atlLon = cities.get(i).Longitude;
			     atlLat = cities.get(i).Latitude;
			case "MCO":
				 mcoLon = cities.get(i).Longitude;
				 mcoLat = cities.get(i).Latitude;
			case "CLT":
				cltLon = cities.get(i).Longitude;
			    cltLat = cities.get(i).Latitude;
			case "SAV":
				savLon = cities.get(i).Longitude;
			    savLat = cities.get(i).Latitude;
			}
		}
		AreaBetweenCities();
	}
    
	public static void AreaBetweenCities(){
		//Divide 4 cities into 2 triangles
		//Triangle 1 - Atlanta Savannah Charlotte
		//Triangel 2 - Atlanta Savannah Orlando
		DistanceBetween2Points();
		AreaOfTriangle at = new AreaOfTriangle();
		double area1 = at.findArea(atlsav,atlclt,savclt);
		//System.out.println("The area of the cities Atlanta, Savannah and Charlotte is : " + area1 + "SqKm");
		double area2 = at.findArea(atlsav,atlmco,savmco);
		//System.out.println("The area of the cities Atlanta, Savannah and Orlando is : " + area2 + "SqKm");

	    double tArea = area1+area2;
		
		System.out.println("Total Area between the four cities are :" + tArea + "SqKm" );
		
	}
	
	private static void DistanceBetween2Points() {
		
		CircleDistance cd = new CircleDistance();
		atlsav = cd.findDistanceOfGreatCircle(savLat, atlLat, savLon, atlLon);//Calculate distance between atl and sav
		atlclt = cd.findDistanceOfGreatCircle(atlLat, cltLat, atlLon, cltLon);//Calculate distance between atl and clt
		savclt = cd.findDistanceOfGreatCircle(savLat, cltLat, savLon, cltLon);//Calculate distance between sav and clt
		savmco = cd.findDistanceOfGreatCircle(savLat, mcoLat, savLon, mcoLon );//Calculate distance between sav and mco
		atlmco = cd.findDistanceOfGreatCircle(atlLat, mcoLat, atlLon, mcoLon);//Calculate distance between atl and mco
		System.out.println("Distance between Atlanta and Savannah is :" +atlsav + " km");
		System.out.println("Distance between Atlanta and Charlotte is :" +atlclt+ " km");
		System.out.println("Distance between Savannah and Charlotte is :" +savclt+ " km");
		System.out.println("Distance between Savannah and Orlando is :" +savmco+ " km");
		System.out.println("Distance between Atlanta and Orlando is :" +atlmco+ " km");
	}

}
