package my.home.jonline.module02.decomposition;
/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 * 
 */

import java.util.Random;

public class Task17 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = random.nextInt(1000000);

		return number;
	}

	public static int countSumOfDigits(int number) {
		int sum;

		sum = 0;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}

	public static void countStepsToZero() {
		int number;
		int steps;

		number = initNumber();
		steps = 0;

		System.out.println("Исходное число: " + number);

		while (number != 0) {
			number -= countSumOfDigits(number);
			steps++;
		}

		System.out.println("Количество шагов до 0: " + steps);

	}

	public static void main(String[] args) {
		countStepsToZero();

	}

}
