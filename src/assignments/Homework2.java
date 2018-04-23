package assignments;

public class Homework2 {

	public static void main(String[] args) {
		System.out.println(sumLimit(8,1));
		System.out.println(squirrelPlay(95,true));
		System.out.println(greenTicket(1,1,2));
		System.out.println(countxx("xxxx"));
		System.out.println(stringTimes("Hello",3));
		

	}
	
	public static int sumLimit(int num1, int num2){
		
		int sum = num1 + num2;
		//find the length of the number by converting to a string
		if(Integer.toString(sum).length() == Integer.toString(num1).length()){
			return sum;
		}
		else{
			return num1;
		}
	}
	
	public static boolean squirrelPlay(int temp, boolean isSummer){
		if(isSummer == true){
			if(temp >= 60 && temp <= 100){
				return true;
			
			}
			else{
				return false;
			}
		}
		else{
			if(temp >= 60 && temp <= 90){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public static int greenTicket(int num1, int num2, int num3){
		if(num1 == num2){
			if(num1 == num3){
				return 20;
			}
			else{
				return 10;
			}
		}
		else if(num2 == num3){
			return 10;
		}
		else if(num1 == num3){
			return 10;
		}
		else{
			return 0;
		}
	}
	
	public static int countxx(String count){
		int xx = 0;
		for(int i =0;i<count.length()-1;i++){
			if(count.charAt(i) == 'x' && count.charAt(i+1)== 'x'){
				xx += 1;
			}
		}
		return xx;
	}
	
	public static String stringTimes(String hello, int n){
		String repeated = "";
		for(int i = 0; i < n; i++){
			
				repeated += hello;
			
			
		}
		return repeated;
	}

}
