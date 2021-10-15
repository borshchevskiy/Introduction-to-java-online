package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи 
*  использовать декомпозицию.
 */
public class Task14 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = random.nextInt(1000000);

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

	public static void findArmstrongNumbers() {
		int k;
		int n;

		k = initNumber();

		System.out.println("Числа Армстронга на отрезке от 1 до " + k + ": ");
		for (int i = 1; i <= k; i++) {

			int number = i;
			int sum = 0;
			n = countDigits(i);

			while (number != 0) {
				sum += Math.pow(number % 10, n);
				number /= 10;
			}

			if (sum == i) {
				System.out.println(sum);
			}
		}

	}

	public static void main(String[] args) {
		findArmstrongNumbers();

	}

}
