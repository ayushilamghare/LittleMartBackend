package in.littlemart.controller;

import in.littlemart.entities.Product;
import in.littlemart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductWithResponseEntityController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable int productId) {
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity deletebyId(@PathVariable int productId) {
        productService.deleteProductById(productId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getProductOrEmptyString(int id) {
        Product product = null;
        if (product == null)
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<>(product, HttpStatus.OK);
    }

    //This Comment was written from ayu's branch

}
