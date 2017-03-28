package org.itstep.myWebApp.repository.datajpa;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaUserRepository implements UserRepository {

    @Autowired
    private MyUserRepository repository;

    @Override
    public List getAll() {
        return repository.findAll();
    }

    @Override
    public boolean delete(Integer id) {
        return repository.deleteById(id) != 0;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public User getById(Integer id) {
        return repository.findOne(id);
    }
}
