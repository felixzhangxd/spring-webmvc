package com.mmall.spring.webmvc.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmall.spring.webmvc.dao.UserDao;

@Controller
@RequestMapping(value = { "/user" })
public class UserCtrl {
    @Resource
    private UserDao userDao;

    @ResponseBody
    @RequestMapping(value = { "/find/{id}" })
    public String find(@PathVariable Integer id) {
        return userDao.find(id);
    }
}
