package my.home.jonline.module01.linear;

//1. Найдите значение функции: z = ( (a - 3 ) * b / 2) + c.

import java.util.Scanner;

public class Task01 {

	/*
	 * As this task is from linear section, methods and branching are not used for
	 * purpose and some code is repeated
	 */

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

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

		z = ((a - 3) * b / 2) * c;

		System.out.println("Значение функции (a - 3) * b / 2) * c = " + z);

	}

}
