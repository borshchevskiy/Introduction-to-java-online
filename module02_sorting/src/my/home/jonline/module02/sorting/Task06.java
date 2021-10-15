package my.home.jonline.module02.sorting;

import java.util.Random;

/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. 
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1, то продвигаются 
 * на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад. 
 * Составить алгоритм этой сортировки.
 * 
 */

public class Task06 {

	public static double[] initArray() {
		double[] array;
		Random random;

		random = new Random();
		array = new double[random.nextInt(10) + 10];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * 100;
		}

		System.out.println("Исходный массив:");
		System.out.print("[");
		for (double d : array) {
			System.out.print("  ");
			System.out.printf("%.2f", d);
		}
		System.out.print("]");
		System.out.println();
		return array;
	}

	public static void shellSort(double[] array) {
		for (int i = 0; i < array.length - 1;) {
			if (array[i] <= array[i + 1]) {
				i++;
			} else {
				double temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				if (i != 0) {
					i--;
				}

			}
		}
		System.out.println("Отсортированный массив:");
		System.out.print("[");
		for (double d : array) {
			System.out.print("  ");
			System.out.printf("%.2f", d);
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		shellSort(initArray());

	}

}
