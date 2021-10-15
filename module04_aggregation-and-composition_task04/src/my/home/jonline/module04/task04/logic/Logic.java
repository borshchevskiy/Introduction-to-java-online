package my.home.jonline.module04.task04.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import my.home.jonline.module04.task04.entity.Account;

public class Logic {

	
	public void sortAccountsByBalance(List<Account> accounts) {
		Collections.sort(accounts);
	}

	
	public List<Account> findByBalanceMoreThan(double lowerLimit, List<Account> accounts) {
		List<Account> result;

		result = new ArrayList<>();

		for (Account account : accounts) {
			if (account.getBalance() >= lowerLimit) {
				result.add(account);
			}
		}
		
		return result;
	}

	
	public List<Account> findByBalanceLessThan(double upperLimit, List<Account> accounts) {
		List<Account> result;

		result = new ArrayList<>();

		for (Account account : accounts) {
			if (account.getBalance() <= upperLimit) {
				result.add(account);
			}
		}
		
		return result;
	}

	
	public double getTotalBalance(List<Account> accounts) {
		double total;

		total = 0;

		for (Account account : accounts) {
			total += account.getBalance();
		}

		return total;
	}

	public double getTotalPositiveBalance(List<Account> accounts) {
		double total;
		List<Account> positiveBalanceAccounts;

		total = 0;
		positiveBalanceAccounts = findPositiveBalanceAccounts(accounts);

		for (Account account : positiveBalanceAccounts) {
			total += account.getBalance();
		}

		return total;
	}

	public double getTotalNegativeBalance(List<Account> accounts) {
		double total;
		List<Account> negativeBalanceAccounts;

		total = 0;
		negativeBalanceAccounts = findNegativeBalanceAccounts(accounts);

		for (Account account : negativeBalanceAccounts) {
			total += account.getBalance();
		}

		return total;
	}

	public List<Account> findBlockedAcoounts(List<Account> accounts) {
		List<Account> blockedAccounts;
		blockedAccounts = new ArrayList<>();

		for (Account account : accounts) {
			if (account.isBlocked()) {
				blockedAccounts.add(account);
			}
		}

		return blockedAccounts;
	}

	public List<Account> findPositiveBalanceAccounts(List<Account> accounts) {
		List<Account> positiveBalanceAccounts;
		positiveBalanceAccounts = new ArrayList<>();
		for (Account account : accounts) {
			if (account.getBalance() > 0) {
				positiveBalanceAccounts.add(account);
			}
		}
		return positiveBalanceAccounts;
	}

	public List<Account> findNegativeBalanceAccounts(List<Account> accounts) {
		List<Account> negativeBalanceAccounts;
		negativeBalanceAccounts = new ArrayList<>();
		for (Account account : accounts) {
			if (account.getBalance() < 0) {
				negativeBalanceAccounts.add(account);
			}
		}
		return negativeBalanceAccounts;
	}
}
