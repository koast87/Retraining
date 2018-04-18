package exercise;

import java.text.DecimalFormat;

public class TipRecommender {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(".####");
		
		double tip = calculateTip(33.57 , "Great");
		System.out.println("Result: " + df.format(tip));

	}
	
	public static double calculateTip(double tab, String service){
		double tip = 0;
		
		if(service == "Poor"){
			 tip = tab * .16;
		}
		else if(service == "Good"){
			 tip = tab * .22;
		}
		else if(service == "Great"){
			 tip = tab * .26;
		}
		
		return tip;
		
	}

}
