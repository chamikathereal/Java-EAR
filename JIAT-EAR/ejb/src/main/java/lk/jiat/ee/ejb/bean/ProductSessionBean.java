package lk.jiat.ee.ejb.bean;

import jakarta.ejb.Stateless;

import lk.jiat.ee.core.model.Product;
import lk.jiat.ee.ejb.remote.ProductService;

import java.util.List;

@Stateless
public class ProductSessionBean implements ProductService {

    @Override
    public Product getProductById(int id) {
        return new Product(1,"Test Product","Test description", 1000.00, 5);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1,"Test Product","Test description", 1000.00, 5),
                new Product(2,"Test Product 2","Test description", 2000.00, 8),
                new Product(3,"Test Product 3","Test description", 5000.00, 4)
        );
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }
}
