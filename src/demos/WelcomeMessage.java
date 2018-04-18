package demos;

public class WelcomeMessage {
	
	public static void main(String[] args){
		System.out.println("Starting Welcome Message");
		
		//Declaring a variable
		String name;
		
		//Define the variable
		name = "Shawn";
		
		//Declare and define variable
		String date = "Friday, 2:12pm";
		double transactionAmount = 32.58;
		char sign = '+';
		
		System.out.println(name);
		System.out.println(date);
		System.out.println(transactionAmount);
		
		//Print message
		System.out.println("Hi " + name + ", welcome back! Your last login was " + date + ". Your last transation was for "+ sign + "$"
		+ transactionAmount + ".");
	}
}
