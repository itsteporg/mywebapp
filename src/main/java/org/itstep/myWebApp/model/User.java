package org.itstep.myWebApp.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@NamedQueries(@NamedQuery(name = User.GET_ALL, query = "SELECT u FROM User u"))
public class User extends BaseEntity {

    public static final String GET_ALL = "User.getAll";

    @Column(name = "lastname")
    private String lastname;

    @NotNull(message = "city can not be null")
    @Column(name = "city")
    private String city;

    @Email
    @Column(name = "email", unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Column(name = "password", nullable = false)
    @Length(min = 5)
    private String password;

    @Column(name = "enabled", nullable = false)
    private boolean enabled = true;

//    @OneToMany
//    private List<Mail> mails;

    public User() {
    }

    public User(String name, String lastname, String city, String email) {
        this.name = name;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
    }

    public User(Integer id, String name, String lastname, String city, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (lastname != null ? !lastname.equals(user.lastname) : user.lastname != null) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        return email != null ? email.equals(user.email) : user.email == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "User{" +
                "lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                "} " + super.toString();
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
