package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductBill {
    @EmbeddedId
    private ProductBillKey id;
    @OneToMany
    @JoinColumn(name = "productId" , referencedColumnName = "")
    private Set<Product> product;
}
