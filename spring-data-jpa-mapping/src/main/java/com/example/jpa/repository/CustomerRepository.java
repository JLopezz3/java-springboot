package com.example.jpa.repository;

import com.example.jpa.dto.OrderResponse;
import com.example.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// JpaRepository<name of class, datatype of primary key>
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // this query statement is related to JPA, not SQL
    @Query("SELECT new com.example.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}
