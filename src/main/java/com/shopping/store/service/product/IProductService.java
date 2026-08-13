package com.shopping.store.service.product;

import com.shopping.store.model.Product;
import com.shopping.store.request.AddProductRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByBrandAndName(String brand, String name);
    List<Product> getProductsByCategoryAndBrand(String category, String Brand);

    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);

    Long countProductsByBrandAndName(String brand, String Name);





}
