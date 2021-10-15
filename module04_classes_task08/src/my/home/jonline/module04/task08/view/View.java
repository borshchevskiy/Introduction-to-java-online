package my.home.jonline.module04.task08.view;

import java.util.List;

import my.home.jonline.module04.task08.entity.Customer;

public class View {

	public View() {

	}

	public void viewCustomer(Customer customer) {
		System.out.println(customer.getSecondName() + " " + customer.getFirstName() + " " + customer.getMiddleName());
	}

	public void viewCustomerList(List<Customer> customerList) {
		for (Customer customer : customerList) {
			viewCustomer(customer);
		}
		System.out.println();
	}

	public void viewMessage(String message) {
		System.out.println(message);
	}
}
