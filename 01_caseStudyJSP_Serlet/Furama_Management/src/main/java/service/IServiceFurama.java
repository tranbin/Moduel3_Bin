package service;


import model.ServiceFurama;


import java.util.List;

public interface IServiceFurama {


    List<ServiceFurama> findAll();

    ServiceFurama findById(String id);

    void create(ServiceFurama serviceFurama);
}
