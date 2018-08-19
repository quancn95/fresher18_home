package com.fre18.qnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fre18.qnt.dao.CustomerDao;
import com.fre18.qnt.entity.Customer; 

@Service
@Transactional
@ComponentScan({ "com.fre18.qnt.dao" })
public class CustomerService {
  @Autowired
  private CustomerDao customerDAO;
  public List<Customer> findAll() {
    return customerDAO.findAll();
  }
  public Customer findById(final int id) {
    return customerDAO.findById(id);
  }
  public void save(final Customer customer) {
    customerDAO.save(customer);
  }
  public void update(final Customer customer) {
    customerDAO.update(customer);
  }
  public void delete(final int id) {
    Customer customer = customerDAO.findById(id);
    if (customer != null) {
      customerDAO.delete(customer);
    }
  }
}
