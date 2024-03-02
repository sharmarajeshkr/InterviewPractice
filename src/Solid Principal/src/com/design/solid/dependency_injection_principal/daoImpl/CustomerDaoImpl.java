package com.design.solid.dependency_injection_principal.daoImpl;

import com.design.solid.dependency_injection_principal.dao.CustomerDAO;
import com.design.solid.dependency_injection_principal.pojo.Customer;

public class CustomerDaoImpl implements CustomerDAO<Customer> {
    @Override
    public Customer getById(int id) throws Exception {
        return null;
    }

    @Override
    public boolean add(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Customer customer) throws Exception {
        return false;
    }
}
