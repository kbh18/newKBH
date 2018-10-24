package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customerMap;
	
	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		
		addCustomer( new Customer("id001","alice","alice.hansung.ac.kr"));
		addCustomer( new Customer("id002","bob","bob.hansung.ac.kr"));
		addCustomer( new Customer("id003","john","john.hansung.ac.kr"));
		addCustomer( new Customer("id004","jully","jully.hansung.ac.kr"));
		addCustomer( new Customer("id005","sexy","sexy.hansung.ac.kr"));
	}
	private void addCustomer(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}
	public Customer findCustomer(String id) {
		if(id != null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
}
