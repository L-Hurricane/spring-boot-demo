package com.example.demo.controller.dao;

import com.example.demo.controller.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 李明源
 */
@Service("user_dao")
public class UserDao {

    private final List<User> users = new ArrayList<>();

    private final List<String> cookies = new ArrayList<>();

    @PostConstruct
    public void init() {
        User user1 = new User("user1", "aaaaa");
        User user2 = new User("user2", "bbbbb");
        users.add(user1);
        users.add(user2);
    }

    public String login(String name, String password) {
        boolean isLogin = users.stream()
                .filter(user -> Objects.equals(user.getName(), name))
                .anyMatch(user -> Objects.equals(user.getPassword(), password));
        if (isLogin) {
            String cookie = String.valueOf(System.currentTimeMillis());
            cookies.add(cookie);
            return cookie;
        } else {
            return "error";
        }
    }

    public boolean isLogin(String cookie) {
        return cookies.contains(cookie);
    }
}
