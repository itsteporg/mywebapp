package org.itstep.myWebApp.service;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

/**
 * Created by student on 28.03.2017.
 */
@ActiveProfiles(profiles = "Jpa")
@Sql(scripts = "classpath:db/initDB.sql")
public class JpaUserServiceTest extends UserServiceTest {
}