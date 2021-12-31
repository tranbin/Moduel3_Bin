package service.impl;

import model.Customer;
import responsitory.ICustomerResponsitory;
import responsitory.impl.CustomerResponsitory;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerResponsitory iCustomerResponsitory = new CustomerResponsitory();

    @Override
    public List<Customer> findAll() {
        return iCustomerResponsitory.findAll();
    }
}
