package demos;

public class SalaryCalculator {

	public static void main(String[] args) {
		//Annual Salary: hourly rate * hours work in week * weeks in a year
		
		//variable
		double hourlyRate = 37;
		int hoursInWeek = 40;
		int weeksInYear = 52;
		int vacationWeeks = 3;
		
		//Perform calculation
		int workingWeeks = weeksInYear - vacationWeeks;
		double annualIncome = hourlyRate * hoursInWeek * workingWeeks;
		
		//Print the result
		System.out.println("$" + annualIncome);

	}

}
