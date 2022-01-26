package service.impl;

import controller.TComplexServlet;
import model.TComplex;
import repository.ITComplexRepository;
import repository.impl.TComplexRepository;
import service.ITComplexService;

import java.util.List;

public class TComplexService implements ITComplexService {
    private ITComplexRepository itComplexRepository = new TComplexRepository();

    @Override
    public List<TComplex> findAll() {
        return itComplexRepository.findAll();
    }

    @Override
    public TComplex findById(String id) {
        return itComplexRepository.findById(id);
    }

    @Override
    public void create(TComplex tComplex) {
        itComplexRepository.create(tComplex);
    }

    @Override
    public void deleteById(String id) {
        itComplexRepository.delete(id);
    }

    @Override
    public List<TComplex> search(String typeOfName, String price, String floor) {
        return itComplexRepository.search(typeOfName,price,floor);
    }
}
