package Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Data {
	private ArrayList<ContactDetails> conDetails = new ArrayList<ContactDetails>();
	
	public Data() {
	}
	
	public Data(ArrayList<ContactDetails> conDetails) {
		super();
		this.conDetails = conDetails;
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

	/*public void sortIt() {
		Collections.sort(conDetails);
	}*/
}
