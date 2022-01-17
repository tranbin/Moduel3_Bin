package repository;

import model.ServiceFurama;
import service.impl.FuramaService;

import java.util.List;

public interface IServiceFuramaRepository {
    List<ServiceFurama> findAll();

    ServiceFurama findById(String id);

    void create(ServiceFurama serviceFurama);
}
