package org.anup.javabrains.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//this class contains the sub datas of Address
@Embeddable // tells hibernate not to create separate table for this
// tells this object needs to embedded inside something else
public class Address {
	@Column(name="STREET_NAME")
	public String street;
	@Column(name="CITY_NAME")
	public String city;
	@Column(name="STATE_NAME")
	public String state;
	@Column(name="PIN_CODE")
	public String pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
