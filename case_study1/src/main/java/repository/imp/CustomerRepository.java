package repository.imp;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select*from khach_hang inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("ma_khach_hang"));
                customer.setName(resultSet.getString("ho_ten"));
                customer.setDateOfBirth(resultSet.getString("ngay_sinh"));
                customer.setGender(resultSet.getInt("gioi_tinh"));
                customer.setIdCard(resultSet.getString("so_cmnd"));
                customer.setPhone(resultSet.getString("so_dien_thoai"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("dia_chi"));
                int id = resultSet.getInt("ma_loai_khach");
                String name = resultSet.getString("ten_loai_khach");
                customer.setCustomerType(new CustomerType(id, name));
                customerList.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(String id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select*from khach_hang inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach where ma_khach_hang  = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("ma_khach_hang"));
                customer.setName(resultSet.getString("ho_ten"));
                customer.setDateOfBirth(resultSet.getString("ngay_sinh"));
                customer.setGender(resultSet.getInt("gioi_tinh"));
                customer.setIdCard(resultSet.getString("so_cmnd"));
                customer.setPhone(resultSet.getString("so_dien_thoai"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("dia_chi"));
                int id1 = resultSet.getInt("ma_loai_khach");
                String name = resultSet.getString("ten_loai_khach");
                customer.setCustomerType(new CustomerType(id1, name));
                break;
            }
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String address, String idType) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update khach_hang set ho_ten = ?," +
                            " ngay_sinh = ? , gioi_tinh = ?, so_cmnd = ?, " +
                            "so_dien_thoai = ?, email = ?, dia_chi = ?, " +
                            "ma_loai_khach = ? where ma_khach_hang = ?");
            preparedStatement.setInt(9, Integer.parseInt(id));
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, dateOfBirth);
            preparedStatement.setInt(3, Integer.parseInt(gender));
            preparedStatement.setString(4, idCard);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, address);
            preparedStatement.setInt(8, Integer.parseInt(idType));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String address, String idType) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into khach_hang values (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, dateOfBirth);
            preparedStatement.setInt(4, Integer.parseInt(gender));
            preparedStatement.setString(5, idCard);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, email);
            preparedStatement.setString(8, address);
            preparedStatement.setInt(9, Integer.parseInt(idType));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from khach_hang where ma_khach_hang = ?");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select*from khach_hang inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach where ho_ten like ?");
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = new Customer();
            while (resultSet.next()) {

                customer = new Customer();
                customer.setId(resultSet.getInt("ma_khach_hang"));
                customer.setName(resultSet.getString("ho_ten"));
                customer.setDateOfBirth(resultSet.getString("ngay_sinh"));
                customer.setGender(resultSet.getInt("gioi_tinh"));
                customer.setIdCard(resultSet.getString("so_cmnd"));
                customer.setPhone(resultSet.getString("so_dien_thoai"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("dia_chi"));
                int id1 = resultSet.getInt("ma_loai_khach");
                String name1 = resultSet.getString("ten_loai_khach");
                customer.setCustomerType(new CustomerType(id1, name1));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public List<Customer> search(String name, String email, String idType) {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select*from khach_hang inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach where ho_ten like ? or email like ? or ma_loai_khach like ?");
            preparedStatement.setString(1, "%" + name + "%");
            preparedStatement.setString(2, "%" + email + "%");
            preparedStatement.setString(3, "%" + idType + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = new Customer();
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("ma_khach_hang"));
                customer.setName(resultSet.getString("ho_ten"));
                customer.setDateOfBirth(resultSet.getString("ngay_sinh"));
                customer.setGender(resultSet.getInt("gioi_tinh"));
                customer.setIdCard(resultSet.getString("so_cmnd"));
                customer.setPhone(resultSet.getString("so_dien_thoai"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("dia_chi"));
                int id1 = resultSet.getInt("ma_loai_khach");
                String name1 = resultSet.getString("ten_loai_khach");
                customer.setCustomerType(new CustomerType(id1, name1));
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
    /*
                * ma_khach_hang int primary key auto_increment,
            ho_ten varchar(45) not null,
            ngay_sinh date not null,
            gioi_tinh bit default 1 not null,
            so_cmnd varchar(45) not null,
            so_dien_thoai varchar(45) not null,
            email varchar(45),
            dia_chi varchar(45),
            ma_loai_khach int,*/

