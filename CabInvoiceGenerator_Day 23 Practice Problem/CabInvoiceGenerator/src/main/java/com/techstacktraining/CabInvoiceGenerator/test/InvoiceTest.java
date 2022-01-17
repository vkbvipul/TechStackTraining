package com.techstacktraining.CabInvoiceGenerator.test;

import org.junit.Assert;
import org.junit.Test;

import com.techstacktraining.CabInvoiceGenerator.CabInvoice;
import com.techstacktraining.CabInvoiceGenerator.Ride;

//@RestController
public class InvoiceTest {
	
	/*ArrayList<Ride> testRides = new ArrayList<Ride>(Arrays.asList
			(new Ride (2.0,5,"Vipul"),new Ride(0.1,1,"Jyoti"),new Ride(0.1,1,"Vipul")));
	
	@RequestMapping(value="/ridesof/{name}")
	public List<Ride> rideDetailsOfName(@PathVariable String name)
	{
		//testRides.stream().filter(t -> t.getName().equalsIgnoreCase(name)).findAny().get();
		ArrayList<Ride> toBeReturned = new ArrayList<Ride>();
		for (Ride r : testRides)
		{
			if(r.getName().equalsIgnoreCase(name))
				toBeReturned.add(r);
		}
		return toBeReturned;
	}*/
	
	
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
		Ride[] rides = {new Ride (2.0,5),new Ride(0.1,1)};
		/*STEP 2
		double totalFare = cb.calculateFare(rides);
		Assert.assertEquals(30, totalFare, 0.0); */
		
		InvoiceSummary summary = cb.calculateFare(rides);
		InvoiceSummary expected = new InvoiceSummary(2,30.0);
		Assert.assertEquals(expected,summary);
	}
	
}
