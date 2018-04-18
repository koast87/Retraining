package demos;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int numA = 5;
		int numB = 6;
		
		//Add together to get sum
		int sum = numA + numB;
		
		//get the average
		//System.out.println(sum / 2);
		
		//Solution 1: Modify our divisor by double
		System.out.println(sum / 2.0);
		
		//Solution 2: "cast" our number to a double
		double average = ((double) (numA + numB)) / 2; 
		System.out.println(average);

	}

}
