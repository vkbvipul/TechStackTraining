package com.techstacktraining.CabInvoiceGenerator.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.techstacktraining.CabInvoiceGenerator.CabInvoice;
import com.techstacktraining.CabInvoiceGenerator.Ride;

public class InvoiceTest {
	
	ArrayList<Ride> testRides = new ArrayList<Ride>(Arrays.asList
			(new Ride (2.0,5,"Test1"),new Ride(0.1,1,"Test2"),new Ride(0.1,1,"Test1")));
	ArrayList<Ride> testRides2 = new ArrayList<Ride>(Arrays.asList
			(new Ride (2.0,5,"Test1"),new Ride(0.1,1,"Test1")));
	
	@Test //STEP 1 General Calc
	public void returnFare_onReceivingDisTime()
	{
		CabInvoice cb = new CabInvoice();
		double distance = 2.0;
		int time = 5;
		double fare = cb.calculateFare(distance,time);
		Assert.assertEquals(25, fare, 0.0);
	}

	@Test  //STEP 1 (MINIMUM FARE)
	public void returnMinimumFare_ifDistanceIsLess()
	{
		CabInvoice cb = new CabInvoice();
		double distance = 0.1;
		int time = 1;
		double fare = cb.calculateFare(distance,time);
		Assert.assertEquals(5, fare, 0.0);
	}
	
	@Test //STEP 2 (Multiple rides), STEP 3 (Invoice Summary)
	public void returnInvoiceSummary_multipleRides()
	{
		CabInvoice cb = new CabInvoice();
		List<Ride> rides = Arrays.asList(new Ride (2.0,5),new Ride(0.1,1));
		/*STEP 2
		double totalFare = cb.calculateFare(rides);
		Assert.assertEquals(30, totalFare, 0.0); */
		
		InvoiceSummary summary = cb.calculateFare(rides);
		InvoiceSummary expected = new InvoiceSummary(2,30.0);
		Assert.assertEquals(expected,summary);
	}
	
	@Test //STEP3 (Get list of all rides and an invoice).
	public void returnListAndInvoiceSummary()
	{
		String input = "Test1";
		CabInvoice cb = new CabInvoice();
		
		List<Ride> actual = cb.printRides(testRides,input);
		List<Ride> expected = testRides2;
		
		//this.returnInvoiceSummary(actual);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test //Return Invoice Summary
	public void returnInvoiceSummary() {
		String input = "Test1";
		CabInvoice cb = new CabInvoice();
		List<Ride> actual = cb.printRides(testRides,input);
		//List<Ride> expected = testRides2;
		InvoiceSummary summary = cb.calculateFare(actual);
		InvoiceSummary expected = cb.calculateFare(testRides2);
		Assert.assertEquals(expected,summary);
	}
	
	
	
	
}
