package service;

import model.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAll();

    ContractDetail findById(String id);

    void create(ContractDetail contractDetail);
}
