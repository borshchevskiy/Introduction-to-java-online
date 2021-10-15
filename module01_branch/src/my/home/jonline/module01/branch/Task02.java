package my.home.jonline.module01.branch;

/*
 * 
 * 2. Найти max{min(a, b), min(c, d)}.
 *
 */

public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double firstMin;
		double secondMin;
		double maximum;

		a = -3.56;
		b = 17;
		c = -100;
		d = 543;

		if (a < b) {
			firstMin = a;
		} else {
			firstMin = b;
		}

		secondMin = c < d ? c : d;

		maximum = Math.max(firstMin, secondMin);

		System.out.println(maximum);

	}

}
