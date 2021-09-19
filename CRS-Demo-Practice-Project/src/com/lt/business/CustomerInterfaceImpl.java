package com.lt.business;

import org.apache.log4j.Logger;

import com.lt.bean.Customer;

public class CustomerInterfaceImpl implements CustomerInterface {

    private static Logger logger = Logger.getLogger(CustomerInterfaceImpl.class);

	Customer customers[] = new Customer[3];
	public String createCustomer() {
				logger.debug("<--- print Customer Details--->");
					
				// Adding First Customer
			       customers[0] = new Customer();
			       customers[0].setCustomerId(101);
			       customers[0].setCustomerName("Amita");
			       customers[0].setCustomerAddress("Delhi");
			       
			       
			    // Adding Second Customer 
			       customers[1] = new Customer();
			       customers[1].setCustomerId(102);
			       customers[1].setCustomerName("Anurag");
			       customers[1].setCustomerAddress("pune");
			       
			       
			    // Adding third Customer 
			       customers[2] = new Customer();
			       customers[2].setCustomerId(103);
			       customers[2].setCustomerName("Anish");
			       customers[2].setCustomerAddress("port Blair");
				
			 return "create Customer";
	}

	public boolean deleteCustomer(int customerId) {
		Customer []customerNew = new Customer[customers.length];
		int count = 0;
			for(int i=0,k=0;i<customers.length;i++){
				if(customers[i].getCustomerId()==customerId){
					continue;
				}
				customerNew[k++]=customers[i];
				count++;
			}
		System.arraycopy(customerNew, 0, customers,0,customers.length);
		return true;
	}

	public String listCustomer() {
		logger.debug("list customer Impl -->"+customers.length);
		 
	    try{
	   	for(Customer  cust : customers){
			
			if(cust!=null)
				logger.info("details of Customer--> " +cust.getCustomerId() + "" +cust.getCustomerName()+ "" +cust.getCustomerAddress());
		}
	    }catch(Exception ex){
	    	logger.error(ex.getMessage());
	    }
  return "print Customer List";
	}

	public String updateCustomer(Customer customer) {
		for(Customer cust:customers){
			if(customer.getCustomerId()==cust.getCustomerId()){
				cust.setCustomerId(customer.getCustomerId());
				
			}
		}
		return "updatedCustomer";
	}

}
