package com.systex.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.systex.demo.model.IProduct;
import com.systex.demo.model.Product;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private Product p;

	public static void main(String[] args) {
		System.out.println("Start Spring Boots Application");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("End Spring Boots Application");
	}

//	@Bean
//	@Scope("prototype")
//	public Product name() { //Factory Method
//		Product product = new Product();
//		product.setId(10001);
//		product.setName("iphone");
//		product.setDescription("貴不是我們的問題 而是你的問題");
//		return product;
//	}

	@Override
	public void run(String... args) throws Exception {
		// Glue Code
//		ApplicationContext container = new AnnotationConfigApplicationContext(DemoApplication.class);
//		Product p1 = container.getBean(Product.class);
//		Product p2 = container.getBean(Product.class);
//		
//		System.out.println(p1);
//		System.out.println(p2);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getDescription());

	}
}
