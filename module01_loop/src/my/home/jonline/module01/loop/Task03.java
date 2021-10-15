package my.home.jonline.module01.loop;

import java.util.Iterator;

/*
 * 3. Найти сумму квадратов первых ста чисел.
 */

public class Task03 {

	public static void main(String[] args) {
		long result;

		result = 0;

		for (long i = 1; i <= 100; i++) {
			result += i * i;
		}

		System.out.println(result);

	}

}
