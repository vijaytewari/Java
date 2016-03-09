package com.CS555;

import java.util.List;

public class CalculateAreaRefactor2 {
	static double atlLon = 0;
	static double atlLat = 0;
	static double mcoLon = 0;
	static double mcoLat = 0;
	static double cltLon = 0;
	static double cltLat = 0;
	static double savLon = 0;
    static double savLat = 0;
	public static <list> void DistanceBetweenCity(List<City> cities){
		
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
	   
		//Divide 4 cities into 2 triangles
		//Triangle 1 - Atlanta Savannah Charlotte
		//Triangel 2 - Atlanta Savannah Orlando
		double atlsav = 0;
		double atlclt = 0;
		double savclt = 0;
		double savmco = 0;
		double atlmco = 0;
	
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
