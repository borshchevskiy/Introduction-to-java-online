package my.home.jonline.module01.branch;

/*
 * 
 * 5. Вычислить значение функции: 
 * F(x) = (x ^ 2) - 3 * x + 9; при x <= 3; 
 * F(x) = 1 / ((x ^ 3) + 6); при x > 3.
 *
 */

public class Task05 {

	public static void main(String[] args) {
		double f;
		double x;

		x = Math.random() * 6;

		if (x <= 3) {
			f = x * x - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("x = " + x);
		System.out.println("F(x) = " + f);

	}

}
