package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких 
 * чисел несколько, то определить наименьшее из них.
 */

public class Task09 {

	public static void main(String[] args) {
		int[] array;
		Random random;
		int n;
		int mostCommonCount;
		int mostCommonValueIndex;
		int tempCount;

		random = new Random();
		n = random.nextInt(20) + 1;
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(3);
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));

		mostCommonValueIndex = 0;
		mostCommonCount = 0;
		tempCount = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] == array[i]) {
					tempCount++;
				}
			}
			if (tempCount > mostCommonCount) {
				mostCommonCount = tempCount;
				mostCommonValueIndex = i;
			} else if (tempCount == mostCommonCount) {
				if (array[i] < array[mostCommonValueIndex]) {
					mostCommonCount = tempCount;
					mostCommonValueIndex = i;
				}
			}
			tempCount = 0;
		}

		System.out.println("Наименьшее наиболее повторяющееся число: " + array[mostCommonValueIndex]
				+ ". Число повторений в массиве: " + mostCommonCount);

	}

}
