package com.systex.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

public class Customer {
	private String id;
	private String name;
	private String address;
	private Date birthDate;
	private char gender;
	private boolean married;
	private String email;
	
	public Customer() {
		//super();
	}
	
	public Customer(String id, String name) {
		//super();
		this(id, name, "");
	}

	public Customer(String id, String name, String address) {
		//super();
		this(id, name, address, new GregorianCalendar(2010, 0, 1).getTime(), 'U', false, "");
	}

	public Customer(String id, String name, String address, Date birthDate, char gender, boolean married,
			String email) {
		//super();
		this.setId(id);
		this.setName(name);
		this.setAddress(address);
		this.setBirthDate(birthDate);
		this.setGender(gender);
		this.setMarried(married);
		this.setEmail(email);
	}
	
	public boolean checkId(String id) {
		boolean isMatch = Pattern.matches("^[A-Za-z]{1}[1-2]{1}[0-9]{8}$", id);
		if (!isMatch) {
			return false;
		}
		id = id.toUpperCase();
		String[] country = new String[] { "A","B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "W", "Z", "I", "O" };
		
		return true;
	}

	public String getId() {
		return id;
	}
	
	public final void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public final void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public final void setAddress(String address) {
		this.address = address;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public final void setBirthDate(Date birthDate) {
		if (birthDate.before(new GregorianCalendar().getTime())) {
			this.birthDate = birthDate;
		} else {
			this.birthDate = new GregorianCalendar(2010, 0, 1).getTime();
		}
		
	}
	
	public final void setBirthDate(String birthDate) {
		Date birth;
		try {
			birth = SimpleDateFormat.getDateInstance().parse(birthDate);
			setBirthDate(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public char getGender() {
		return gender;
	}
	
	public final void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		} else {
			this.gender = 'U';
		}
	}
	
	public boolean isMarried() {
		return married;
	}
	
	public final void setMarried(boolean married) {
		this.married = married;
	}
	
	public String getEmail() {
		return email;
	}
	
	public final void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", married=" + married + ", email=" + email + "]";
	}
	
}
