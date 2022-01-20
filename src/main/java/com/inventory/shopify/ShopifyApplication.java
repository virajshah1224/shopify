package com.inventory.shopify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inventory.shopify.entity.Inventory;
import com.inventory.shopify.repository.InventoryRepository;

@SpringBootApplication
public class ShopifyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ShopifyApplication.class, args);
	}

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 Inventory product1 = new Inventory(1, "Shoes", "200");
		 inventoryRepository.save(product1);
		 
//		 Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		 studentRepository.save(student2);
//		 
//		 Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		 studentRepository.save(student3);
		
		
	}
}
