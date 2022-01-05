package responsitory;

import model.Product;

import java.util.List;

public interface IProductResponsitory {
    List<Product> displayAll();

    Product findById(String id);

    void createProduct(Product product);

    void save(String id, String name, String price);

    void deleteById(String id);
}
