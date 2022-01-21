package repository.impl;

import model.Customer;
import model.Employee;
import repository.IEmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeRepository implements IEmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("employee_name"));
                employee.setDateOfBirth(resultSet.getString("employee_birthday"));
                employee.setIdCard(resultSet.getString("employee_id_card"));
                employee.setSalary(resultSet.getDouble("employee_salary"));
                employee.setPhone(resultSet.getString("employee_phone"));
                employee.setEmail(resultSet.getString("employee_email"));
                employee.setAddress(resultSet.getString("employee_address"));
                employee.setTypeId(resultSet.getInt("employee_type_id"));
                employee.setPosition(resultSet.getInt("position_id"));
                employee.setEducation(resultSet.getInt("education_degree_id"));
                employee.setDivision(resultSet.getInt("division_id"));
                employee.setUsername(resultSet.getString("username"));
                employeeList.add(employee);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee findById(String id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee where employee_id = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("employee_name"));
                employee.setDateOfBirth(resultSet.getString("employee_birthday"));
                employee.setIdCard(resultSet.getString("employee_id_card"));
                employee.setSalary(resultSet.getDouble("employee_salary"));
                employee.setPhone(resultSet.getString("employee_phone"));
                employee.setEmail(resultSet.getString("employee_email"));
                employee.setAddress(resultSet.getString("employee_address"));
                employee.setTypeId(resultSet.getInt("employee_type_id"));
                employee.setPosition(resultSet.getInt("position_id"));
                employee.setEducation(resultSet.getInt("education_degree_id"));
                employee.setDivision(resultSet.getInt("division_id"));
                employee.setUsername(resultSet.getString("username"));
                break;
            }
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(String id, String name, String dateOfBirth,
                     String idCard, String salary, String phone, String email, String address,
                     String typeId, String position, String education, String division, String username) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update employee set employee_name = ?," +
                            " employee_birthday = ? , employee_id_card = ?, employee_salary = ?, " +
                            "employee_phone = ?, employee_email = ?, employee_address = ?," +
                            " employee_type_id = ? , position_id = ?, education_degree_id = ?, division_id = ?," +
                            "username = ? where employee_id = ?");
            preparedStatement.setInt(13, Integer.parseInt(id));
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, dateOfBirth);
            preparedStatement.setString(3, idCard);
            preparedStatement.setDouble(4, Double.parseDouble(salary));
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, address);
            preparedStatement.setInt(8, Integer.parseInt(typeId));
            preparedStatement.setInt(9, Integer.parseInt(position));
            preparedStatement.setInt(10, Integer.parseInt(education));
            preparedStatement.setInt(11, Integer.parseInt(division));
            preparedStatement.setString(12, username);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(String employeeId) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from employee where employee_id = ?");
            preparedStatement.setInt(1, Integer.parseInt(employeeId));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(Employee employee) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                        .prepareStatement("insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary," +
                            "employee_phone,employee_email,employee_address,employee_type_id," +
                            "position_id,education_degree_id,division_id,username) value(?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getDateOfBirth());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getTypeId());
            preparedStatement.setInt(9, employee.getPosition());
            preparedStatement.setInt(10, employee.getEducation());
            preparedStatement.setInt(11, employee.getDivision());
            preparedStatement.setString(12, employee.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from employee where employee_name like ?");
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("employee_name"));
                employee.setDateOfBirth(resultSet.getString("employee_birthday"));
                employee.setIdCard(resultSet.getString("employee_id_card"));
                employee.setSalary(resultSet.getDouble("employee_salary"));
                employee.setPhone(resultSet.getString("employee_phone"));
                employee.setEmail(resultSet.getString("employee_email"));
                employee.setAddress(resultSet.getString("employee_address"));
                employee.setTypeId(resultSet.getInt("employee_type_id"));
                employee.setPosition(resultSet.getInt("position_id"));
                employee.setEducation(resultSet.getInt("education_degree_id"));
                employee.setDivision(resultSet.getInt("division_id"));
                employee.setUsername(resultSet.getString("username"));
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}

