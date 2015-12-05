package com.contribute.india.api.dto;

public class RegisterRequest {
	String name;
	String address;
	String contactDetail;
	
	public RegisterRequest() {
		super();
	}
	
	public RegisterRequest(String name, String address, String contactDetail) {
		super();
		this.name = name;
		this.address = address;
		this.contactDetail = contactDetail;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactDetail() {
		return contactDetail;
	}
	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}
	@Override
	public String toString() {
		return "RegisterRequest [name=" + name + ", address=" + address + ", contactDetail=" + contactDetail + "]";
	}
	
}
