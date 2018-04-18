package demos;

public class WeatherWarningMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert the temperature from C to F
		double degreesC = 25;
		double degreesF = (degreesC * 9/5) + 32;
		
		//Print the temperature in F
		System.out.println(degreesF + "F");
		
		//test the temperature to print additional warning message
		//less than 32 >> Freezing
		//grater than 105 >> "heat"
		if(degreesF < 32){
			System.out.println("WARNING: FREEZING TEMPERATURES");
		}
		else if(degreesF > 105){
			System.out.println("WARNING: HEAT ADVISORY");
		}
		else{
			System.out.println("Weather should be pleasent");
		}

	}

}
