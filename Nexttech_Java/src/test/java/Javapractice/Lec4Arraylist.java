package Javapractice;

import java.util.ArrayList;

public class Lec4Arraylist {

	public static void main(String[] args) {
	    //ArrayList is resizable
		//Syntax:ArrayList<datatype>variablename=new ArrayList<datatype>();
		//add code of arraylist
		ArrayList<String>cars=new ArrayList<String>();//Create an arraylist object
		
		//Add the data
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Toyta");
		cars.add("Hundai");
		cars.add("ferari");
		System.out.println(cars);
		//access item
		//cars.get(0);
		System.out.println(cars.get(0));
		//change the item
		//use set()method,cars.set(0,"Bently");
		System.out.println(cars.set(1, "Bently"));
		//Remove item
		System.out.println(cars.remove(2));
		//Array list size
		//car.size
		System.out.println(cars.size());
		
		//for loop through arraylist
		for(int a=0;a<cars.size();a++) {
			System.out.println(cars.get(a));
		}

	}

}
