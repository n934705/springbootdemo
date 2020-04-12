package com.example.demo.Entity;


/**
 * The persistent class for the v_customerbystate database table.
 * 
 */

public class VCustomerbystate {

	private String contactFirstName;

	private String contactLastName;

	private int customerNumber;

	private int salesRepEmployeeNumber;

	public VCustomerbystate() {
	}

	public String getContactFirstName() {
		return this.contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return this.contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public int getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getSalesRepEmployeeNumber() {
		return this.salesRepEmployeeNumber;
	}

	public void setSalesRepEmployeeNumber(int salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

}