package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */

public class Task02 {

	public static void main(String[] args) {
		double[] array;
		double z;
		int count;
		Random rand;

		array = new double[20];
		rand = new Random();
		z = rand.nextDouble() * 50;
		count = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble() * 100;
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("Число Z = " + z);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
				count++;
			}
		}

		System.out.println();
		System.out.println("Измененный массив: ");
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("Количество замен: " + count);
	}

}
