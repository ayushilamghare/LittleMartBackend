package in.littlemart.controller;

import in.littlemart.entities.Product;
import in.littlemart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product1")
public class ProductController {
//
//    @Autowired
//    ProductService productService;
//
//    @PostMapping
//    public void addProduct(@RequestBody Product product) {
//        productService.saveProduct(product);
//    }
//
//    @GetMapping("/{productId}")
//    public Product getProductById(@PathVariable int productId) {
//        return productService.getProductById(productId);
//    }
//
//    @GetMapping
//    public List<Product> getAllProduct() {
//        List<Product> products = productService.getAllProducts();
//        return products;
//    }
//
//    @DeleteMapping("/{productId}")
//    public void deletebyId(@PathVariable int productId) {
//        productService.deleteProductById(productId);
//    }
}
