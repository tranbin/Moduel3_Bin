package repository;


import model.User;

import java.util.List;

public interface IUserRepository {

    List<User> findAll();

    User findById(String id);

    void save(String id, String name, String email, String country);

    void createUser(User user);

    void deleteById(String id);

    User findByCountry(String country);
}