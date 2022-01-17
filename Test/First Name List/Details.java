package Test;

public class Details {
	
	private String firstName;
	private String lastName;
	private String city;
	private String phoneNumber;
	public Details() {
		
	}
	public Details(String firstName, String lastName, String city, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String print()
	{
		return this.firstName.concat(this.lastName.concat(this.city.concat(this.phoneNumber)));
	}
}
