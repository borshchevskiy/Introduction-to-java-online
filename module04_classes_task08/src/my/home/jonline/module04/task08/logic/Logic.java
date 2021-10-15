package my.home.jonline.module04.task08.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import my.home.jonline.module04.task08.comparator.SecondNameComparator;
import my.home.jonline.module04.task08.entity.Customer;

public class Logic {

	public List<Customer> findByCreditCardNumberRange(List<Customer> customerList, long rangeStart, long rangeEnd) {
		List<Customer> result;

		result = new ArrayList<>();

		if (rangeStart > rangeEnd) {
			long temp = rangeStart;
			rangeStart = rangeEnd;
			rangeEnd = temp;
		}

		for (Customer customer : customerList) {
			long creditCardNumber;

			creditCardNumber = customer.getCreditCardNumber();

			if (creditCardNumber >= rangeStart && creditCardNumber <= rangeEnd) {
				result.add(customer);
			}
		}

		return result;
	}
	
	
	public void sortBySecondName(List<Customer> customerList) {
		Comparator<Customer> secondNameComparator = new SecondNameComparator();
		
		Collections.sort(customerList, secondNameComparator);
	}
}
