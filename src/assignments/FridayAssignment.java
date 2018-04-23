package assignments;

import java.util.Scanner;

public class FridayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("enter a word and then a letter to take out.");
		String word = in.nextLine();
		//String fauxletter = in.nextLine();
		//char letter = fauxletter.charAt(0);
		//System.out.println(removeLetters(word,letter));
		//System.out.println(removeDuplicate(word));
		//System.out.println(letterTypeCount(word));
		System.out.println(moveRepeat(word));

	}

	public static String removeLetters(String word, char letter){
		String changeWord = "";
		word = word.toLowerCase();
		for(int i = 0; i < word.length();i++){
			if(word.charAt(i) != letter){
				changeWord += word.charAt(i);
			}
		}
		return changeWord;
	}
	public static boolean isInWord(String word, char letter){
		word = word.toLowerCase();
		letter = Character.toLowerCase(letter);
		int count = 0;
		for(int i =0; i < word.length();i++){
			if(word.charAt(i)==letter){
				count++;
			}
			if(count>1){
				return true;
			}
		}
		return false;
	}
	public static String removeDuplicate(String word){
		String changeWord = "";
		for(int i =0; i< word.length();i++){
			if(!isInWord(word,word.charAt(i))){
				changeWord += word.charAt(i);
			}
		}

		return changeWord;
	}

	public static String letterTypeCount(String word){
		int vowels = 0;
		int consonants = 0;

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
			default: consonants +=1;
			break;

			}
		}

		return "The vowel count is " + vowels + " and the consonanat count is " + consonants;
	}

	public static String moveRepeat(String word){
		//String changeWord = "";
		String duplicate = "";
		String nonDuplicate ="";
		for(int i =0;i<word.length();i++){
			if(!isInWord(word,word.charAt(i))){
				nonDuplicate += word.charAt(i);
			}
			else{
				duplicate +=word.charAt(i);

			}
		}
		return nonDuplicate + duplicate;
	}

}
