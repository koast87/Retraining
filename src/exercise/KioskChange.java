package exercise;

public class KioskChange {

	public static void main(String[] args) {
		String change = returnChange(18,17.18);
		
		System.out.println(change);

	}
	
	public static String returnChange(double amountPaid, double price){
		//change price and paid amount to whole number
		double newPrice = price * 100;
		double newAmount = amountPaid * 100;
		
		//calculate how much change is left
		double change = newAmount - newPrice;
		
		//find the amount of quarters nickels dimes and pennies
		int quarters = (int)change / 25;
		int changeLeft = (int)change % 25;
		int dimes = changeLeft / 10;
		int changeLeft2 = changeLeft % 10;
		int nickels = changeLeft2 / 5;
		int pennies = changeLeft2 % 5;
		
		String returnChange = "Quarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies;
		
		return returnChange;
	}

}
