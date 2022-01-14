package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private IUserRepository iUserRepository = new UserRepository();
    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public User findById(String id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void save(String id, String name, String email, String country) {
        iUserRepository.save(id,name,email,country);
    }

    @Override
    public void createUser(User user) {
        iUserRepository.createUser(user);
    }

    @Override
    public void deleteById(String id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return iUserRepository.findByCountry(country);
    }
}
