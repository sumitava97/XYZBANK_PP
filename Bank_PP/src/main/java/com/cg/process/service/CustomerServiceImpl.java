package com.cg.process.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.process.dao.CustomerDao;
import com.cg.process.model.Customer;
import com.cg.process.model.Transaction;

@Service("service")
public class CustomerServiceImpl implements CustomerService {

	@PersistenceContext
	   private EntityManager em;
	@Autowired
	private CustomerDao customerdao;

	@Override
	public List<Customer> findAll() {
		List<Customer> customerlist = customerdao.findAll();
		return customerlist;
	}

	@Override
	public void save(Customer customer) {
		customerdao.save(customer);
	}

	@Override
	public void delete(Customer customer) {
         customerdao.delete(customer);
	}

	@Override
	public Customer findById(Integer id) {
		Customer customer=customerdao.findById(id).get();
		return customer;
	}

	@Override
	public int findBalanceById(int id) {
		String qstr="select balance from Customer customer where id=:pid";
		TypedQuery<Integer> query = em.createQuery(qstr, Integer.class);
		query.setParameter("pid", id);
		int a = query.getSingleResult();
		return a;	}

	@Override
	public Customer getCustomerByIdAndPassword(int id, String name) {
		try {
		String qstr="Select customer from Customer customer where id=:pid and password=:ppassword";
		TypedQuery<Customer> query = em.createQuery(qstr, Customer.class);
		query.setParameter("pid", id);
		query.setParameter("ppassword",name);
		Customer customer=query.getSingleResult();
		
		return customer;}
		catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<Transaction> findByCustId(Integer id) {
		String str="SELECT transaction FROM Transaction transaction WHERE cust_id=:pid";
		TypedQuery<Transaction> query= em.createQuery(str, Transaction.class);
		query.setParameter("pid", id);
		List<Transaction> transactions=query.getResultList();
		return transactions;
	}




	
	

	

}
