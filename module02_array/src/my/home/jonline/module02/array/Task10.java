package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй 
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 * 
 */

public class Task10 {

	public static void main(String[] args) {
		int[] array;
		Random random;
		int n;

		random = new Random();
		n = random.nextInt(10) + 10;
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));

		for (int i = 1; i < array.length; i += 2) {
			array[i] = 0;
		}

		System.out.println("Измененный массив:");
		System.out.println(Arrays.toString(array));

	}

}
