package com.sandeep.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandeep.testing.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
