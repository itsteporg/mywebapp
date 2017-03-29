package org.itstep.myWebApp.repository.datajpa;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by student on 27.03.2017.
 */
@Repository
@Transactional
public class DataJpaRepository implements UserRepository {

    @Autowired
    ProxyRepository repo;

    @Override
    public List getAll() {
        return repo.findAll();
    }

    @Override
    public boolean delete(Integer id) {
            return repo.deleteById(id) > 0 ? true : false;
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    public User getById(Integer id) {
        return repo.findOne(id);
    }
}
