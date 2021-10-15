package my.home.jonline.module02.sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в 
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя 
 * дополнительный массив.
 * 
 */
public class Task01 {

	public static void mergeArrays(int[] firstArray, int[] secondArray, int k) {
		int[] resultArray;

		resultArray = new int[firstArray.length + secondArray.length];

		System.out.println("Добавляем второй массив в первый между k и k + 1 индексами:");
		for (int i = 0; i <= k; i++) {
			resultArray[i] = firstArray[i];
		}
		for (int i = 0; i < secondArray.length; i++) {
			resultArray[k + 1 + i] = secondArray[i];
		}
		for (int i = k + 1; i < firstArray.length; i++) {
			resultArray[secondArray.length + i] = firstArray[i];
		}

		System.out.println(Arrays.toString(resultArray));
	}

	public static int[] initArray(int shift, int number) {
		int[] array;

		array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + shift;
		}

		System.out.println(number + " массив:");
		System.out.println(Arrays.toString(array));
		System.out.println();

		return array;
	}

	public static int initIndex() {
		Random random;
		int k;

		random = new Random();
		k = random.nextInt(9);

		System.out.println("Индекс k: " + k);
		System.out.println();

		return k;
	}

	public static void main(String[] args) {

		mergeArrays(initArray(0, 1), initArray(10, 2), initIndex());

	}

}
