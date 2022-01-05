package service.impl;

import model.Product;
import responsitory.IProductResponsitory;
import responsitory.impl.ProductResponsitory;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductResponsitory iProductResponsitory = new ProductResponsitory();

    @Override
    public List<Product> findAll() {
        return iProductResponsitory.displayAll();
    }

    @Override
    public boolean createProduct(Product product) {
        Product product1 = findById(product.getId().toString());
        if (product1 != null) {
            return false;
        } else {
            iProductResponsitory.createProduct(product);
            return true;
        }
    }

    @Override
    public Product findById(String id) {
        return iProductResponsitory.findById(id);
    }

    @Override
    public void save(String id, String name, String price) {
        iProductResponsitory.save(id, name, price);
    }

    @Override
    public void deleteById(String id) {
iProductResponsitory.deleteById(id);
    }


}
