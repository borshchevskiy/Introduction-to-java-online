package my.home.jonline.module04.task08.comparator;

import java.util.Comparator;

import my.home.jonline.module04.task08.entity.Customer;

public class SecondNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer firstCustomer, Customer secondCustomer) {
		
		return firstCustomer.getSecondName().compareTo(secondCustomer.getSecondName());
	}

}
