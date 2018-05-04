/*Project 2 PhoneBook Application
Write a program to simulate the actions of a phonebook.
Your program should be able to :
Add new entries 
Search for an existing entry
Search by first name *
Search by last name *
Search by full name *note name is not unique therefore the result should be an array of Person Objects.
Search by telephone number
Search by city or state
Delete a record for a given telephone number
Update a record for a given telephone number
Show all records in asc order
An option to exit the program 
Your program should operate on the console. It should display all the choices when the program loads. Eg 1. Add new record
    2. Delete a record
               Etc.. where 1 representing the action for adding a record and 2 representing the action
               for deleting a record.
Your program should run until the user selects the exit option. 
Your program should have a minimum of 2 classes a Person class, an Address  class.

Test case :
John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375

Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.

Optional add additional features to your program, for storing cell, home, work and fax numbers. 
Also features for storing events like birthday, anniversary, email… etc  */

//author: Brandon Crenshaw <branshaw2004@gmail.com>

package phoneBookProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//set up an array for a list of people
		ArrayList <Person> people = new ArrayList<Person>();
		
		//have user choose from a set of options
		System.out.println("Please enter a choice: \n1.Add new entry"
				+ "\n2.Show existing entrys\n3.Search for entry\n4.Remove an entry\n5.Update entry info.\n6.Exit phonebook");
		int choice = in.nextInt();
		in.nextLine();
		
		//loop through the choices until user chooses to end the program
		while(choice != 6){
			switch(choice){
			//adds information into the system
			case 1 : 
				System.out.println("Enter your info Please follow this Structure: \nJohn Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
				String info = in.nextLine();
				addPerson(people,info);
				break;

				//shows a list of people added
			case 2:
				sort(people);

				break;

				//search for people by a given variable 
			case 3:
				System.out.println("Enter a number to select a search type: \n1.First name\n2.Last name\n3.Full name\n4.Phone number"
						+ "\n5.City\n6.State");
				choice=in.nextInt();
				in.nextLine();
				System.out.print("Please enter data:");
				info = in.nextLine();
				search(people,info,choice);
				break;

				//remove a person and their info from 
			case 4:
				System.out.println("please enter the persons full name: ");
				info = in.nextLine();
				removePerson(people, info);
				break;

				//update a persons information by looking them up from a phone number	
			case 5:
				System.out.println("Update information via a phone number");
				String phoneNum = in.nextLine();
				for(int i = 0; i < people.size(); i++){
					if(people.get(i).getAddress().getPhoneNum().equals(phoneNum)){
				System.out.println("Please enter all persons updated information in the format of given example" 
						+ "John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
				String update = in.nextLine();
				updateInfo(people,phoneNum,update);
					}
					else{
						System.out.println("Number is not in phonebook");
					}
				}
				break;

				//ends the loop
			default: break;
			}
		System.out.println("Please enter a choice: \n1.Add new entry"
				+ "\n2.Show existing entrys\n3.Search for entry\n4.Remove an entry\n5.Update entry info.\n6.Exit phonebook");
		choice = in.nextInt();
		in.nextLine();
		
		}
	}
	
	//add an entry to the array
	public static ArrayList<Person> addPerson(ArrayList<Person> people,String info){
		//get the input, separate it, and set it to the proper values
		String[] infoSplit = info.split(", ");
		Person person = new Person(infoSplit);
		//add person to array
		people.add(person);
		 return people;
	}
	
	//remove an entry form the array
	public static void removePerson(ArrayList<Person> people,String person){
		//search for a person by their full name
		for(int i = 0 ; i < people.size();i++){
			if(people.get(i).getFullName().toLowerCase().equals(person.toLowerCase()))
				//remove them from the array
				people.remove(i);
		}
	}

	//search for entrys with a similar value
	public static void search(ArrayList<Person>people,String name, int choice){
		name = name.toLowerCase();
		switch(choice){
		case 1:
			for(int i = 0; i < people.size();i++){
				
				if(people.get(i).getFirstName().toLowerCase().equals(name)){
					System.out.println(people.get(i).toString());
				}
			}
			break;
		case 2:
			for(int i = 0; i < people.size();i++){
				if(people.get(i).getLastName().toLowerCase().equals(name)){
					System.out.println(people.get(i).toString());
				}
			}
			break;
		case 3:
			for(int i = 0; i < people.size();i++){
				if(people.get(i).getFullName().toLowerCase().equals(name)){
					System.out.println(people.get(i).toString());
				}
			}
			break;
		case 4:
			for(int i = 0; i < people.size();i++){
				if(people.get(i).getAddress().getPhoneNum().toLowerCase().equals(name)){
					System.out.println(people.get(i).toString());
				}
			}
			break;
		case 5:
			for(int i = 0; i < people.size();i++){
				if(people.get(i).getAddress().getCity().toLowerCase().equals(name)){
					System.out.println(people.get(i).toString());
				}
			}
			break;
		case 6:
			for(int i = 0; i < people.size();i++){
				if(people.get(i).getAddress().getState().toLowerCase().equals(name)){
					System.out.println(people.get(i).toString());
				}
			}
			break;
			default: System.out.println("Invalid choice");
			break;
		}
	}
	
	//alphabetizes array and displays all info
	public static void sort(ArrayList <Person> people){
		//comparator method set in Person class
		Collections.sort(people,Person.nameComparator);	
		//short hand for loop
		for(Person p: people){
				System.out.println(p);
		}
		
		
	}
	
	//updates all the info for a given person
	public static ArrayList<Person> updateInfo(ArrayList < Person> people,String phoneNum,String info){
		ArrayList<Person> holder = new ArrayList<Person>();
		for(int i = 0; i < people.size();i++){
			if(people.get(i).getAddress().getPhoneNum().equals(phoneNum)){
				people.remove(i);
				holder = addPerson(people, info);
				
			}
		}
		return holder;
	}
	
	

}
