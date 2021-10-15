package my.home.jonline.module01.linear;

import java.util.Scanner;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x * y)
 */

public class Task03 {

	/*
	 * As this task is from linear section, methods and branching are not used for
	 * purpose and some code is repeated
	 */

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите значение угла х (в радианах)");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		x = scanner.nextDouble();

		System.out.println("Введите значение угла y (в радианах)");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		y = scanner.nextDouble();

		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("Значение выражения =" + result);
	}

}
