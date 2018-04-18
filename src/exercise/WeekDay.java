package exercise;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//get the day
		System.out.println("Enter a weekday number between 1 - 7");
		int weekDay = in.nextInt();
		String day;
		
		//Switch string for choosing day
		switch(weekDay){
			case 1: day = "Sunday";
				break;
			case 2: day = "Monday";
				break;
			case 3: day = "Tuesday";
				break;
			case 4: day = "Wednesday";
				break;
			case 5: day = "Thursday";
				break;
			case 6: day = "Friday";
				break;
			case 7: day = "Saturday";
				break;
			default: day = "Invalid day";
				break;
		}
		
		System.out.println(day);
		

	}

}
