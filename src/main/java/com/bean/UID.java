package com.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("uidBean")
public class UID {
	Double uid;
	String firstName;
	String lastName;
	Date dob;
	Address address;
	
	@Value("#{OfficeBean}")
	OfficeAddress OfficeAddress;
	
	public OfficeAddress getOfficeAddress() {
		return OfficeAddress;
	}
	public void setOfficeAddress(OfficeAddress officeAddress) {
		this.OfficeAddress = officeAddress;
	}
	public Double getUid() {
		return uid;
	}
	public void setUid(Double uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
}
