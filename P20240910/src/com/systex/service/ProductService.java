package com.systex.service;

import com.systex.model.Product;

public class ProductService {
	public double calulateProductInventory(Product product) {
		return product.getUnitPrice() * product.getStock();
	}
}
