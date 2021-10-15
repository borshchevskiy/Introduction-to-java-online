package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 8. Дана последовательность целых чисел a1, a2, ... an. 
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ... an)
 */
public class Task08 {

	public static void main(String[] args) {
		int[] array;
		int[] arrayModified;
		Random random;
		int min;
		int countMin;
		int shift;

		random = new Random();
		array = new int[10];
		countMin = 0;
		shift = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(3);
		}
		System.out.println("Исходный массив:");
		System.out.println(Arrays.toString(array));

		min = array[0];

		// search the minimum value
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Минимальное значение = " + min);

		// count number of minimum values in array
		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				countMin++;
			}
		}
		System.out.println("Количество минимальных значений = " + countMin);

		arrayModified = new int[array.length - countMin];

		for (int i = 0; i < array.length; i++) {

			if (array[i] != min) {
				arrayModified[i - shift] = array[i];
			} else {
				shift++;
			}
		}

		System.out.println("Модифицированный массив:");
		System.out.println(Arrays.toString(arrayModified));

	}

}
