package com.shopping.store.service.product;

import com.shopping.store.model.Product;
import com.shopping.store.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByNameAndBrand(String category, String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String Brand) {
        return List.of();
    }

    @Override
    public Long countProductsByNameAndBrand(String brand, String Name) {
        return 0L;
    }
}
