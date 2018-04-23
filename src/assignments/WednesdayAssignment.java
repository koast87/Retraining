package assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WednesdayAssignment {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calcCircumference();
		//triangleArea();
		//evenOdd();
		//decimalPlace();
		//letterAsNumber();
		//rounding();
		leapYear();

	}
	
	public static void calcCircumference(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		double r = in.nextDouble();
		
		double c = 2 * 3.14 * r;
		
		System.out.println("Your circles circumference is " + c);
		
	}
	
	public static void triangleArea(){
		Scanner in = new Scanner(System.in);
		System.out.print("What is the height of the triangle?");
		int height = in.nextInt();
		System.out.print("What is the base?");
		int base = in.nextInt();
		//area = (height * base) / 2
		double area = ((double)height * (double)base) / 2;
		
		System.out.println("The area of the triangle is: " + area);
	}
	
	public static void evenOdd(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number");
		int num = in.nextInt();
		
		if(num % 2 == 0){
			System.out.println("Your number is even");
		}
		else{
			System.out.println("Your number is odd");
		}
	}
	
	public static void decimalPlace(){
		DecimalFormat df = new DecimalFormat("#.#");
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		int num = in.nextInt();
		//I guess I didnt need the decimal format just changed int into double
		System.out.println("You entered " + num + ", the new value is " + (double)num + ".");
		
	}
	
	public static void letterAsNumber(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a letter: ");
		//sigle letters have numerical value and can be placed in int variables
		//scanner has no method for single letters other than string
		String letter = in.nextLine();
		int let;
		//checking if string is only 1 char, if 1 char takes it and turns it into int
		if(letter.length() == 1){
			let = letter.charAt(0);
			System.out.println(let);
		}
		else{
			System.out.println("Wrong");
		}
	}
	
	public static void rounding(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number with a decimal: ");
		double num = in.nextDouble();
		//can round to the nearest 1's column 
		System.out.println(Math.round(num));
	}
	
	public static void leapYear(){
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a year: ");
		int year = in.nextInt();
		//checking if the year is divisible by 4, 100, 400 a leap year divisible by 100 but not 400
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year%400 == 0){
					System.out.println("It is a leap year");
				}
				else{
					System.out.println("It is not a leap year");
				}
			}
			else{
				System.out.println("It is a leap year");
			}
			
		}
		else{
			System.out.println("It is not a leap year");
		}
	}
	

}
