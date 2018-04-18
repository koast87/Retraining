package exercise;

public class SavingsCalculator {

	public static void main(String[] args) {
		
		double futureValue = futureValue(20000,.045,15);
		
		System.out.println("Result: $" + futureValue);
		
	}
	
	public static double futureValue(int presentValue, double intrestRate, int time){
		//finding the growth rate PV * [1 + (rate * time)]
		double futureValue = (double) presentValue * (1 + (intrestRate * time));
		//return the value
		return futureValue;
		
	}

}
