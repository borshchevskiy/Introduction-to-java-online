package my.home.jonline.module02.sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * 8.Даны дроби p1/q1, p2/q2,...,pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему 
 * знаменателю и упорядочивает их в порядке возрастания.
 * 
 */
public class Task08 {

	public static int[] initArray(String arrayName) {
		int[] array;
		Random random;

		random = new Random();
		array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + random.nextInt(10);
		}

		System.out.println(arrayName + ":");
		System.out.println(Arrays.toString(array));
		System.out.println();

		return array;
	}

	public static void sortFractions(int[] numenators, int[] denominators) {
		int commonDenominator;

		commonDenominator = findCommonDenominator(denominators);

		for (int i = 0; i < numenators.length; i++) {
			numenators[i] *= commonDenominator / denominators[i];
		}

		for (int i = 0; i < denominators.length; i++) {
			denominators[i] = commonDenominator;
		}

		Arrays.sort(numenators);

		System.out.println();
		System.out.println("Упорядоченные лроби: ");
		System.out.println(Arrays.toString(numenators));
		System.out.println(Arrays.toString(denominators));

	}

	public static int findCommonDenominator(int[] denominators) {
		int max;
		boolean isCommonDenominator;

		isCommonDenominator = false;
		max = denominators[0];

		for (int i = 1; i < denominators.length; i++) {
			if (denominators[i] > max) {
				max = denominators[i];
			}
		}

		while (!isCommonDenominator) {
			for (int i = 0; i < denominators.length; i++) {
				if (max % denominators[i] != 0) {
					max *= 2;
					continue;
				}
				isCommonDenominator = true;
			}
		}
		System.out.println("Общий знаменатель равен: " + max);
		return max;
	}

	public static void main(String[] args) {
		sortFractions(initArray("Числители"), initArray("Знаменатели"));

	}

}
