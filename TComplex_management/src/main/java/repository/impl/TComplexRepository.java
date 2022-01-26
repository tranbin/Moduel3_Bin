package repository.impl;

import model.TComplex;
import repository.ITComplexRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TComplexRepository implements ITComplexRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<TComplex> findAll() {
        List<TComplex> tComplexList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select*from TComplex order by dien_tich");
            ResultSet resultSet = preparedStatement.executeQuery();
            TComplex tComplex;
            while (resultSet.next()) {
                tComplex = new TComplex();
                tComplex.setId(resultSet.getInt("ma_mat_bang"));
                tComplex.setArea(resultSet.getInt("dien_tich"));
                tComplex.setStatus(resultSet.getInt("trang_thai"));
                tComplex.setFloor(resultSet.getInt("tang"));
                tComplex.setTypeOfName(resultSet.getInt("loai_van_phong"));
                tComplex.setDescription(resultSet.getString("mo_ta"));
                tComplex.setPrice(resultSet.getInt("gia_cho_thue"));
                tComplex.setDateStart(resultSet.getString("ngay_bat_dau"));
                tComplex.setDateEnd(resultSet.getString("ngay_ket_thuc"));
                tComplexList.add(tComplex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tComplexList;
    }

    @Override
    public TComplex findById(String id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from TComplex where ma_mat_bang = ?");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            TComplex tComplex = null;
            while (resultSet.next()) {
                tComplex = new TComplex();
                tComplex.setId(resultSet.getInt("ma_mat_bang"));
                tComplex.setArea(resultSet.getInt("dien_tich"));
                tComplex.setStatus(resultSet.getInt("trang_thai"));
                tComplex.setFloor(resultSet.getInt("tang"));
                tComplex.setTypeOfName(resultSet.getInt("loai_van_phong"));
                tComplex.setDescription(resultSet.getString("mo_ta"));
                tComplex.setPrice(resultSet.getInt("gia_cho_thue"));
                tComplex.setDateStart(resultSet.getString("ngay_bat_dau"));
                tComplex.setDateEnd(resultSet.getString("ngay_ket_thuc"));
                break;
            }
            return tComplex;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(TComplex tComplex) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into TComplex(dien_tich,trang_thai,tang,loai_van_phong,mo_ta," +
                            "gia_cho_thue,ngay_bat_dau,ngay_ket_thuc) value(?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, tComplex.getArea());
            preparedStatement.setInt(2, tComplex.getStatus());
            preparedStatement.setInt(3, tComplex.getFloor());
            preparedStatement.setInt(4, tComplex.getTypeOfName());
            preparedStatement.setString(5, tComplex.getDescription());
            preparedStatement.setInt(6, tComplex.getPrice());
            preparedStatement.setString(7, tComplex.getDateStart());
            preparedStatement.setString(8, tComplex.getDateEnd());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from TComplex where ma_mat_bang = ?");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TComplex> search(String typeOfName, String price, String floor) {
        List<TComplex> tComplexList = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from TComplex where loai_van_phong = ? and gia_cho_thue = ? and tang = ? ");
            preparedStatement.setInt(1, Integer.parseInt(typeOfName));
            preparedStatement.setInt(2, Integer.parseInt(price));
            preparedStatement.setInt(3, Integer.parseInt(floor));
            ResultSet resultSet = preparedStatement.executeQuery();
            TComplex tComplex = new TComplex();
            while (resultSet.next()) {
                tComplex = new TComplex();
                tComplex.setId(resultSet.getInt("ma_mat_bang"));
                tComplex.setArea(resultSet.getInt("dien_tich"));
                tComplex.setStatus(resultSet.getInt("trang_thai"));
                tComplex.setFloor(resultSet.getInt("tang"));
                tComplex.setTypeOfName(resultSet.getInt("loai_van_phong"));
                tComplex.setDescription(resultSet.getString("mo_ta"));
                tComplex.setPrice(resultSet.getInt("gia_cho_thue"));
                tComplex.setDateStart(resultSet.getString("ngay_bat_dau"));
                tComplex.setDateEnd(resultSet.getString("ngay_ket_thuc"));
                tComplexList.add(tComplex);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tComplexList;
    }
}
