package edu.cs.mum.gdmstore.productservice.repository;

import edu.cs.mum.gdmstore.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
