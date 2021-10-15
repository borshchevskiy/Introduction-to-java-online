package my.home.jonline.module01.loop;

import java.util.Scanner;

/*
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x; x > 2
 * y = -x; x <= 2
 */

public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;
		boolean isStepCorrect;
		Scanner scanner;

		h = 0;
		isStepCorrect = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите начальное значение диапазона расчета функции >> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;
			str = scanner.nextLine();
			System.out.print("Введите число! >> ");
		}

		a = scanner.nextDouble();

		System.out.print("Введите конечное значение диапазона расчета функции >> ");

		while (!scanner.hasNextDouble()) { // check if valid value is entered
			String str;
			str = scanner.nextLine();
			System.out.print("Введите число! >> ");
		}

		b = scanner.nextDouble();

		if (a == b) {// if a == b no step is needed
			isStepCorrect = true;
		}

		while (!isStepCorrect) {
			System.out.print("Введите значение шага расчета функции >> ");
			String str;
			if (scanner.hasNextDouble()) {
				h = scanner.nextDouble();

				if (a > b && h > 0) { // step must be negative
					System.out.println("Неверное значение шага! Шаг должен быть < 0!");
					System.out.print("Введите значение шага расчета функции >> ");
					continue;
				}

				if (a < b && h < 0) { // step must be positive
					System.out.println("Неверное значение шага! Шаг должен быть > 0!");
					System.out.print("Введите значение шага расчета функции >> ");
					continue;
				}

				isStepCorrect = true;

			} else {
				str = scanner.nextLine();
				System.out.print("Введите число! >> ");
			}
		}

		if (a == b) {
			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}
			System.out.printf("x = %f; y = %f", a, y);
			System.out.println();
		} else {
			for (double x = a; a < b ? x <= b : x >= b; x = x + h) {
				if (x > 2) {
					y = x;
				} else {
					y = -x;
				}
				System.out.printf("x = %f; y = %f", x, y);
				System.out.println();
			}
		}
	}

}
