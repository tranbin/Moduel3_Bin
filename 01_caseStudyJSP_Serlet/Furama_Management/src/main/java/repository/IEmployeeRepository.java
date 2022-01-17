package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();

    Employee findById(String id);

    void save(String id, String name, String dateOfBirth, String idCard, String salary, String phone, String email, String address, String typeId, String position, String education, String division, String username);

    void deleteById(String employeeId);

    void create(Employee employee);

    List<Employee> findByName(String name);
}
