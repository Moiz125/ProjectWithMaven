package com.back;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Address {
	
	@Id
	private int postalCode;
	private String address;
	
	@Override
	public String toString() {
		return "Address [address=" + address + ", postalCode=" + postalCode + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String address, int postalCode) {
		super();
		this.address = address;
		this.postalCode = postalCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
}
