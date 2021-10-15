package my.home.jonline.module04.task04.main;

import my.home.jonline.module04.task04.entity.Customer;
import my.home.jonline.module04.task04.logic.Logic;
import my.home.jonline.module04.task04.view.View;


/* Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		View view = new View();
		
		Customer customer = new Customer("John Doe");
		customer.addAccount(100);
		customer.addAccount(1000);
		customer.addAccount(-100);
		customer.addAccount(500);
		customer.addAccount(-200);
		
		view.viewAccounts(customer.getAccounts());
		
		
		logic.sortAccountsByBalance(customer.getAccounts());
		view.viewMessage("Sorted accounts:");		
		view.viewAccounts(customer.getAccounts());

		view.viewMessage("Accounts with balance less than 200.0:");
		view.viewAccounts(logic.findByBalanceLessThan(200, customer.getAccounts()));
				
		view.viewMessage("Total balance:");
		view.viewBalance(logic.getTotalBalance(customer.getAccounts()));
		
		view.viewMessage("Total positive balance:");
		view.viewBalance(logic.getTotalPositiveBalance(customer.getAccounts()));
		
		view.viewMessage("Total negative balance:");
		view.viewBalance(logic.getTotalNegativeBalance(customer.getAccounts()));
	}

}
