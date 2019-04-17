package com.cg.process.service;

import java.util.List;

import com.cg.process.model.Customer;
import com.cg.process.model.Transaction;

public interface CustomerService {

	public List<Customer> findAll();

	public void save(Customer customer);

	public void delete(Customer customer);

	public Customer findById(Integer id);
	public abstract int findBalanceById(int id);


	public abstract Customer getCustomerByIdAndPassword(int id, String name);
	
	public List<Transaction> findByCustId(Integer id);
}
