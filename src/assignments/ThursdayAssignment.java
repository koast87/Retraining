package assignments;

import java.util.Scanner;

public class ThursdayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = in.nextLine();
		
		System.out.println(letterCheck(word));
		System.out.println(upperLowerCase(word));
		System.out.println(flipWord(word));
		System.out.println(removeMiddle(word));
		System.out.println(checkPalindrome(word));
		System.out.println(countVowels(word));
		

	}
	
	//Check length of word and compare each letter
	public static String letterCheck(String word){
		int letter = 0;
		for(int i = 0; i < word.length();i++){
			for(int j = i+1; j< word.length(); j++){
				if(word.charAt(i) == word.charAt(j)){
					letter += 1;
				}
			}
		}
		if(letter < 1){
			return "All letters are unique";
		}
		else{
			return "Some of the letters repeat " + letter;
		}
	}
	
	public static String upperLowerCase(String word){
		String changeWord = "";
		for(int i = 0; i < word.length();i++){
			if(i % 2 == 1){
				
				changeWord += word.toUpperCase().charAt(i);
			}
			else{
				word.toLowerCase();
				changeWord += word.toLowerCase().charAt(i);
			}
		}
		return changeWord;
	}
	
	public static String flipWord(String word){
		String changeWord = "";
		for(int i = word.length()-1; i >= 0; i--){
			changeWord += word.charAt(i);
		}
		/*or
		 * for(int i = 0; i < word.length(); i++){
		 * changeWord = word.charAt.(i) + changeWord;
		 * }
		 * */
		return changeWord;
		
	}
	
	public static String removeMiddle(String word){
		String changeWord = "";
		for(int i = 0; i < word.length();i++){
			if(i != word.length()/2){
				changeWord += word.charAt(i);
			}
			
		}
		return changeWord;
	}
	
	public static String checkPalindrome(String word){
		int j = word.length()-1;
		String palindrome = "";
		for(int i = 0; i < word.length(); i++){
				//if(word.charAt(i) == word.charAt(j)){
					palindrome += word.charAt(j);
					j--;
			//}
		}
		if(word.equals(palindrome)){
			return "The word is a palindrome";
		}
		else{
			return "The word is not a palindrome";
		}
	}
	
	public static String countVowels(String word){
		int vowels = 0;
		for(int i = 0; i < word.length(); i++){
			switch(word.charAt(i)){
			case 'a': vowels += 1;
				break;
			case 'e': vowels +=1;
				break;
			case 'i': vowels +=1;
				break;
			case 'o': vowels +=1;
			break;
			case 'u': vowels +=1;
			break;
			case 'y': vowels +=1;
			break;
			default: break;
			}
		}
		return vowels + " vowels in word";
	}

}
