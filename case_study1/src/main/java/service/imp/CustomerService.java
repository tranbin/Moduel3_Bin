package service.imp;

import model.customer.Customer;
import repository.ICustomerRepository;
import repository.imp.CustomerRepository;
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
    public void save(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String address, String idType) {
        iCustomerRepository.save(id,name,dateOfBirth,gender,idCard,phone,email,address,idType);
    }

    @Override
    public void create(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String address, String idType) {
        iCustomerRepository.create(id,name,dateOfBirth,gender,idCard,phone,email,address,idType);
    }

    @Override
    public void deleteById(String id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return iCustomerRepository.findByName(name);
    }

    @Override
    public List<Customer> search(String name, String email, String idType) {
        return iCustomerRepository.search(name,email,idType);
    }


}
