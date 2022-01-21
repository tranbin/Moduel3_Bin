package repository.impl;

import model.Contract;
import model.ContractDetail;
import repository.IContractDetailRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository implements IContractDetailRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<ContractDetail> findAll() {
        List<ContractDetail> contractDetails = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from contract_detail");
            ResultSet resultSet = preparedStatement.executeQuery();
            ContractDetail contractDetail;
            while (resultSet.next()) {
                contractDetail = new ContractDetail();
                contractDetail.setContractDetailId(resultSet.getInt("contract_detail_id"));
                contractDetail.setContractId(resultSet.getInt("quantity"));
                contractDetail.setAttachServiceId(resultSet.getInt("contract_id"));
                contractDetail.setQuantity(resultSet.getInt("attach_service_id"));
                contractDetails.add(contractDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractDetails;
    }

    @Override
    public ContractDetail findById(String id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from contract_detail where contract_detail_id = ?");
            ResultSet resultSet = preparedStatement.executeQuery();
            ContractDetail contractDetail = null;
            while (resultSet.next()) {
                contractDetail = new ContractDetail();
                contractDetail.setContractDetailId(resultSet.getInt("contract_detail_id"));
                contractDetail.setContractId(resultSet.getInt("quantity"));
                contractDetail.setAttachServiceId(resultSet.getInt("contract_id"));
                contractDetail.setQuantity(resultSet.getInt("attach_service_id"));
                break;
            }
            return contractDetail;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(ContractDetail contractDetail) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into contract_detail(quantity,contract_id,attach_service_id) value(?,?,?)");
            preparedStatement.setInt(1, contractDetail.getQuantity());
            preparedStatement.setInt(2, contractDetail.getContractId());
            preparedStatement.setInt(3, contractDetail.getAttachServiceId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

