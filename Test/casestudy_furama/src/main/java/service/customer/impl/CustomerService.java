package service.customer.impl;

import model.Customer;
import repository.customer.ICustomerRepository;

import repository.customer.impl.CustomerRepository;
import service.customer.ICustomerService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> selectAllCustomers() {
       return iCustomerRepository.selectAllCustomers();
    }

    @Override
    public Customer selectCustomer(int id) {
        return iCustomerRepository.selectCustomer(id);
    }

    @Override
    public int getTotalCustomer() {
        return iCustomerRepository.getTotalCustomer();
    }

    @Override
    public List<Customer> pagingCustomer(int index) {
        return iCustomerRepository.pagingCustomer(index);
    }

    @Override
    public HashMap<String, String> insertCustomer(Customer customer) throws SQLException {
        //Tạo map
        HashMap<String, String> map = new HashMap<>();

        //Tạo class mới để kiểm tra
        //1.	Mã Khách hàng có định dạng là KH-XXXX (X là số từ 0-9)
        if(!customer.getCustomer_name().matches("^KH-\\d{4}$")){
            map.put("name", "Lỗi định dạng name");
        }
        if(!customer.getCustomer_phone().matches("^KH-\\d{4}$")){

        }
        if(map.isEmpty()){
            iCustomerRepository.insertCustomer(customer);
        }
        return map;
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
         iCustomerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) throws SQLException {
        iCustomerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> selectCustomerByName(String name) {
        return iCustomerRepository.selectCustomerByName(name);
    }
}
