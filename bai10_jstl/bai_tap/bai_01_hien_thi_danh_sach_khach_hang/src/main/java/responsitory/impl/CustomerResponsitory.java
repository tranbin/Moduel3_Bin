package responsitory.impl;

import model.Customer;
import responsitory.ICustomerResponsitory;

import java.util.ArrayList;
import java.util.List;

public class CustomerResponsitory implements ICustomerResponsitory {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Mai Văn Hoàng","1983-02-20","Hà Nội"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định"));
        customerList.add(new Customer("Trần Văn Hoàng","1983-08-17","Đà Nẵng"));
        customerList.add(new Customer("Nguyễn Văn Bôn","1983-08-11","Hải Phòng"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
