package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    boolean createProduct(Product product);

    Product findById(String id);

    void save(String id, String name, String price);

    void deleteById(String id);
}
