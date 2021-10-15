package my.home.jonline.module02.decomposition;
/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
 * являются числа, сумма цифр которых равна К и которые не большее N.
 * 
 */

import java.util.Arrays;
import java.util.Random;

public class Task12 {

	public static int initNumber(int limit) {
		int number;
		Random random;

		random = new Random();
		number = random.nextInt(limit);

		return number;
	}

	public static int countNumbers(int k, int n) {
		// Counts quantity of numbers which satisfy the condition.
		// This is required for array initialization.
		int count;
		int sum;

		count = 0;
		sum = 0;

		for (int i = 1; i <= n; i++) {
			int number = i;
			while (number != 0) {
				sum += number % 10;
				number /= 10;
			}
			if (sum == k) {
				count++;
			}
			sum = 0;
		}
		return count;
	}

	public static void createArray() {
		int k;
		int n;
		int index;
		int[] a;

		k = initNumber(20);
		n = initNumber(1000);
		index = 0;

		System.out.println("Число k = " + k);
		System.out.println("Число n = " + n);

		a = new int[countNumbers(k, n)];

		for (int i = 0; i < a.length; i++) {
			for (int j = index + 1; j <= n; j++) {
				int sum = 0;
				int number = j;
				while (number != 0) {
					sum += number % 10;
					number /= 10;
				}
				if (sum == k) {
					a[i] = j;
					index = j;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("Массив чисел, сумма цифр которых = k, и которые не больше n:");
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		createArray();

	}

}
