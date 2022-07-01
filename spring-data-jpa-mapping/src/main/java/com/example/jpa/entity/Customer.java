package com.example.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

// lombok allows us to now have to generate getters/setters
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {

    // A CUSTOMER CAN HAVE MULTIPLE PRODUCTS


    @Id
    @GeneratedValue
    // created auto-generated primary key ^^
    private int id;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
    private List<Product> products;

}
