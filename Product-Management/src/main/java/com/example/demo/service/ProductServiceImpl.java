package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Override
	public Products saveProduct(Products product) {

		return productRepo.save(product);
	}

	@Override
	public List<Products> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public Products getProductById(Integer id) {
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		Products product = productRepo.findById(id).get();

		if (product != null) {
			productRepo.delete(product);
			return "Product Delete Sucessfully";
		}

		return "Something wrong on server";
	}

	@Override
	public Products editProduct(Products p, Integer id) {

		Products oldProduct = productRepo.findById(id).get();

		oldProduct.setProductName(p.getProductName());
		oldProduct.setQuantity(p.getQuantity());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());

		return productRepo.save(oldProduct);
	}

}