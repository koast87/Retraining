package exercise;

import java.text.DecimalFormat;

public class MarathonRaceTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int time = 7724;
		double miles = 26.2;
		DecimalFormat df = new DecimalFormat(".###");
		//calculate the hours
		int hrs = time / 3600;
		//calculate how much time is left using Modules '%'
		int timeLeft = time % 3600;
		//calculate the minutes 
		int mins = timeLeft / 60;
		//calculate seconds using the left over time
		int secs = timeLeft % 60;
		
		int min =  time / 60;
		double minPerMile = (double)min / miles;
		
		System.out.println(hrs+"hrs:" + mins + "mins:" + secs + "secs");
		System.out.println("Average pace: " +df.format(minPerMile) + " minutes per mile");

	}

}
