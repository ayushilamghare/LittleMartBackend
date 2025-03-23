package in.littlemart.service;

import in.littlemart.entities.Product;
import in.littlemart.repository.ProductRepository;
import org.hibernate.procedure.ProcedureOutputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public Product getProductById(int productId)
    {
        return productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Product not found"));
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }
}
