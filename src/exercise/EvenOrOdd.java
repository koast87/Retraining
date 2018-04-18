package exercise;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int num = in.nextInt();
		int rem = num % 2;
		
		System.out.println(rem);
		if(rem > 0){
			System.out.println("Odd");
		}
		else{
			System.out.println("Even");
		}

	}

}
