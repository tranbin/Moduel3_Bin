package responsitory;

import model.Vehicle;

import java.util.List;

public interface IVehicleResponsitory {
    List<Vehicle> findAll();

    Vehicle findById(String id);


    void save(String id, String name, String price, String dateOfProduce, String description);

    void createVehicle(Vehicle vehicle);

    void deleteById(String id);

    Vehicle findByName(String name);
}
