package com.lt.client;

import java.util.Scanner;

import com.lt.bean.Customer;
import com.lt.business.CustomerInterface;
import com.lt.business.CustomerInterfaceImpl;

public class CustomerApp {

	public static void main(String[] args) {
		/*//we can design the menu of CRS application
		//Example student menu,professor menu,admin menu
		 
		CustomerInterface customerImpl = new CustomerInterfaceImpl();
		System.out.println("Creating Customer");
		customerImpl.createCustomer();
		System.out.println(customerImpl.listCustomer());
		System.out.println("Removing Customer");
		customerImpl.deleteCustomer(101);
		System.out.println("List of Customers After Removing customer whose id 101");
		System.out.println(customerImpl.listCustomer());
		System.out.println("Customer Updation");
		Customer cust = new Customer();
		System.out.println("Please Enter Customer Id whoch you want to update");
		Scanner in = new Scanner(System.in);
		int custid = in.nextInt();
		cust.setCustomerId(custid);*/
		CustomerInterface customerImpl = new CustomerInterfaceImpl();
		customerImpl.createCustomer();
		System.out.println(customerImpl.listCustomer());
		/*System.out.println(String.format("%-15s %-15s %-15s",
				"78887", "ijiuh", "A"));*/
		
	}

}
