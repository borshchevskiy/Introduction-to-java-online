package my.home.jonline.module05.task02.main;

import my.home.jonline.module05.task02.entity.Payment;
import my.home.jonline.module05.task02.logic.PaymentAction;
import my.home.jonline.module05.task02.view.View;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();		
		PaymentAction paymentAction = new PaymentAction();
		View view = new View();
		
		Payment.Product firstProduct = new Payment.Product("some product", 100);
		Payment.Product secondProduct = new Payment.Product("another product", 200);
		
		payment.addProduct(firstProduct);
		payment.addProduct(secondProduct);
		
		int totalSum;
		totalSum = paymentAction.getTotalSum(payment);

		view.viewMessage("Total sum:");
		view.viewValue(totalSum);
	}

}
