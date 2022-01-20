package com.inventory.shopify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.inventory.shopify.entity.Inventory;
import com.inventory.shopify.service.InventoryService;

@Controller
public class InventoryIems {

	private InventoryService inventoryService;

	public InventoryIems(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/products")
	public String listStudents(Model model) {
		model.addAttribute("students", inventoryService.getAllProduct());
		return "Product";
	}
	
	@GetMapping("/products/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Inventory inventory = new Inventory();
		model.addAttribute("inventory", inventory);
		return "AddProduct";
		
	}
	
	@PostMapping("/products")
	public String saveStudent(@ModelAttribute("product") Inventory inventory) {
		inventoryService.saveProduct(inventory);
		return "redirect:/Product";
	}
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome !!";
	}
	
	@GetMapping("/products/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model) {
		model.addAttribute("product", inventoryService.getProductById(id));
		return "EditProduct";
	}

	@PostMapping("/products/{id}")
	public String updateStudent(@PathVariable int id,
			@ModelAttribute("product") Inventory inventory,
			Model model) {
		
		// get student from database by id
		Inventory existingProduct = inventoryService.getProductById(id);
		existingProduct.setId(id);
		existingProduct.setProductName(inventory.getProductName());
		existingProduct.setPrice(inventory.getPrice());
		
		// save updated student object
		inventoryService.updateProduct(existingProduct);
		return "redirect:/Product";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/products/{id}")
	public String deleteStudent(@PathVariable int id) {
		inventoryService.deleteProductById(id);
		return "redirect:/Product";
	}
	
}
