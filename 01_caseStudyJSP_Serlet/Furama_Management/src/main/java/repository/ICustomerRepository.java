package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(String id);

    void save(String customerId, String customerTypeId, String customerName, String customerBirthday, String customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress);

    void create(Customer customer);

    void delete(String customerId);

    List<Customer> findByName(String name);
}
