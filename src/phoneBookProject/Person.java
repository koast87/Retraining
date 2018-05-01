package phoneBookProject;

import java.util.Comparator;

public class Person {
	
	private String firstName;
	private String lastName;
	private String fullName;
	private String middleName = "";
	private Address address = new Address();
	
	public Person(){}
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(String firstName, String lastName, String street,String city,String state,String zip,String phoneNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address.setStreet(street);
		this.address.setCity(city);
		this.address.setState(state);
		this.address.setZip(zip);
		this.address.setPhoneNum(phoneNum);
		
	}
	
	public Person(String[] info){
		
		fullName = info[0];
		address.setStreet(info[1]);	
		this.address.setCity(info[2]);
		this.address.setState(info[3]);
		this.address.setZip(info[4]);
		this.address.setPhoneNum(info[5]);
		
	}

	public String getFirstName() {
		String[] name = fullName.split(" ");
		return firstName = name[0];
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		String[] name = fullName.split(" ");
		return lastName = name[name.length - 1];
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFullName(){
		
		return fullName;
	}
	
	public String getMiddleName(){
		String[] name = fullName.split(" ");
		for(int i = 0; i < name.length;i++){
			if(i > 0 && i<name.length-1){
				middleName += name[i] ;
				
			}
		}
		return middleName;
	}
	
	public static Comparator<Person> nameComparator = new Comparator<Person>(){
		
		public int compare(Person p1,Person p2){
			String personName1 = p1.getFullName().toUpperCase();
			String personName2 = p2.getFullName().toUpperCase();
			
			return personName1.compareTo(personName2);
		}
	};
	public String toString(){
		String areaCode=address.getPhoneNum().substring(0, 3);
		String firstPart = address.getPhoneNum().substring(3, 6);
		String lastPart = address.getPhoneNum().substring(6, 10);
		return (getFullName() + ", Street: " + address.getStreet() + ", City: " + address.getCity() + ", State: " + address.getState() + ", Zip: " + address.getZip() + ", Phone Number: (" + areaCode + ")-" + firstPart + "-" + lastPart);
	}

}
