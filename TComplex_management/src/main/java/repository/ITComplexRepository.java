package repository;

import controller.TComplexServlet;
import model.TComplex;

import java.util.List;

public interface ITComplexRepository {
    List<TComplex> findAll();

    TComplex findById(String id);

    void create(TComplex tComplex);

    void delete(String id);

    List<TComplex> search(String typeOfName, String price, String floor);
}
