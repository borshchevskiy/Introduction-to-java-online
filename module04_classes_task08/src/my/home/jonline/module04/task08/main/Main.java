package my.home.jonline.module04.task08.main;

/* ѕростейшие классы и объекты.
 * 8. —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- методы 
и метод toString(). —оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами 
и методами. «адать критерии выбора данных и вывести эти данные на консоль. 
 ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета. 
Ќайти и вывести: 
a) список покупателей в алфавитном пор€дке; 
b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале
 */


import my.home.jonline.module04.task08.entity.Customer;
import my.home.jonline.module04.task08.entity.CustomerList;
import my.home.jonline.module04.task08.logic.Logic;
import my.home.jonline.module04.task08.view.View;

public class Main {

	public static void main(String[] args) {

		CustomerList vipCustomerList = new CustomerList();
		Logic logic = new Logic();
		View view = new View();
		
		vipCustomerList.addCustomer(new Customer("Bill", "Gates", "", "USA, Washington, Medina", 1234, 5678));
		vipCustomerList.addCustomer(new Customer("Elon", "Musk", "", "USA, Texas", 2134, 6578));
		vipCustomerList.addCustomer(new Customer("Pavel", "Durov", "Valerievich", "Dubai", 4321, 8765));
		vipCustomerList.addCustomer(new Customer("Jeff", "Bezos", "", "USA, Washington, Medina", 3412, 7856));
		vipCustomerList.addCustomer(new Customer("Mark", "Zukerberg", "", "USA, California, Palo Alto", 3421, 7865));
		
		view.viewCustomerList(vipCustomerList.getList());
		
		
		
		logic.sortBySecondName(vipCustomerList.getList());
		
		view.viewCustomerList(vipCustomerList.getList());
		
		
		
		CustomerList specialCustomers;		
				
		specialCustomers = new CustomerList(logic.findByCreditCardNumberRange(vipCustomerList.getList(), 1000, 3000));
		
		view.viewCustomerList(specialCustomers.getList());
	}
}
