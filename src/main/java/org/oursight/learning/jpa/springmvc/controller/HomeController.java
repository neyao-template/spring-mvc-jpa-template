package org.oursight.learning.jpa.springmvc.controller;

import org.oursight.learning.jpa.bo.User;
import org.oursight.learning.jpa.dao.JpaUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by neyao@github.com on 2016/3/11.
 */
@Controller
public class HomeController {

    @Autowired
    private JpaUserDao userDao;

    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception {
        List<User> listUsers = userDao.list();
        ModelAndView model = new ModelAndView("UserList");
        model.addObject("userList", listUsers);
        return model;
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView newUser() {
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user", new User());
        return model;
    }

    @Transactional
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user) {
//        userDao.saveOrUpdate(user);
        userDao.save(user);
        return new ModelAndView("redirect:/");
    }
}
