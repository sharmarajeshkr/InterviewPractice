package com.design.solid.liskov_substution_principal.newApproch.userService;

import com.design.solid.liskov_substution_principal.newApproch.userService.impl.DatabaseUserService;

public class App {
    public static void main(String[] args) {
        DatabaseUserService dataService = new DatabaseUserService();
        UserManager um = new UserManager(dataService);
        um.fetchUser("username","password");

    }
}
