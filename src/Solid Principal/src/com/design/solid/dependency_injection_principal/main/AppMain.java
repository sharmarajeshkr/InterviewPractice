package com.design.solid.dependency_injection_principal.main;

import com.design.solid.dependency_injection_principal.dao.CustomerDAO;
import com.design.solid.dependency_injection_principal.daoImpl.CustomerDaoImpl;
import com.design.solid.dependency_injection_principal.pojo.Customer;

public class AppMain {
    public static void main(String[] args) {
        CustomerDAO<Customer> customer = new CustomerDaoImpl();
        // customer.add()
        //customer.delete()

    }
}
