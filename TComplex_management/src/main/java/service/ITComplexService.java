package service;

import controller.TComplexServlet;
import model.TComplex;

import java.util.List;

public interface ITComplexService {
    List<TComplex> findAll();

    TComplex findById(String id);

    void create(TComplex tComplex);

    void deleteById(String id);

    List<TComplex> search(String typeOfName, String price, String floor);
}
