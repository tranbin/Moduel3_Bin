package repository.imp;

import model.customer.CustomerType;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    public List<CustomerType> selectAllCustomerType() {
        List<CustomerType> customerTypes = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection()
                    .prepareStatement("select*from loai_khach");

            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerType customerType;
            while (resultSet.next()) {
                customerType = new CustomerType();
                customerType.setIdType(resultSet.getInt("ma_loai_khach"));
                customerType.setNameOfType(resultSet.getString("ten_loai_khach"));
                customerTypes.add(customerType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypes;
    }
}
