package Javapractice;

public class Lec5OOP {
	int number=5;
	String school="AIBT";
	String flower="Rose";
	String flower1="Sunflower";
	//create a method
	//syntax: accessmodifier returntype methodname(){block of code}
	
	
	public void fbsignup() {
		System.out.println("fbsignup");
	}

	public static void main(String[] args) {
		// Create an object of class i want to access
		Lec5OOP OOP=new Lec5OOP();//Syntax: classname object=new classname();
		//access the attribute
		System.out.println(OOP.number);
		System.out.println(OOP.school);

	}

}
