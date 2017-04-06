package org.itstep.myWebApp.web.ui;

import org.itstep.myWebApp.web.LoggedUser;
import org.itstep.myWebApp.service.MailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class MailController {

    private MailService service;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAll() {
        return new ModelAndView("userList", "userList", service.getAll(LoggedUser.get().getId()));
    }

}
