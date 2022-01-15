package com.techstacktraining;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		boolean exit = false,bookAdded = false;
		Scanner in = new Scanner(System.in);
		ArrayList<AddressBook> book = new ArrayList<AddressBook>();
		AddressBook selectedBook = new AddressBook();
		
		while(!exit) 
		{
		 System.out.println(">>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<");
		 System.out.println("Welcome to Address Book Program.Selected Book - " + selectedBook.getBookName());
		 System.out.println("Please select an option from below:");
         System.out.println("1. Select/Change address book.");
         System.out.println("2. Add an address book.");
         System.out.println("3. Add name in selected Address book.");
         System.out.println("4. Remove a name from selected book.");
         System.out.println("5. Edit name from selected book.");
         System.out.println("6. Display all contents of selected book.");
         System.out.println("7. Search entry for specific name in selected book.");
         System.out.println("8. Search entry on basis of CITY.");
         System.out.println("9. Exit program.");
         
         switch(in.nextInt())
         {
         case 1:
        	if(bookAdded) {
         	 System.out.println("Please choose Address Book name from below");
         	 book.stream().forEach(t->System.out.println(t.getBookName()));
         	 System.out.println(">>>");
         	 selectedBook = book.stream().filter(t -> in.next().equalsIgnoreCase(t.getBookName())).findAny().orElse(null);
        	}else {System.out.println("No address book added yet.");}
         	break;
         case 2:
         	System.out.println("Please provide name of address book to be added.");
         	book.add(new AddressBook(in.next()));
         	bookAdded = true;
         	break;        
         case 3:
        	if(bookAdded) {
         	 System.out.println("Please provide below details to be added,");
     		 System.out.println("Enter First Name: ");
     		 String fName = in.next();
     		 System.out.println("Enter Last Name: ");
     		 String lName = in.next();
     		 System.out.println("Enter City: ");
     		 String city = in.next();
     		 System.out.println("Enter Phone Number: ");
     		 String phNumber = in.next();
     		 if(!selectedBook.addDetails(fName, lName, city, phNumber))
     		 {
     			System.out.println("Name already exists !"); 
     		 }
        	}else {System.out.println("No address book added yet.");}
        	break;
         case 4:
        	 if(bookAdded) {
        		 System.out.println("Please provide name to be removed from selected book.");
        		 selectedBook.deleteEntry(in.next());
        	 }else {System.out.println("No address book added yet.");}
         	break;
         case 5:
        	if(bookAdded) {
        	 System.out.println("Please provide name to be modified from book.");
         	}else {System.out.println("No address book added yet.");}
        	 break;
         case 6:
        	 if(bookAdded) {
        		 System.out.println("All contents of the selected book - " + selectedBook.getBookName());
        		 selectedBook.printIt().forEach(t -> System.out.println(t.print()));
        	 }else {System.out.println("No address book added yet.");}
        	 break;
         case 7:
        	 if(bookAdded) {
        		 System.out.println("Please provide name which you want to search in book.");
        		 selectedBook.findByName(in.next());
        	 }else {System.out.println("No address book added yet.");}
          	break;
         case 8:
        	 if(bookAdded) {
        		 System.out.println("Please provide city for which you want records from all address books.");
        		 String cityName = in.next();
        		 for (AddressBook a : book)
        		 {
        			 a.findByCityName(cityName);
        		 }
        	 }else {System.out.println("No address book added yet.");}
          	break;
         case 9:
          	System.out.println("Thank you using Address Book program. Byeee !!!");
          	exit = true;
          	break;
         default:
         	System.out.println("Please choose a provided option.");
         }//End of SWITCH CASE         
		}		
		in.close();
	}
}
