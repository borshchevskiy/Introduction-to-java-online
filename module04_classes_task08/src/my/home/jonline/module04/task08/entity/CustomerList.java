package my.home.jonline.module04.task08.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	private List<Customer> customerList;

	public CustomerList() {
		customerList = new ArrayList<>();
	}

	public CustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customerList.remove(customer);
	}
	
	public List<Customer> getList() {
		return customerList;
	}

}
