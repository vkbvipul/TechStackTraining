package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {	
		/*1)take input from user for first name, last name,phone number,address.Store the user in 
		 * list/collection.once stored sort the list using firstname and display it.*/
		Data data = new Data();
		Scanner in = new Scanner(System.in);
		boolean t = true;
		while(t)
		{
			System.out.println("Please provide below details to be added,");
			 System.out.println("Enter First Name: ");
			 String fName = in.next();
			 System.out.println("Enter Last Name: ");
			 String lName = in.next();
			 System.out.println("Enter Address: ");
			 String address = in.next();
			 System.out.println("Enter Phone Number: ");
			 String phNumber = in.next();
			 data.addDetails(fName, lName, address, phNumber);
			 System.out.println("Want to enter more data ?(Y/N)");
			 if(in.next().equalsIgnoreCase("N"))
				 t = false;
		}
		data.printIt().forEach(h -> System.out.println(h.print()));
	}
}
