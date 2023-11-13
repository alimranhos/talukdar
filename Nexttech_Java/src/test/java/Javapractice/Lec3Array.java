package Javapractice;

public class Lec3Array {

	public static void main(String[] args) {
		// Array where we can store multiple data in one variable 
		// Array is fixed
		//String fruit1="Mango";
		//store multiple in array
		//syntax:datatype[]variablename={"multiple data in one variable"}; 
		String[]fruits= {"Mango","Apple","Orage","Avocado"};
		//to access in array
		System.out.println(fruits[0]);
		int[]numbers= {15,10,20,15};
		System.out.println(numbers[1]);
		String[]cars= {"BMW","Honda","Toyto","Mazda"};
		System.out.println(cars[3]);
		
		//How to change the data in array
		//variable name[index number of data]="new data name";
		fruits[0]="Jackfruit";
		System.out.println(fruits[0]);
		numbers[1]=10;
		System.out.println(numbers[1]);
		System.out.println(cars.length);

	}

}
