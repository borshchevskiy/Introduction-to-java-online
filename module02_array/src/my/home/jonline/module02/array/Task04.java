package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task04 {

	public static void fillArray(double[] array) {
		double z;
		Random rand;

		z = 0.0;
		rand = new Random();

		for (int i = 0; i < array.length; i++) {
			z = rand.nextDouble() * 100;
			if (z <= 33.0) {
				z = 0;
			}
			if (z >= 66.0) {
				z *= -1.0;
			}
			array[i] = z;
		}
	}

	public static double findMax(double[] array) {
		double max;

		max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	public static double findMin(double[] array) {
		double min;

		min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		double[] array;
		int n;
		double max;
		double min;
		Random rand;

		rand = new Random();
		n = rand.nextInt(10) + 5;
		array = new double[n];

		fillArray(array);

		max = findMax(array);
		min = findMin(array);

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("Максимальный элемент = " + max);
		System.out.println("Минимальный элемент = " + min);

	}

}
