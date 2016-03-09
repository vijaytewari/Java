package com.CS555;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestArea {
	
	//Atlanta, GA -84.3879 33.7489
	//Orlando, FL -81.3792 28.5383
	//Savannah, GA -81.0998 32.0835
	//Charlotte, NC -80.8431, 35.2270
	public static void  main(String[] args) {
		test();
	}
	
	@SuppressWarnings("unused")
	public static void test() {
		
		List<City> cities = new ArrayList<City>();
		City city = null;
		
		if(city == null){
			city = new City();
			city.cityCode = "ATL";
			city.cityName = "Atlanta";
			city.Latitude = 33.7489;
			city.Longitude = -84.3879;
			
			cities.add(city);
			city = new City();
			city.cityCode = "MCO";
			city.cityName = "Orlando";
			city.Latitude = 28.5383;
			city.Longitude = -81.3792;
			cities.add(city);
		
			
			city = new City();
			city.cityCode = "CLT";
			city.cityName = "Charlotte";
			city.Latitude = 35.2270;
			city.Longitude = -80.8431;
			cities.add(city);
			
			
			city = new City();
			city.cityCode = "SAV";
			city.cityName = "Savannah";
			city.Latitude = 32.0835;
			city.Longitude = -81.0998;
			cities.add(city);
			
		}
			
		System.out.println("Refactor1");
		CalculateAreaRefactor1 cd = new CalculateAreaRefactor1();
		cd.DistanceBetweenCity(cities);
		
		System.out.println("\n");
		System.out.println("Refactor2");
		CalculateAreaRefactor2 cd1 = new CalculateAreaRefactor2();
		cd1.DistanceBetweenCity(cities);
		
		System.out.println("\n");
		System.out.println("Refactor3");
		CalculateAreaRefactor3 cd2 = new CalculateAreaRefactor3();
		cd2.GetLongitudeLatitude(cities);
		
	}
	
}
