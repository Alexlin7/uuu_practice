package com.systex.model;

public class Member {
	private int id;
	private String fristName;
	private String lastName;
	private String street;
	private String city;
	
	public Member(int id, String fristName, String lastName, String street, String city) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
	}
	
	public Member() {
		super();
	}

	
	public Member(String fristName, String lastName, String street, String city) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFristName() {
		return fristName;
	}
	
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", street=" + street
				+ ", city=" + city + "]";
	}
	

}
