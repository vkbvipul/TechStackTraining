package com.techstacktraining.CabInvoiceGenerator;

public class Ride {
	
	public double distance;
	public int time;
	public String name;

	public Ride() {
	}
	
	public Ride(double distance, int time, String name) {
		super();
		this.distance = distance;
		this.time = time;
		this.name = name;
	}

	public Ride(double d, int t) {
		this.distance = d;
		this.time = t;
	}

	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
