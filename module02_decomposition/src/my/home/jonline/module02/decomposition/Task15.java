package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую 
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 * 
 */
public class Task15 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = 2 + random.nextInt(8);

		return number;
	}

	public static void findSequencedNumbers() {
		int n;

		n = initNumber();

		System.out.println("Разрядность числа: " + n);
		System.out.println("n-значные числа с возрастающей последовательностью цифр:");

		for (int i = (int) Math.pow(10, n - 1); i <= (Math.pow(10, n) - 1); i++) {
			int count = 0;
			int number = i;

			int lastDigit;
			int prevDigit;

			for (int j = 1; j <= n - 1; j++) {
				lastDigit = number % 10;
				prevDigit = (number / 10) % 10;
				if (lastDigit - prevDigit == 1) {
					number /= 10;
					count++;
				} else {
					break;
				}
			}
			if (count == n - 1) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		findSequencedNumbers();

	}

}
