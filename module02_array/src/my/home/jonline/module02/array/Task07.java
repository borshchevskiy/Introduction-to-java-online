package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 7. Даны действительные числа a1, a2, ... a2n. Найти max(a1 + a2n, a2 + a2n-1, ... , an + an+1)
 */

public class Task07 {

	public static void main(String[] args) {
		double[] array;
		int n;
		double max;
		Random rand;

		rand = new Random();
		n = rand.nextInt(20) * 2;
		array = new double[n];
		max = 0.0;

		array = new double[] { 1, 2, 13, 8, 7, 6, -1, 0 };

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));

		max = array[0] + array[array.length - 1];
		for (int i = 1; i < array.length / 2; i++) {
			double temp = array[i] + array[array.length - 1 - i];
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println("Максимальное значение: " + max);

	}

}
