package repository.impl;

import model.Customer;
import model.ServiceFurama;
import repository.IServiceFuramaRepository;
import service.impl.FuramaService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceFuramaRepository implements IServiceFuramaRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<ServiceFurama> findAll() {
        List<ServiceFurama> serviceFuramas = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from service");
            ResultSet resultSet = preparedStatement.executeQuery();
            ServiceFurama serviceFurama;
            while (resultSet.next()){
                serviceFurama = new ServiceFurama();
                serviceFurama.setId(resultSet.getInt("service_id"));
                serviceFurama.setName(resultSet.getString("service_name"));
                serviceFurama.setArea(resultSet.getInt("service_id"));
                serviceFurama.setCost(resultSet.getDouble("service_cost"));
                serviceFurama.setMaxPeople(resultSet.getInt("service_max_people"));
                serviceFurama.setStandardRoom(resultSet.getString("standard_room"));
                serviceFurama.setDescription(resultSet.getString("description_other_convenience"));
                serviceFurama.setPoolArea(resultSet.getDouble("pool_area"));
                serviceFurama.setNumberFloor(resultSet.getInt("number_of_floors"));
                serviceFurama.setRentTypeId(resultSet.getInt("rent_type_id"));
                serviceFurama.setServiceTypeId(resultSet.getInt("service_type_id"));
                serviceFuramas.add(serviceFurama);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceFuramas;
    }

    @Override
    public ServiceFurama findById(String id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from service where service_id = ?");
            ResultSet resultSet = preparedStatement.executeQuery();
            ServiceFurama serviceFurama = null;
            while (resultSet.next()) {
                serviceFurama = new ServiceFurama();
                serviceFurama.setId(resultSet.getInt("service_id"));
                serviceFurama.setName(resultSet.getString("service_name"));
                serviceFurama.setArea(resultSet.getInt("service_id"));
                serviceFurama.setCost(resultSet.getDouble("service_cost"));
                serviceFurama.setMaxPeople(resultSet.getInt("service_max_people"));
                serviceFurama.setStandardRoom(resultSet.getString("standard_room"));
                serviceFurama.setDescription(resultSet.getString("description_other_convenience"));
                serviceFurama.setPoolArea(resultSet.getDouble("pool_area"));
                serviceFurama.setNumberFloor(resultSet.getInt("number_of_floors"));
                serviceFurama.setRentTypeId(resultSet.getInt("rent_type_id"));
                serviceFurama.setServiceTypeId(resultSet.getInt("service_type_id"));
                break;
            }
            return serviceFurama;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(ServiceFurama serviceFurama) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into service(service_name,service_area,service_cost," +
                            "service_max_people,standard_room,description_other_convenience,pool_area," +
                            "number_of_floors,rent_type_id,service_type_id) value(?,?,?,?,?,?,?,?,?,?)");

            preparedStatement.setString(1, serviceFurama.getName());
            preparedStatement.setInt(2, serviceFurama.getArea());
            preparedStatement.setDouble(3, serviceFurama.getCost());
            preparedStatement.setInt(4, serviceFurama.getMaxPeople());
            preparedStatement.setString(5, serviceFurama.getStandardRoom());
            preparedStatement.setString(6, serviceFurama.getDescription());
            preparedStatement.setDouble(7, serviceFurama.getPoolArea());
            preparedStatement.setInt(8,serviceFurama.getNumberFloor());
            preparedStatement.setInt(9,serviceFurama.getRentTypeId());
            preparedStatement.setInt(10,serviceFurama.getServiceTypeId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
