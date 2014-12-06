package com.mmall.spring.webmvc.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mmall.spring.webmvc.dao.UserDao;

@Controller
@RequestMapping(value = { "/login" })
public class LoginCtrl {
    @Resource
    private UserDao userDao;

    @ResponseBody
    @RequestMapping(value = { "/{id}" })
    public String login(HttpSession session, @PathVariable Integer id) {
        String name = this.userDao.find(id);
        if (StringUtils.isEmpty(name)) {
            return "login fail";
        }
        session.setAttribute("id", id);
        return "login success";
    }
}
