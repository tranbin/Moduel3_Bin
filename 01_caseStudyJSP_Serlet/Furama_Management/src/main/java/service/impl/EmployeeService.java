package service.impl;

import model.Employee;
import repository.ICustomerRepository;
import repository.IEmployeeRepository;
import repository.impl.CustomerRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
   private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(String id) {
        return iEmployeeRepository.findById(id);
    }

    @Override
    public void save(String id, String name, String dateOfBirth, String idCard, String salary, String phone, String email,
                     String address, String typeId, String position, String education, String division, String username) {
        iEmployeeRepository.save(id,name,dateOfBirth,idCard,salary,phone,email,address,typeId,position,education,division,username);
    }

    @Override
    public void deleteById(String employeeId) {
        iEmployeeRepository.deleteById(employeeId);
    }

    @Override
    public void create(Employee employee) {
iEmployeeRepository.create(employee);
    }

    @Override
    public List<Employee> findByName(String name) {
        return iEmployeeRepository.findByName(name);
    }
}
