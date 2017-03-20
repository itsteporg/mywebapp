package org.itstep.myWebApp.repository.jdbc;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcUserRepository implements UserRepository {

    private final BeanPropertyRowMapper<User> rowMapper = BeanPropertyRowMapper.newInstance(User.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query("SELECT * FROM users", rowMapper);
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }
}
