package my.home.jonline.module02.sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * 4. Сортировка обменами. Дана последовательность чисел a1 >= a2 >= ... >= an. Требуется переставить числа в 
 * порядке возрастания. Для этого сравниваются два соседних числа. Если ai > ai+1, то делается 
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * 
 * 
 * 
 */
public class Task04 {

	public static void exchangeSort(int[] array) {
		int count;

		count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Отсортированный массив:");
		System.out.println(Arrays.toString(array));
		System.out.println();
		System.out.println("Количество перестановок: " + count);
	}

	public static int[] initArray() {
		int[] array;
		Random random;

		random = new Random();
		array = new int[random.nextInt(10) + 10];

		for (int i = array.length; i > 0; i--) {
			array[array.length - i] = i;
		}

		System.out.println("Исходный массив:");
		System.out.println(Arrays.toString(array));

		return array;
	}

	public static void main(String[] args) {

		exchangeSort(initArray());

	}

}
