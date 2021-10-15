package my.home.jonline.module01.loop;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует 
 * все числа от 1 до введенного пользователем числа.
 */

public class Task01 {

	public static void main(String[] args) {
		int input;
		int result;
		boolean isInputOK;
		Scanner scanner;

		input = 0;
		result = 0;
		isInputOK = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите целое положительное число >> ");

		while (!isInputOK) {
			String str;
			if (scanner.hasNextInt()) {
				input = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (input < 0) {
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

		for (int i = 1; i <= input; i++) {
			result += i;
		}

		System.out.println("Результат: " + result);

	}

}
