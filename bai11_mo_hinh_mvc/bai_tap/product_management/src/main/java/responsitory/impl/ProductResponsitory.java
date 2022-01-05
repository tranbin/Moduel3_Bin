package responsitory.impl;

import model.Product;
import responsitory.IProductResponsitory;

import java.util.ArrayList;
import java.util.List;

public class ProductResponsitory implements IProductResponsitory {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Nokia", 10.0, "vn", "china"));
        productList.add(new Product(2, "Nokia1", 11.0, "vn1", "china1"));
        productList.add(new Product(3, "Nokia2", 12.0, "vn2", "china2"));
    }

    @Override
    public List<Product> displayAll() {
        return productList;
    }

    @Override
    public Product findById(String id) {
        Integer temp = Integer.parseInt(id);
        for (Product product : productList) {
            if (product.getId().equals(temp)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void createProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void save(String id, String name, String price) {
        Integer temp = Integer.parseInt(id);
        for (Product product : productList) {
            if (product.getId().equals(temp)) {
                product.setName(name);
                product.setPrice(Double.valueOf(price));
            }
        }
    }

    @Override
    public void deleteById(String id) {
        Integer temp = Integer.parseInt(id);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(temp)) {
                productList.remove(i);
                break;
            }
        }
    }
}
