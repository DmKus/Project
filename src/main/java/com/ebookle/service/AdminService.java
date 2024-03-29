package com.ebookle.service;

import com.ebookle.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 25.08.13
 * Time: 5:51
 * To change this template use File | Settings | File Templates.
 */
@org.springframework.stereotype.Service
public class AdminService {

    @Autowired
    private UserService userService;

    public boolean removeUser(Integer id) {
        return userService.delete(id);
    }

    public UserService getUserService () {
        return userService;
    }

    public void setUserService (UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsersHasRoleUser() {
        return userService.findAllByRole(UtilStrings.USER_ROLE_TEXT);
    }

}
