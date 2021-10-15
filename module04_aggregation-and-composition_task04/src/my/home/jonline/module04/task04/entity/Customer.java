package my.home.jonline.module04.task04.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;	
	private List<Account> accounts;

	
	public Customer() {
		accounts = new ArrayList<>();
	}
	
	
	public Customer(String name) {
		this();
		this.name = name;
	}


	public Customer(String name, List<Account> accounts) {
		this.name = name;
		this.accounts = accounts;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(double balance) {
		accounts.add(new Account(balance));
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", accounts=" + accounts + "]";
	}
	
	
}
