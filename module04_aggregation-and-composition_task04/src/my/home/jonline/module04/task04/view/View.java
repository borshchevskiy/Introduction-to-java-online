package my.home.jonline.module04.task04.view;

import java.util.List;

import my.home.jonline.module04.task04.entity.Account;

public class View {

	public void viewMessage(String message) {
		System.out.println(message);
		System.out.println();
	}

	public void viewAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			System.out.println(account.getBalance());
		}
		System.out.println();
	}

	public void viewBalance(double balance) {
		System.out.println(balance);
		System.out.println();
	}
}
