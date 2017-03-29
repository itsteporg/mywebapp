package org.itstep.myWebApp.service;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by student on 28.03.2017.
 */
@ActiveProfiles(profiles = "Mock")
public class MockUserServiceTest extends UserServiceTest {

    @DirtiesContext
    @Override
    public void getAll() throws Exception {
        super.getAll();
    }

    @DirtiesContext
    @Override
    public void save() throws Exception {
        super.save();
    }

    @DirtiesContext
    @Override
    public void updateNotFound() throws Exception {
        super.updateNotFound();
    }

    @DirtiesContext
    @Override
    public void getById() throws Exception {
        super.getById();
    }
    @DirtiesContext
    @Override
    public void delete() throws Exception {
        super.delete();
    }

    @DirtiesContext
    @Override
    public void deleteNotFound() throws Exception {
        super.deleteNotFound();
    }
}
