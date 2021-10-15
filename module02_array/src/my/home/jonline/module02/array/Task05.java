package my.home.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi >
 * 
 */
public class Task05 {

	public static void main(String[] args) {
		int[] array;
		int n;
		Random rand;

		rand = new Random();
		n = rand.nextInt(10) + 5;
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(n);
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.println("Элемент на позиции " + i + ": " + array[i]);
			}
		}

	}

}
