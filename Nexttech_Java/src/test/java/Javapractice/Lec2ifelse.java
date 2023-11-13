package Javapractice;

public class Lec2ifelse {

	public static void main(String[] args) {
		// if statement
		
		int x=99;
		int y=69;
		if(x>y) {
			System.out.println("x is greater than y");
			System.out.println("x>y");
			System.out.println("nexttechitc USA");
		}
		
		else {
			System.out.println("nexttechitc BD");
		}
		
		int b=50;
		int c=100;
		if (b<c) {
			System.out.println("good morning");
		}
		else {	
			System.out.println("good night");
		}
		// multiple condition
		int time=24;
		if (time<12) {
			System.out.println("good morning");
		}else if (time<14) {
			System.out.println("good noon");
		}else {
			System.out.println("good evening");
		}
		// grading system
		int testscore=90;
		char grade;
		if (testscore>=90) {
			grade='A';
		} else if (testscore>=80) {
			grade='B';
		} else if (testscore>=70) {
			grade='C';
		} else {
			grade='F';
		}
		System.out.println("Grade=" + grade);

	}

}
