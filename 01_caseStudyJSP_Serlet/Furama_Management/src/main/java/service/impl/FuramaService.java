package service.impl;

import model.ServiceFurama;
import repository.IServiceFuramaRepository;
import repository.impl.ServiceFuramaRepository;
import service.IServiceFurama;

import java.util.List;

public class FuramaService implements IServiceFurama {
    private IServiceFuramaRepository iServiceFuramaRepository = new ServiceFuramaRepository();


    @Override
    public List<ServiceFurama> findAll() {
        return iServiceFuramaRepository.findAll();
    }

    @Override
    public ServiceFurama findById(String id) {
        return iServiceFuramaRepository.findById(id);
    }

    @Override
    public void create(ServiceFurama serviceFurama) {
        iServiceFuramaRepository.create(serviceFurama);
    }
}
