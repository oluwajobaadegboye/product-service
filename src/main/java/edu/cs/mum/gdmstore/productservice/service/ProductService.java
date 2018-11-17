package edu.cs.mum.gdmstore.productservice.service;


import edu.cs.mum.gdmstore.productservice.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProductById(long productId);
    public Product createProduct(Product product);
    public void deleteProduct(Product product);
    public Product updateProduct(Product product);
    public String  getSuppliers();
}
