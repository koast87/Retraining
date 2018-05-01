package phoneBookProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
			Person p1 = new Person();
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
				String data = in.nextLine();
				search(people,data,choice);
				break;

				//remove a person and their info from 
			case 4:
				System.out.println("please enter the persons full name: ");
				String remove = in.nextLine();
				removePerson(people, remove);
				break;

				//update a persons information by looking them up from a phone number	
			case 5:
				System.out.println("Update information via a phone number");
				String num = in.nextLine();
				for(int i = 0; i < people.size(); i++){
					if(people.get(i).getAddress().getPhoneNum().equals(num)){
				System.out.println("Please enter all persons updated information in the format of given example" 
						+ "John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
				String update = in.nextLine();
				updateInfo(people,num,update);
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
	
	public static ArrayList<Person> addPerson(ArrayList<Person> people,String info){
		String[] str = info.split(", ");
		Person person = new Person(str);
		people.add(person);
		 return people;
	}
	
	public static void removePerson(ArrayList<Person> people,String person){
		
		for(int i = 0 ; i < people.size();i++){
			if(people.get(i).getFullName().toLowerCase().equals(person.toLowerCase()))
				people.remove(i);
		}
	}

	
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
	
	public static void sort(ArrayList <Person> people){
		Collections.sort(people,Person.nameComparator);	
		
		for(Person p: people){
				System.out.println(p);
		}
		
		
	}
	
	public static ArrayList<Person> updateInfo(ArrayList < Person> people,String num,String info){
		ArrayList<Person> holder = new ArrayList<Person>();
		for(int i = 0; i < people.size();i++){
			if(people.get(i).getAddress().getPhoneNum().equals(num)){
				people.remove(i);
				holder = addPerson(people, info);
				
			}
		}
		return holder;
	}
	
	

}
