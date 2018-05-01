package phoneBookProject;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	
	public Address(){}
	
	public Address(String street,String city,String state,String zip,String phoneNum){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNum = phoneNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	

}
