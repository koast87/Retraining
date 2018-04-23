package assignments;

import java.util.Scanner;

public class FridayAssignmentPartTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers are you going to use? ");
		int howMany = in.nextInt();
		int[] nums = new int[howMany];
		System.out.println("Please enter all your numbers: ");
		for(int i = 0; i < howMany;i++){
			nums[i] = in.nextInt();
		}
		 
		System.out.println("The sum of all numbers is" + arraySum(nums));
		System.out.println("The average is: " + arrayAverage(nums));
		System.out.println("The largest number is: " + arrayBiggestNum(nums));
		arrayLargeNums(nums);


	}

	public static int arraySum(int[] nums){
		int sum = 0;
		for(int i = 0; i < nums.length;i++){
			sum += nums[i];
		}
		return sum;
	}

	public static int arrayAverage(int[] nums){
		int avg = arraySum(nums) / nums.length;
		return avg;
	}

	public static void arrayLargeNums(int[] nums){
		int avg = arrayAverage(nums);
		int[] largeNums = new int[nums.length/2];
		int j =0;
		int count = 0;
		for(int i = 0; i < nums.length;i++){
			if(nums[i] > avg){
				count += 1;
				largeNums[j] = nums[i];
				j++;
			}
		}
		for(int t: largeNums){
			if(t!=0)
				System.out.print(t +" ");
		}
		System.out.println("\nthere are " + count + " numbers higher than the average.");
	}
	
	public static int arrayBiggestNum(int[] nums){
		int biggest = 0;
		for(int i=0; i<nums.length;i++){
			if(nums[i]> biggest)
				biggest = nums[i];
		}
		return biggest;
	}

}
