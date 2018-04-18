package demos;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//Create the scanner for user input
		Scanner in = new Scanner(System.in);
		
		
		// Prompt the user to enter information
		System.out.print("Enter your name: ");
		String name = in.next();
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		System.out.println("Hi " + name + ". Your are " + age + " years old.");

	}

}
