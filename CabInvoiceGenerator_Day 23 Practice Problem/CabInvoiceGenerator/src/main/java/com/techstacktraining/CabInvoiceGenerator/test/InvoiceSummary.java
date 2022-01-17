package com.techstacktraining.CabInvoiceGenerator.test;

public class InvoiceSummary {

	private int rides;
	private double totalFare;
	private double avgFare;

	public InvoiceSummary(int rides, double totalFare) {
		this.rides = rides;
		this.totalFare = totalFare;
		this.avgFare = this.totalFare/this.rides;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(avgFare) == Double.doubleToLongBits(other.avgFare) && rides == other.rides
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}
	

}
