package com.app.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringExample.Customer;

@RestController
public class Controller {
	List<Customer> customers = new ArrayList<>();
	
	@RequestMapping("/")
	public String test() {
		return "hello";
	}
	@RequestMapping("/customer")
	public Customer getCustomer(@RequestParam(value="id",defaultValue="1") int id) {
		for(Customer c:customers) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers(){
		customers.add(new Customer(1,"p"));
		customers.add(new Customer(2,"p"));
		customers.add(new Customer(3,"p"));
		return customers;
	}
}
