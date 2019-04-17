package com.cg.process.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.process.model.Customer;

public interface TransactionDao extends JpaRepository<Customer, Integer> {







}
