package edu.cs.mum.gdmstore.productservice.service.impl;

import edu.cs.mum.gdmstore.productservice.model.Product;
import edu.cs.mum.gdmstore.productservice.repository.ProductRepository;
import edu.cs.mum.gdmstore.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Autowired
    RestTemplate restTemplate;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public String  getSuppliers(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://supplier-service/suppliers/1", String.class);
        return forEntity.getBody();
    }
}
