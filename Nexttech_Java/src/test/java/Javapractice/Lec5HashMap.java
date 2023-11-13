package Javapractice;

import java.util.HashMap;

public class Lec5HashMap {

	public static void main(String[] args) {
		// HashMap<String,String>CapitalCities=new HasMap<String,String>();
		//Store 4 city and state name
		HashMap<String,String>CountriesCities=new HashMap<String,String>();
		CountriesCities.put("Bangladesh","Dhaka");
		CountriesCities.put("Australia","Sydney");
		CountriesCities.put("India","Deli");
		CountriesCities.put("USA","Washington DC");
		System.out.println(CountriesCities);
		// access an item
		//CountriesCites.get();
		System.out.println(CountriesCities.get("Bangladesh"));
		//remove an item
		//CountriesCities.remove();
		System.out.println(CountriesCities.remove("Australia"));
		//HashMap size
		System.out.println(CountriesCities.size());
		//Loop through a HashMap
		for(String i:CountriesCities.keySet()) {
			System.out.println(i);
		}
		for(String i:CountriesCities.values()) {
			System.out.println(i);
		}
		for(String i:CountriesCities.keySet()) {
			System.out.println("key:"+i+"value:"+CountriesCities.get(i));
		}


	}

}
