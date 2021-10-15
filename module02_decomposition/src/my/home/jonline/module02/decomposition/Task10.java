package my.home.jonline.module02.decomposition;

import java.util.Arrays;
import java.util.Random;

/*
 * 
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого 
 * являются цифры числа N.
 * 
 */

public class Task10 {

	public static int initNumber() {
		int number;
		Random random;

		random = new Random();
		number = random.nextInt(2147483647);

		return number;
	}

	public static int findArrayLength(int number) {
		int length;

		length = 0;

		while (number != 0) {
			number /= 10;
			length++;
		}

		return length;
	}

	public static void createArray() {
		int number;
		int length;
		int[] array;

		number = initNumber();
		length = findArrayLength(number);
		array = new int[length];

		System.out.println(number);

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = number % 10;
			number /= 10;
		}

		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		createArray();

	}

}
