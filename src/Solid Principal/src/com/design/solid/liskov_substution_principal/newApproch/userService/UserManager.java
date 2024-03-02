package com.design.solid.liskov_substution_principal.newApproch.userService;

public class UserManager {
    public UserService userService;

    public UserManager(UserService us){
        this.userService = us;
    }

    public void fetchUser(String username,String password){
        userService.fetchUserFromAPI(username,password);
    }
}
