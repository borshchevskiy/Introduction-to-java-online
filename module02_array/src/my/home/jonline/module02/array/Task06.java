package my.home.jonline.module02.array;

import java.util.Random;

/*
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых 
 *  являются простыми числами.
 */
public class Task06 {

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
		double sum;
		boolean simpleNumber;
		Random rand;

		rand = new Random();
		n = rand.nextInt(100);
		array = new double[n];
		sum = 0.0;

		fillArray(array);

		for (int i = 2; i < array.length; i++) {
			simpleNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					simpleNumber = false;
					break;
				}
			}
			if (simpleNumber) {
				System.out.println("Простой индекс: " + i + "; Значение: " + array[i]);
				sum += array[i];
			}

		}
		System.out.println("Сумма элементов с простыми индексами = " + sum);

	}

}
