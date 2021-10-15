package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Task03 {

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

	public static void main(String[] args) {
		double[] array;
		int n;
		int countNegative;
		int countPositive;
		int countZero;
		Random rand;

		rand = new Random();
		n = rand.nextInt(10) + 5;
		array = new double[n];

		countNegative = 0;
		countPositive = 0;
		countZero = 0;

		fillArray(array);

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));

		for (double d : array) {
			if (d == 0) {
				countZero++;
			} else if (d < 0) {
				countNegative++;
			} else {
				countPositive++;
			}

		}
		System.out.println();
		System.out.println("Количество нулевых элементов: " + countZero);
		System.out.println("Количество отрицательных элементов: " + countNegative);
		System.out.println("Количество положительных элементов: " + countPositive);
	}

}
