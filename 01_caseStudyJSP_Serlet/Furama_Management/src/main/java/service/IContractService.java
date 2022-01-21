package service;

import model.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();

    Contract findById(String id);

    void create(Contract contract);
}
