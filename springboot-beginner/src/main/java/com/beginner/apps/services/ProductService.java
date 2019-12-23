package com.beginner.apps.services;

import java.util.Collection;

import com.beginner.apps.model.Product;

/*
 * #Tutorialspoint - Service Component
 * 
 */

public interface ProductService {
	   public abstract void createProduct(Product product);
	   public abstract void updateProduct(String id, Product product);
	   public abstract void deleteProduct(String id);
	   public abstract Collection<Product> getProducts();
}
