package my.home.jonline.module05.task02.logic;

import my.home.jonline.module05.task02.entity.Payment;
import my.home.jonline.module05.task02.entity.Payment.Product;

public class PaymentAction {

	public int getTotalSum(Payment payment) {
		int sum = 0;
		
		for (Product product : payment.getProductList()) {
			sum += product.getPrice();
		}
		
		return sum;
	}
}
