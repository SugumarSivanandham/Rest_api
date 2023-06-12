package com.example.demo.service;
	import java.util.List;

	import com.example.demo.model.Products;

	public interface ProductService {

		public Products saveProduct(Products product);

		public List<Products> getAllProduct();

		public Products getProductById(Integer id);

		public String deleteProduct(Integer id);

		public Products editProduct(Products product,Integer id);
		
	}

