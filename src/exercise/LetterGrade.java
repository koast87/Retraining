package exercise;

import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter numeric grade: ");
		int grade = in.nextInt();
		if(grade < 0){
			System.out.println("invalid numeric grade");
		}
		else if(grade < 64){
			System.out.println('F');
		}
		else if(grade < 72){
			System.out.println('D');
		}
		else if(grade < 80){
			System.out.println('C');
		}
		else if(grade < 90){
			System.out.println('B');
		}
		else if(grade <101){
			System.out.println('A');
		}
		else{
			System.out.println("invalid numeric grade");
		}

	}

}
