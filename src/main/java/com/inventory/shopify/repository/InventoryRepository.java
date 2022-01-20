package com.inventory.shopify.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.shopify.entity.Inventory;


//@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

	
	
}
