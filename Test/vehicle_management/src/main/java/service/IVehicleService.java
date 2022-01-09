package service;

import model.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> findAll();

    Vehicle findById(String id);

    void save(String id, String name, String price, String dateOfProduce, String description);

    boolean createProduct(Vehicle vehicle);

    void deleteById(String id);

    Vehicle findByName(String name);
}
