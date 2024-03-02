package com.design.solid.liskov_substution_principal;

/*
*   1. No new exception can be thrown by subtype
*   2. Client Should not know which specific subtype they are calling
*   3.  New derive class just extends without replacing the functionlity of the old class
*
*   ex  The C: UserManager needs a S: UserService, not an APIUserService or DatabaseUserService.
        This is the Liskov Substitution Principle at work.
        We’re replacing a UserService with a subtype, such as APIUserService.
*
*
* */


class UserService {

    public void fetchUserFromAPI(String username, String password) {

    }


    public void  fetchUserFromDatabase(String username, String password) {

    }
}