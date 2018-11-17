package edu.cs.mum.gdmstore.productservice.controller;

import edu.cs.mum.gdmstore.productservice.model.Product;
import edu.cs.mum.gdmstore.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable long productId) {
        return productService.getProductById(productId);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/suppliers")
    public String  getSuppliers(){
        return productService.getSuppliers();
    }

    @DeleteMapping
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
}
