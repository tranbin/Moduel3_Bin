package service.impl;

import model.ContractDetail;
import repository.IContractDetailRepository;
import repository.impl.ContractDetailRepository;
import service.IContractDetailService;

import java.util.List;

public class ContractDetailService implements IContractDetailService {
    private IContractDetailRepository iContractDetailRepository = new ContractDetailRepository();

    @Override
    public List<ContractDetail> findAll() {
        return iContractDetailRepository.findAll();
    }

    @Override
    public ContractDetail findById(String id) {
        return iContractDetailRepository.findById(id);
    }

    @Override
    public void create(ContractDetail contractDetail) {
        iContractDetailRepository.create(contractDetail);
    }
}
