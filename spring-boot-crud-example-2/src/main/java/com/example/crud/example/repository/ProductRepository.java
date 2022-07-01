package com.example.crud.example.repository;

import com.example.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// <Class, Datatype of primary key>
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
