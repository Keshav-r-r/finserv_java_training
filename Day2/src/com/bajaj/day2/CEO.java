package com.bajaj.day2;

public class CEO {
	private String name, company;

	public CEO(String name, String company) {
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String toString() {
		return "CEO [name=" + name + ", company=" + company + "]";
	}
	
}
