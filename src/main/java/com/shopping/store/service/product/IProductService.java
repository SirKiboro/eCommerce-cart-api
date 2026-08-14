package com.shopping.store.service.product;

import com.shopping.store.model.Product;
import com.shopping.store.request.AddProductRequest;
import com.shopping.store.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

    Product addProduct(AddProductRequest product);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    Product getProductById(Long id);

    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByBrandAndName(String brand, String name);
    List<Product> getProductsByCategoryAndBrand(String category, String Brand);

    void deleteProductById(Long id);


    Long countProductsByBrandAndName(String brand, String Name);





}
