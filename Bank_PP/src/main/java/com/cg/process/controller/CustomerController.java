package com.cg.process.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.process.model.Customer;
import com.cg.process.model.Transaction;
import com.cg.process.service.CustomerServiceImpl;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	int temp;
	Scanner sc=new Scanner(System.in);
	@Autowired
	private CustomerServiceImpl service;
	
	@PostMapping("/save")
	public ModelAndView save(@RequestParam String name,@RequestParam String password) {
		Customer customerlist = new Customer();
	    customerlist.setId(102);
		customerlist.setName(name);
		customerlist.setPassword(password);
		customerlist.setBalance(0);
		
		service.save(customerlist);
		System.out.println("ss");
		List<Customer> customerlist1 = service.findAll();
		//System.out.println(customerlist1);
		ModelAndView modelAndView = new ModelAndView("customerlist");
		modelAndView.addObject("CUSTOMERLIST", customerlist1);
		return modelAndView;
	}
	
	
	
	@PostMapping("/balance")
	public ModelAndView getbalancefromid() {
		int customer = service.findBalanceById(temp);
		ModelAndView modelAndView = new ModelAndView("showbalance");
		
		modelAndView.addObject("AA",customer);
		return modelAndView;
	}
	@PostMapping("/manager")
	public ModelAndView ManagerLogin(@RequestParam String name, @RequestParam String password) {
		ModelAndView modelAndView;
	   String a=name;
	   String b=password;
	
		if (a.equals("user") && b.equals("user123")) {
			modelAndView = new ModelAndView("addcustomer");
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("home22");
		}
		return modelAndView;
	}
	
	
	@PostMapping("checkuser")
	public ModelAndView requestLogin(@RequestParam int user, @RequestParam String password) {
		ModelAndView modelAndView;
		temp=user;
		Customer cust=service.getCustomerByIdAndPassword(user, password);
		if (cust==null) {
			modelAndView = new ModelAndView("noidfound");
		} else {
			modelAndView = new ModelAndView("home");
		}
		return modelAndView;
	}
	@PostMapping("/add")
	public ModelAndView addbalance(@RequestParam Integer money) {
		int trainee = service.findBalanceById(temp);
		Customer customer=service.findById(temp);
		int money1=trainee + money;
		Transaction transaction = new Transaction();
		transaction.setType("deposit");
		transaction.setAmount(money);
		customer.addTransaction(transaction);
		
		customer.setBalance(money1);
		service.save(customer);
		
		
		ModelAndView modelAndView = new ModelAndView("updatedbalance");
		
		modelAndView.addObject("AA",customer);
		return modelAndView;
	}
	@PostMapping("/withdraw")
	public ModelAndView withdrawbalance(@RequestParam Integer money) {
		int customermoney = service.findBalanceById(temp);
		Customer customer=service.findById(temp);
		if(customermoney-money<0) {
			ModelAndView modelAndView = new ModelAndView("accountinsfficient");
			return modelAndView;
		}
		else {
		int money1=customermoney - money;
	
		Transaction transaction = new Transaction();
		transaction.setType("withdraw");
		transaction.setAmount(money);
		customer.addTransaction(transaction);
		
		customer.setBalance(money1);
		service.save(customer);
		
		
		ModelAndView modelAndView = new ModelAndView("updatedbalance");
		
		modelAndView.addObject("AA",customer);
		return modelAndView;
		}
	}
	@PostMapping("/transfer")
	public ModelAndView FundTransfer(@RequestParam Integer id,@RequestParam Integer money) {
		
		int Senderbalance = service.findBalanceById(temp);
		int Receiverbalance = service.findBalanceById(id);
		int sendingmoney=money;
		Customer customer=service.findById(id);
		Customer customer1=service.findById(temp);
		
		if(Senderbalance-sendingmoney<0) {
			ModelAndView modelAndView = new ModelAndView("accountinsfficient");
			return modelAndView;
		}
		else {
		int money1=Receiverbalance + sendingmoney;
	    int money2=Senderbalance - sendingmoney;
		customer.setBalance(money1);
		customer1.setBalance(money2);
		Transaction transaction = new Transaction();
		transaction.setType("transfer");
		transaction.setAmount(money);
		customer.addTransaction(transaction);
		service.save(customer1);
		service.save(customer);
		
		
		ModelAndView modelAndView = new ModelAndView("transferdetail");
		
		modelAndView.addObject("AA",customer);
		modelAndView.addObject("BB",customer1);
		return modelAndView;
		}
		
	}
	@GetMapping("/transaction")
	public ModelAndView transaction() {
		List<Transaction> list= service.findByCustId(temp);
		ModelAndView modelAndView = new ModelAndView("receipt");
		modelAndView.addObject("PRINT",list);
		return modelAndView;
		
	}
	
	
}
