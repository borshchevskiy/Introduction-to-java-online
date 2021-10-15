package my.home.jonline.module02.sorting;

import java.util.Arrays;

/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел a1 < a2 < ...< an и b1 < b2 < ... < bm. 
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1 < b2 < ... < bm в первую 
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 * 
 * 
 */
public class Task07 {

	public static double[] initArray(int shift, int number) {
		double[] array;

		array = new double[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + shift;
		}

		System.out.println(number + " массив:");
		System.out.println(Arrays.toString(array));
		System.out.println();

		return array;
	}

	public static void findIndexes(double[] firstArray, double[] secondArray) {
		double[] resultArray;
		int firstArrayIndex;
		int secondArrayIndex;

		firstArrayIndex = 0;
		secondArrayIndex = 0;
		resultArray = new double[firstArray.length + secondArray.length];

		for (int i = 0; i < resultArray.length; i++) {
			if (firstArrayIndex < firstArray.length & secondArrayIndex < secondArray.length) {
				if (firstArray[firstArrayIndex] <= secondArray[secondArrayIndex]) {
					resultArray[i] = firstArray[firstArrayIndex];
					firstArrayIndex++;
				} else {
					resultArray[i] = secondArray[secondArrayIndex];
					System.out.println("Позиция для вставки элемента №" + secondArrayIndex + " ("
							+ secondArray[secondArrayIndex] + ") :" + i);
					secondArrayIndex++;

				}
			} else if (firstArrayIndex < firstArray.length) {
				resultArray[i] = firstArray[firstArrayIndex];
				firstArrayIndex++;
			} else if (secondArrayIndex < secondArray.length) {
				resultArray[i] = secondArray[secondArrayIndex];
				System.out.println("Позиция для вставки элемента №" + secondArrayIndex + " ("
						+ secondArray[secondArrayIndex] + ") :" + i);
				secondArrayIndex++;

			}
		}
		System.out.println();
		System.out.println("Итоговый массив:");
		System.out.println(Arrays.toString(resultArray));

	}

	public static void main(String[] args) {
		findIndexes(initArray(0, 1), initArray(3, 2));

	}

}
