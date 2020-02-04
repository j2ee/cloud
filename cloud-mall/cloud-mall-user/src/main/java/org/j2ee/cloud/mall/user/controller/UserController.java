package org.j2ee.cloud.mall.user.controller;

import org.j2ee.cloud.mall.user.model.User;
import org.j2ee.cloud.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return null;
    }

}
