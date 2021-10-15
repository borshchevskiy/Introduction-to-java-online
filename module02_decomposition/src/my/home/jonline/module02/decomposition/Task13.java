package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для 
 * решения задачи использовать декомпозицию.
 */
public class Task13 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = 2 + random.nextInt(100);

		return number;
	}

	public static void findTwinNumbers() {
		int n;

		n = initNumber();

		System.out.println("Числа-близнецы из отрезка [" + n + "," + 2 * n + "]:");

		for (int i = n; i <= 2 * n - 2; i++) {
			System.out.println(i + " и " + (i + 2));
		}
	}

	public static void main(String[] args) {
		findTwinNumbers();

	}

}
