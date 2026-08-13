package com.shopping.store.service.product;

import com.shopping.store.model.Product;

import java.util.List;

public interface IProductService {

    Product addProduct (Product product);

    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByBrandAndName(String brand, String name);
    List<Product> getProductsByCategoryAndBrand(String category, String Brand);

    Long countProductsByBrandAndName(String brand, String Name);





}
