package my.home.jonline.module02.sorting;

import java.util.Arrays;


/*
 * 2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать.
 * 
 */
public class Task02 {

	public static void mergeArrays(int[] firstArray, int[] secondArray) {
		int[] resultArray;
		int temp;
		
		temp = 0;
		resultArray = new int[firstArray.length + secondArray.length];	
		
		for (int i = 0; i < firstArray.length; i++) {
			resultArray[i] = firstArray[i];
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			resultArray[firstArray.length + i] = secondArray[i];
		}
		
		
		
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray.length - 1; j++) {
				if (resultArray[j] > resultArray[j + 1]) {
					temp = resultArray[j+1];
					resultArray[j+1] = resultArray[j];
					resultArray[j] = temp;
				}
			}
		}
		System.out.println("Результирующий массив:");
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
	
	public static void main(String[] args) {

		mergeArrays(initArray(0, 1), initArray(3, 2));
	}

}
