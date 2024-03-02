package com.design.solid.liskov_substution_principal.newApproch.userService.impl;

import com.design.solid.liskov_substution_principal.newApproch.userService.UserService;

public class ApiUserService extends UserService {
    public void fetchUserFromAPI(String username, String password) {
        System.out.println("ApiUserService get Data from User API");
    }
}
