package com.techstacktraining.CabInvoiceGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.techstacktraining.CabInvoiceGenerator.test.InvoiceSummary;

public class CabInvoice {

	private static final double MINIMUM_COST_PER_KM = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5.0;
	private double distance;
	private int time;
	
	public CabInvoice() {
	}
	
	public CabInvoice(float distance, int time) {
		super();
		this.distance = distance;
		this.time = time;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public float getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public double calculateFare(double distance2, int time2) {
		double actualFare = distance2 * MINIMUM_COST_PER_KM + time2 * COST_PER_TIME;
		if(actualFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return actualFare;
	}

	public InvoiceSummary calculateFare(List<Ride> actual) {
		double totalFare = 0;
		for (Ride ride:actual)
		{
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		//return totalFare;
		return new InvoiceSummary(actual.size(), totalFare);
	}

	public List<Ride> printRides(ArrayList<Ride> testRides, String input) {
		List<Ride> returnList = 
				testRides.stream().filter(t -> t.getName().equalsIgnoreCase(input)).collect(Collectors.toList());
		
		return returnList;
	}
}
