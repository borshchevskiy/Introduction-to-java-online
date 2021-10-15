package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * 
 */
public class Task16 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = random.nextInt(9); // for digit capacity > 8 calculation is too long

		return number;
	}

	public static int countEvenNumbersInSum(long sum) {
		int count;

		count = 0;

		while (sum != 0) {
			if (sum % 2 == 0) {
				count++;
			}
			sum /= 10;
		}

		return count;
	}

	public static void oddDigitNumberSum() {
		int n;
		long sum;

		n = initNumber();
		sum = 0;

		System.out.println("Разрядность: " + n);

		for (int i = (int) Math.pow(10, n - 1); i <= (Math.pow(10, n) - 1); i++) {
			int number = i;
			boolean isOdd = true;

			for (int j = 1; j <= n; j++) {

				int digit = number % 10;

				if (digit % 2 == 0) {
					isOdd = false;
					break;
				}
				number /= 10;
			}

			if (isOdd) {
				sum += i;
			}
		}

		System.out.println("Сумма " + n + "-значных чисел, состоящих из нечетных цифр равна: " + sum);
		System.out.println("Количество четных цифр в сумме: " + countEvenNumbersInSum(sum));
	}

	public static void main(String[] args) {
		oddDigitNumberSum();

	}

}
