package in.littlemart.service;

import in.littlemart.exceptions.LittleMartException;
import in.littlemart.entities.Product;
import in.littlemart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public Product getProductById(int productId)
    {
        return productRepository.findById(productId).orElseThrow(()-> new LittleMartException("Product with id : "+productId+" not found"));
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }
}
