package org.itstep.myWebApp.service;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserService {

    @Autowired
    private UserRepository repository;

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void delete(Integer id) {
        repository.delete(id);
    }

    public void save(User user) {
        repository.save(user);
    }

    public User getById(Integer id) {
        return repository.getById(id);
    }
}
