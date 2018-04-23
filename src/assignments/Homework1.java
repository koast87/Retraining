package assignments;


import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(max3(5,10,7));
		System.out.println(min3(5,10,7));
		System.out.println(median3(5,10,7));
		System.out.println(xor(false,true));*/
		
		Scanner in = new Scanner(System.in);
		//System.out.println("please enter 2 numbers");
		int num1 = in.nextInt();
		//int num2 = in.nextInt();
		//System.out.println(isFactor(num1, num2));
		System.out.println(isPrime(num1));

	}
	
	public static int max3(int first, int second, int third){
		if(first>second && first>third){
			return first;
		}
		else if(second>first && second>third){
			return second;
		}
		else{
			return third;
		}
	}
	
	public static int min3(int first, int second, int third){
		if(first<second && first<third){
			return first;
		}
		else if(second<first && second<third){
			return second;
		}
		else{
			return third;
		}
	}
	
	public static int median3(int first, int second, int third){
		int sum = first + second + third;
		int median = sum - max3(first, second, third) - min3(first, second, third);
		
		return median;
	}
	
	public static boolean xor(boolean value1, boolean value2){
		if(value1 == value2){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static boolean isFactor(int k, int n){
		if(k%n == 0) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isPerfect(int k){
		int sum = 0;
		for(int i = 1;i<k;i++){
			if(isFactor(i,k)){
				sum += i;
			}
		}
		return k == sum;
	}
	
	public static boolean isPrime(int k){
		int sum = 0;
		for(int i = 1; i <= k; i++){
			if(isFactor(k,i)){
				sum += 1;
			}
			
		}
		if(sum == 2){
			return true;
		}
		else{
			return false;
		}
	}

}
