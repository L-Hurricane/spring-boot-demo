package com.example.demo.controller.controller;

import com.example.demo.controller.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 李明源
 */
@Controller
public class LoginController {

    @Resource(name = "user_dao")
    private final UserDao userDao;

    public LoginController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        return userDao.login(username, password);
    }
}
