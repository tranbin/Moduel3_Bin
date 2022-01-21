package repository;

import model.ContractDetail;

import java.util.List;

public interface IContractDetailRepository {
    List<ContractDetail> findAll();

    ContractDetail findById(String id);

    void create(ContractDetail contractDetail);
}
