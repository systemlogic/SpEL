package com.bean;

public class Address {
	Integer DoorNumber;
	String SocityName;
	String Locality;
	String District;
	String State;
	Integer Pin;
	Address(){
		
	}
	public Address(int dn, String sn, String lo, String di, String st, int pi){
		this.DoorNumber = dn;
		this.SocityName = sn;
		this.Locality = lo;
		this.District = di;
		this.State = st;
		this.Pin = pi;
	}
	public Integer getDoorNumber() {
		return DoorNumber;
	}
	public void setDoorNumber(Integer doorNumber) {
		DoorNumber = doorNumber;
	}
	public String getSocityName() {
		return SocityName;
	}
	public void setSocityName(String socityName) {
		SocityName = socityName;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Integer getPin() {
		return Pin;
	}
	public void setPin(Integer pin) {
		Pin = pin;
	}
	public String toString(){
		return "Address-\nDoor# "+ this.getDoorNumber() +
				"\nSociety " + this.getSocityName()+
				"\nLocality " + this.getLocality()+
				"\nDistrict " + this.getDistrict()+
				"\nState " + this.getState()+
				"\nPin# "+ this.getPin();
				
	}
}
