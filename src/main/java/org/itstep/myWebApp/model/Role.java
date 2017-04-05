package org.itstep.myWebApp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 05.04.2017.
 */

@Entity//(name = "cf_roles")
@Table(name = "cf_roles")
public class Role extends BaseEntity {

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles", targetEntity = User.class)
    private Set<User> users = new HashSet<User>();
}
