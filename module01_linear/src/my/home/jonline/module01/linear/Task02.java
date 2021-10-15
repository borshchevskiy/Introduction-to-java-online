package my.home.jonline.module01.linear;

import java.util.Scanner;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 * ((b + ((b ^ 2) + 4 * a * c ) ^ 0,5) / (2 * a)) - (a ^ 3) * c + (b ^ -2)
 * 
 */

public class Task02 {

	/*
	 * As this task is from linear section, methods and branching are not used for
	 * purpose and some code is repeated
	 */

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите значение переменной a");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		a = scanner.nextDouble();

		System.out.println("Введите значение переменной b");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		b = scanner.nextDouble();

		System.out.println("Введите значение переменной c");
		System.out.print(">> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;

			str = scanner.nextLine();

			System.out.println("Введите число!");
			System.out.print(">> ");
		}

		c = scanner.nextDouble();

		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) + Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Значение выражения =" + result);

	}

}
