package my.home.jonline.module02.decomposition;

import java.util.Arrays;
import java.util.Random;

/*
 *  5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
 * которое меньше максимального элемента массива, но больше всех других элементов).
 * 
 */

public class Task05 {

	public static int findMax(int[] array) {
		int max;

		max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	public static void findSecondMax(int[] array) {
		int max;
		int secondMax;

		max = findMax(array);
		secondMax = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondMax && array[i] < max) {
				secondMax = array[i];
			}
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));
		System.out.println("Второй по величине элемент в массиве: " + secondMax);
	}

	public static int[] initArray() {
		int[] array;
		Random random;

		array = new int[20];
		random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}

		return array;
	}

	public static void main(String[] args) {
		findSecondMax(initArray());

	}

}
