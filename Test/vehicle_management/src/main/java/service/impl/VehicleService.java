package service.impl;

import model.Vehicle;
import responsitory.IVehicleResponsitory;
import responsitory.impl.VehicleResponsitory;
import service.IVehicleService;

import java.util.List;

public class VehicleService implements IVehicleService {
    private IVehicleResponsitory iVehicleResponsitory = new VehicleResponsitory();

    @Override
    public List<Vehicle> findAll() {
        return iVehicleResponsitory.findAll();
    }

    @Override
    public Vehicle findById(String id) {
        return iVehicleResponsitory.findById(id);
    }

    @Override
    public void save(String id, String name, String price, String dateOfProduce, String description) {
        iVehicleResponsitory.save(id, name, price, dateOfProduce, description);
    }

    @Override
    public boolean createProduct(Vehicle vehicle) {
        Vehicle vehicle1 = findById(vehicle.getId().toString());
        if (vehicle1 != null) {
            return false;
        } else {
            iVehicleResponsitory.createVehicle(vehicle);
            return true;
        }

    }

    @Override
    public void deleteById(String id) {
        iVehicleResponsitory.deleteById(id);
    }

    @Override
    public Vehicle findByName(String name) {
        return iVehicleResponsitory.findByName(name);
    }
}
