package responsitory.impl;

import model.Vehicle;
import responsitory.IVehicleResponsitory;

import java.util.ArrayList;
import java.util.List;

public class VehicleResponsitory implements IVehicleResponsitory {
    private static List<Vehicle> vehicleList = new ArrayList<>();

    static {
        vehicleList.add(new Vehicle(1, "Vinfast", 100.0, "09-09-2020", "VN"));
        vehicleList.add(new Vehicle(2, "Audi", 200.0, "19-09-2022", "AMERICA"));
        vehicleList.add(new Vehicle(3, "MAZDA", 100.0, "01-09-2021", "CHINA"));
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleList;
    }

    @Override
    public Vehicle findById(String id) {
        Integer temp = Integer.parseInt(id);
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(temp)) {
                return vehicle;
            }
        }
        return null;
    }


    @Override
    public void save(String id, String name, String price, String dateOfProduce, String description) {
        Integer temp = Integer.parseInt(id);
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(temp)) {
                vehicle.setName(name);
                vehicle.setPrice(Double.parseDouble(price));
                vehicle.setDateOfProduce(dateOfProduce);
                vehicle.setDescription(description);
            }
        }
    }

    @Override
    public void createVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public void deleteById(String id) {
        Integer temp = Integer.parseInt(id);
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(temp)) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    @Override
    public Vehicle findByName(String name) {
        List<Vehicle> vehicleList = findAll();
        for (Vehicle vehicle1 : vehicleList) {
            if (vehicle1.getName().equals(name)) {
                return vehicle1;
            }
        }
        return null;
    }


}
