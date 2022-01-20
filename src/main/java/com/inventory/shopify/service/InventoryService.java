package com.inventory.shopify.service;

import java.util.List;

import com.inventory.shopify.entity.Inventory;

public interface InventoryService {

	List<Inventory> getAllProduct();
	
	Inventory saveProduct(Inventory inventory);
	
	Inventory getProductByID(int id);
	
	Inventory updateProduct(Inventory inventory);
	
	void deleteProductById(int id);

	Inventory getProductById(int id);

	
}
