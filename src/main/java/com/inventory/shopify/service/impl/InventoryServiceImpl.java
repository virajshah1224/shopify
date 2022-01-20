package com.inventory.shopify.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inventory.shopify.entity.Inventory;
import com.inventory.shopify.repository.InventoryRepository;
import com.inventory.shopify.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	private InventoryRepository inventoryRepository;
	
	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		super();
		this.inventoryRepository = inventoryRepository;
	}

	@Override
	public List<Inventory> getAllProduct() {
		// TODO Auto-generated method stub
		return inventoryRepository.findAll();
	}

	@Override
	public Inventory saveProduct(Inventory inventory) {
		// TODO Auto-generated method stub
		return inventoryRepository.save(inventory);
	}

	@Override
	public Inventory getProductById(int id) {
		// TODO Auto-generated method stub
		return inventoryRepository.findById(id).get();
	}

	@Override
	public Inventory updateProduct(Inventory inventory) {
		// TODO Auto-generated method stub
		return inventoryRepository.save(inventory);
	}

	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		inventoryRepository.deleteById(id);
	}

	@Override
	public Inventory getProductByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}	
	

}
