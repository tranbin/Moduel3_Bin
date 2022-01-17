package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(String id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void save(String customerId, String customerTypeId, String customerName, String customerBirthday,
                     String customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress) {
        iCustomerRepository.save(customerId,customerTypeId,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerEmail,customerAddress);
    }

    @Override
    public void create(Customer customer) {
        iCustomerRepository.create(customer);
    }

    @Override
    public void deleteById(String customerId) {
        iCustomerRepository.delete(customerId);
    }

    @Override
    public List<Customer> findByName(String name) {
        return iCustomerRepository.findByName(name);
    }
}
