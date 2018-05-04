/*Project 1 - Change Maker

Problem: 

you have to give someone change 

what coins do you give that person? 

Requirements: 

takes user input 

displays the change breakdown as output

1. Understand and Define the Problem 

 ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,

 What’s involved?  

interview users. What are their expectations? What data do they need to access? write a requirements analysis report


2. Determine Input and Output 

Typed input by user: amount of change requested (an integer between 1 and 99) 

Printed output:  

Number of quarters given  

Number of dimes given  

Number of nickels given  

Number of pennies given*/
package projects;

import java.util.Scanner;


//author Brandon Crenshaw <branshaw2004@gmail.com>

public class Project1 {

	public static void main(String[] args) {
		//Ask the user for the amount of change they get back
		Scanner in = new Scanner(System.in);
		System.out.println("How much change are you getting back? \nEnter a value from 1-99");
		int change = in.nextInt();
		
		//call the makeChange method
		makeChange(change);
		

	}
	
	//method used to handle calculations
	public static void makeChange(int change){
		//change cannot exceed 99
				if(change <100 && change >0){
				//setting up the change types and the equations to get the change
				int quarters = change / 25;
				int changeLeft = change % 25;
				int dimes = changeLeft / 10;
				changeLeft = changeLeft % 10;
				int nickels = changeLeft / 5;
				int pennies = changeLeft % 5;
				
				//output of how much change they get and how it is divided into quarters, dimes, nickels, and pennies
				System.out.println("Your change is: ¢" + change);
				System.out.println("Quarters: " + quarters);
				System.out.println("Dimes: " + dimes);
				System.out.println("Nickels: " + nickels);
				System.out.println("Pennies: " + pennies);
				}
				//what to do if the number written is not within the range
				else{
					System.out.println("The change amount does not meet requirement.");
				}
	}

}
