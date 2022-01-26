package service;

import model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(String id);

    void save(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String address, String idType);

    void create(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String address, String idType);

    void deleteById(String id);

    List<Customer> findByName(String name);

    List<Customer> search(String name, String email, String idType);
}
