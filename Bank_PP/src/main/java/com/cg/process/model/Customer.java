package com.cg.process.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="banking")
public class Customer {

	@Id
	private int  id;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + ", password=" + password + "]";
	}
	private String name;
	private int balance;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private Set<Transaction> transaction = new HashSet<>();
	
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	public void addTransaction(Transaction transaction) {
		transaction.setCustomer(this);			//this will avoid nested cascade
		this.getTransaction().add(transaction);
	}
	
	
}
