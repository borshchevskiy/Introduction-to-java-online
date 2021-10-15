package my.home.jonline.module04.task04.entity;

public class Account implements Comparable<Account>{

	private static int idCounter;
	private int accountNumber;
	private double balance;
	boolean isBlocked;

	{
		isBlocked = false;
	}
	
	public Account() {
		accountNumber = idCounter++;
	}

	public Account(double balance) {
		this();
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBlocked ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", isBlocked=" + isBlocked + "]";
	}

	@Override
	public int compareTo(Account anotherAccount) {
		if (this.getBalance() > anotherAccount.getBalance()) {
			return 1;
		} else if (this.getBalance() < anotherAccount.getBalance()) {
			return -1;
		}
		return 0;
	}
	
	
}
