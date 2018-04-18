package demos;

public class Functions {

	public static void main(String[] args) {
		//call the function
		sayHi();
		
		//call the printName function
		printName("Brandon", "Crenshaw");
		
		printName("Bradley", "Crenshaw");
		
		//call the combineName function
		String fullName = combineName("Brandon", "Crenshaw");
		System.out.println(fullName);
	}
	
	//Define the function sayHi
	public static void sayHi(){
		System.out.println("Hi!");
	}
	
	//Define a function that prints your name
	public static void printName(String firstName, String lastName){
		System.out.println("Frist name: " + firstName);
		System.out.println("Last name: " + lastName);
	}
	
	//Define a function that returns the full name
	public static String combineName(String firstName, String lastName){
		String combineName = firstName + " " + lastName;
		return combineName;
	}

}
