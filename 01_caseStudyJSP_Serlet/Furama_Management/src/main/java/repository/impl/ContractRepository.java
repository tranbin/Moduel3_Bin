package repository.impl;

import model.Contract;
import repository.IContractRepository;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Contract> findAll() {
        List<Contract> contractList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from contract");
            ResultSet resultSet = preparedStatement.executeQuery();
            Contract contract;
            while (resultSet.next()) {
                contract = new Contract();
                contract.setId(resultSet.getInt("contract_id"));
                contract.setStartDay(resultSet.getString("contract_start_date"));
                contract.setEndDay(resultSet.getString("contract_end_date"));
                contract.setDeposit(resultSet.getDouble("contract_deposit"));
                contract.setTotalMoney(resultSet.getDouble("contract_total_money"));
                contract.setEmployeeId(resultSet.getInt("employee_id"));
                contract.setCustomerId(resultSet.getInt("customer_id"));
                contract.setServiceId(resultSet.getInt("service_id"));
                contractList.add(contract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractList;
    }

    @Override
    public Contract findById(String id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from contract where contract_id = ?");
            ResultSet resultSet = preparedStatement.executeQuery();
            Contract contract = null;
            while (resultSet.next()) {
                contract = new Contract();
                contract.setId(resultSet.getInt("contract_id"));
                contract.setStartDay(resultSet.getString("contract_start_date"));
                contract.setEndDay(resultSet.getString("contract_end_date"));
                contract.setDeposit(resultSet.getDouble("contract_deposit"));
                contract.setTotalMoney(resultSet.getDouble("contract_total_money"));
                contract.setEmployeeId(resultSet.getInt("employee_id"));
                contract.setCustomerId(resultSet.getInt("customer_id"));
                contract.setServiceId(resultSet.getInt("service_id"));
                break;
            }
            return contract;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(Contract contract) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into contract(contract_start_date,contract_end_date,contract_deposit," +
                            "contract_total_money,employee_id,customer_id,service_id) value(?,?,?,?,?,?,?)");

            preparedStatement.setString(1, contract.getStartDay());
            preparedStatement.setString(2, contract.getEndDay());
            preparedStatement.setDouble(3, contract.getDeposit());
            preparedStatement.setDouble(4, contract.getTotalMoney());
            preparedStatement.setInt(5, contract.getEmployeeId());
            preparedStatement.setInt(6, contract.getCustomerId());
            preparedStatement.setInt(7, contract.getServiceId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


