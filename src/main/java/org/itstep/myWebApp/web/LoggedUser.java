package org.itstep.myWebApp.web;

import org.itstep.myWebApp.model.Role;
import org.itstep.myWebApp.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

import java.util.Collection;
import java.util.Set;

public class LoggedUser implements UserDetails {

    private Set<Role> roles;
    private boolean isEnabled;
    private String password;
    private String username;
    private Integer id;

    public LoggedUser(User user) {
        this.roles = user.getRoles();
        this.isEnabled = user.isEnabled();
        this.password = getPassword();
        this.username= user.getName();
        this.id = user.getId();
    }

    public static LoggedUser get() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (LoggedUser) authentication.getPrincipal();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isEnabled;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isEnabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isEnabled;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public Integer getId() {
        return id;
    }
}
