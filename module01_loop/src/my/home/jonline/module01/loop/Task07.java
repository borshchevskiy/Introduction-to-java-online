package my.home.jonline.module01.loop;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
 * m и n вводятся с клавиатуры.
 */

public class Task07 {

	public static void main(String[] args) {
		int m;
		int n;
		int start;
		int end;
		int step;
		boolean isInputOK;
		Scanner scanner;

		m = 0;
		n = 0;
		step = 1;
		isInputOK = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите целое положительное число >> ");

		while (!isInputOK) {
			String str;
			if (scanner.hasNextInt()) {
				m = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (m < 0) {
					System.out.println("Введено отрицательное число!");
					System.out.print("Введите целое положительное число >> ");
				} else {
					isInputOK = true; // if input is integer and positive, leave the cycle
				}
			} else {
				str = scanner.nextLine();// remove data from scanner
				System.out.println("Введено неверное число!");
				System.out.print("Введите целое положительное число >> ");
			}
		}

		isInputOK = false;
		System.out.print("Введите целое положительное число >> ");

		while (!isInputOK) {
			String str;
			if (scanner.hasNextInt()) {
				n = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (n < 0) {
					System.out.println("Введено отрицательное число!");
					System.out.print("Введите целое положительное число >> ");
				} else {
					isInputOK = true; // if input is integer and positive, leave the cycle
				}
			} else {
				str = scanner.nextLine();// remove data from scanner
				System.out.println("Введено неверное число!");
				System.out.print("Введите целое положительное число >> ");
			}
		}

		if (m > n) {
			step = -1;
		}

		System.out.println("Делители чисел:");

		for (int i = m; m < n ? i <= n : i >= n; i += step) {
			System.out.print(i + ": ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
