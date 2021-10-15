package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task01 {

	public static void main(String[] args) {
		int[] array;
		int k;
		int sum;
		Random rand;

		array = new int[10];
		rand = new Random();
		k = rand.nextInt(3) + 2;// adding 2 to exclude 0 and 1 from possible results
		sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum += array[i];
			}
		}

		System.out.println();
		System.out.println("Сумма всех элементов кратных " + k + ": " + sum);

	}

}
