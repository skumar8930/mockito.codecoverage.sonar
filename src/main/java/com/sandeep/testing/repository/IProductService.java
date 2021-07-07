package com.sandeep.testing.repository;

import java.util.List;

import com.sandeep.testing.model.Product;

public interface IProductService {
	public Integer saveProduct(Product p);
	public void deleteProduct(Integer prodId);
	public Product getProductById(Integer prodId);
	public List<Product> getAllProducts();
	public boolean isProductExist(Integer id);
	

}
