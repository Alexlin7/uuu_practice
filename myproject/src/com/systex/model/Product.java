package com.systex.model;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private boolean free;
	private int stock;
	
	public Product() { //Default Constructor
		super();
	}
	
	
	
	public Product(int id, String name) {
		this(id, name, 0.0, false, 0);
	}



	public Product(int id, String name, double unitPrice, boolean free, int stock) {
		//super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.free = free;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + unitPrice + "\t" + free + "\t" + stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		if (unitPrice >= 10.0) {
			this.unitPrice = unitPrice;
		} else {
			this.unitPrice = 10.0;
		}
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getStock() {
		return stock;
	}

	public void incStock(int amount) {
		this.stock += amount;
	}
	
	public void decStock(int amount) {
		this.stock -= amount;
	}
	
	
	
	
}
