package com.systex.testJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.systex.testJDBC.lab3.Product;
import com.systex.testJDBC.lab3.ProductDAO;

@SpringBootApplication
public class TestJdbcApplication implements CommandLineRunner {

	@Autowired
	private ProductDAO productDAO;

	public static void main(String[] args) {
		SpringApplication.run(TestJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product();
		p1.setName("Elephant");
		p1.setDescription("This is an elephant");
		System.out.println(this.productDAO.insert(p1));
		
		this.productDAO
		.getProducts()
		.forEach(System.out::println);
		
		System.out.println("=====================");
		System.out.println(this.productDAO.getProduct(1));

		Product p2 = new Product();
		p2.setProductId(1);
		p2.setName("Monkey");
		p2.setDescription("This is a Monkey");
		this.productDAO.update(p2);
		
		this.productDAO
		.getProducts()
		.forEach(System.out::println);
	}

}
