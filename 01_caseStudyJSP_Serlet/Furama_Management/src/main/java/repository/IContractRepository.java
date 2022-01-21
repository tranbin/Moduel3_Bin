package repository;

import model.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> findAll();

    Contract findById(String id);

    void create(Contract contract);
}
