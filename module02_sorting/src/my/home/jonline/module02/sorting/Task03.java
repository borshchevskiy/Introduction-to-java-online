package my.home.jonline.module02.sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший 
 * элемент и ставится на первое место, а первый - на место наибольшего. 
 * Затем, начиная со второго, эта процедура повторяется. 
 * Написать алгоритм сортировки выбором.
 * 
 */

public class Task03 {

	public static int[] initArray() {
		int[] array;
		Random random;

		array = new int[20];
		random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50);
		}

		System.out.println("Исходный массив:");
		System.out.println(Arrays.toString(array));

		return array;
	}

	public static void selectionSort(int[] array) {
		int max;

		for (int i = 0; i < array.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[max]) {
					max = j;
				}
			}
			int temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
		System.out.println();
		System.out.println("Отсортированный массив:");
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		selectionSort(initArray());

	}

}
