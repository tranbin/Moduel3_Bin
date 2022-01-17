package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(String id);

    void save(String customerId, String customerTypeId, String customerName, String customerBirthday, String customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress);

    void create(Customer customer);

    void deleteById(String customerId);

    List<Customer> findByName(String name);
}
