package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
 */

public class Task11 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = random.nextInt(2147483647);

		return number;
	}

	public static int countDigits(int number) {
		int count;

		count = 0;

		while (number != 0) {
			number /= 10;
			count++;
		}

		return count;
	}

	public static void compareNumbers() {
		int firstNumber;
		int secondNumber;
		int firstNumberDigits;
		int secondNumberDigits;

		firstNumber = initNumber();
		secondNumber = initNumber();

		System.out.println("Первое число: " + firstNumber);
		System.out.println("Второе число: " + secondNumber);

		firstNumberDigits = countDigits(firstNumber);
		secondNumberDigits = countDigits(secondNumber);

		if (firstNumberDigits == secondNumberDigits) {
			System.out.println("В числах одинаковое количество цифр.");
		} else {
			System.out.println(
					"В" + (firstNumberDigits > secondNumberDigits ? " первом" : "о втором") + " числе больше цифр.");
		}

	}

	public static void main(String[] args) {
		compareNumbers();

	}

}
