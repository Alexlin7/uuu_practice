package com.systex.main;

import com.systex.model.Product;
import com.systex.service.ProductService;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("可口可樂");
		p1.setUnitPrice(12.0);
		p1.setFree(false);
		p1.incStock(5000);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("擺飾可樂");
		p2.setUnitPrice(13.5);
		p2.setFree(false);
		p2.incStock(114514);
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("鱈魚香絲");
		p3.setUnitPrice(60.0);
		p3.setFree(false);
		p3.incStock(2000);
		
		Product p4 = new Product();
		p4.setId(4);
		p4.setName("紅茶");
		p4.setUnitPrice(19);
		p4.setFree(false);
		p4.incStock(19810);
		
		Product p5 = new Product();
		p5.setId(5);
		p5.setName("多力多滋");
		p5.setUnitPrice(44.5);
		p5.setFree(false);
		p5.incStock(1000);
		
		Product p6 = new Product(6, "咖啡蛋捲");
		p6.setFree(false);
		p6.setUnitPrice(44);
		p6.incStock(50000);
		
		Product p7 = new Product(7, "何首烏", 100000, false,20);
		
		ProductService productService = new ProductService();
		
		System.out.println("產品庫存報表");
		System.out.println("=========================================");
		System.out.println("序號\t品名\t單價\t免費(?)\t 庫存量\t庫存價值");
		System.out.println(p1 + "\t" + productService.calulateProductInventory(p1));
		System.out.println(p2 + "\t" + productService.calulateProductInventory(p2));
		System.out.println(p3 + "\t" + productService.calulateProductInventory(p3));
		System.out.println(p4 + "\t" + productService.calulateProductInventory(p4));
		System.out.println(p5 + "\t" + productService.calulateProductInventory(p5));
		System.out.println(p6 + "\t" + productService.calulateProductInventory(p6));
		System.out.println(p7 + "\t" + productService.calulateProductInventory(p7));
		System.out.println("=========================================");
		
	}

}
