package Test;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Data {
	private ArrayList<Details> conDetails = new ArrayList<Details>();
	
	public Data() {
	}
	
	public Data(ArrayList<Details> conDetails) {
		super();
		this.conDetails = conDetails;
	}
	
	public boolean addDetails(String firstName, String lastName, String city, String phoneNumber)
	{
		Predicate<Details> ii = t -> t.getFirstName().equalsIgnoreCase(firstName);
		Predicate<Details> iii = t -> t.getLastName().equalsIgnoreCase(lastName);
		if(conDetails.stream().anyMatch(ii) && conDetails.stream().anyMatch(iii))
			return false;
		 conDetails.add(new Details(firstName, lastName, city, phoneNumber));
		 return true;
		
	}
	
	public ArrayList<Details> printIt()
	{
		return conDetails;
	}

	public void sortIt() {
		//Collections.sort(conDetails.);
		conDetails.sort((fname1,fname2) -> fname1.getFirstName().compareTo(fname2.getFirstName()));
	}
}
