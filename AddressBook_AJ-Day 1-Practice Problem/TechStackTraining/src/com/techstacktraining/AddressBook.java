package com.techstacktraining;

import java.util.ArrayList;
import java.util.function.Predicate;

public class AddressBook {
	private String bookName;
	private ArrayList<ContactDetails> conDetails = new ArrayList<ContactDetails>();
	
	public AddressBook() {
		
	}
	public AddressBook(String bookName) {
		super();
		this.bookName = bookName;
	}

	public AddressBook(String bookName, ArrayList<ContactDetails> conDetails) {
		super();
		this.bookName = bookName;
		this.conDetails = conDetails;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
	
	public boolean addDetails(String firstName, String lastName, String city, String phoneNumber)
	{
		Predicate<ContactDetails> ii = t -> t.getFirstName().equalsIgnoreCase(firstName);
		Predicate<ContactDetails> iii = t -> t.getLastName().equalsIgnoreCase(lastName);
		if(conDetails.stream().anyMatch(ii) && conDetails.stream().anyMatch(iii))
			return false;
		 conDetails.add(new ContactDetails(firstName, lastName, city, phoneNumber));
		 return true;
		
	}
	
	public ArrayList<ContactDetails> printIt()
	{
		return conDetails;
	}

	public void findByName(String fName) {
		Predicate<ContactDetails> ii = t -> t.getFirstName().equalsIgnoreCase(fName);
		conDetails.stream().filter(ii).forEach(t -> System.out.println(t.print()));
	}
	
	public void findByCityName(String fName) {
		Predicate<ContactDetails> ii = t -> t.getCity().equalsIgnoreCase(fName);
		conDetails.stream().filter(ii).forEach(t -> System.out.println(t.print()));
	}

	public void deleteEntry(String fName) {
		Predicate<ContactDetails> ii = t -> t.getFirstName().equalsIgnoreCase(fName);
		conDetails.removeIf(ii);
		
	}
	
}
