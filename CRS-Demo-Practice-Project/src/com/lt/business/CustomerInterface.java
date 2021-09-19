package com.lt.business;

import java.util.List;

import com.lt.bean.Customer;

public interface CustomerInterface {
	public String createCustomer();
	public boolean deleteCustomer(int customerId);
	public String listCustomer();
	public String updateCustomer(Customer customer);

}
