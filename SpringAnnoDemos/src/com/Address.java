package com;

public class Address {
	private int aID;
	private String city;
	private String State;
	
		
	public Address() {
		super();
	}
	public Address(int aID, String city, String state) {
		super();
		this.aID = aID;
		this.city = city;
		State = state;
	}
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [aID=" + aID + ", city=" + city + ", State=" + State + "]";
	}
	
	
}
