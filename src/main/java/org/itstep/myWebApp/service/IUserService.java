package org.itstep.myWebApp.service;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.util.ExceptionUtil;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * Created by kovalchuk on 06.04.2017.
 */
public interface IUserService {

    List<User> getAll();

    void delete(Integer id);

    User save(User user);

    void update(User user);

    User getById(Integer id);

    User getByName(String name);


    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
