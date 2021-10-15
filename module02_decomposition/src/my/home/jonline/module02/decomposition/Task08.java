package my.home.jonline.module02.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов 
 * массива с номерами от k до m.
 * 
 */
public class Task08 {

	public static int[] initArray() {
		int[] array;
		Random random;

		array = new int[10];
		random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}

		System.out.println("Массив:");
		System.out.println(Arrays.toString(array));
		System.out.println();

		return array;
	}

	public static int initStart() {
		int start;
		boolean isInputCorrect;
		Scanner scanner;

		start = 0;
		isInputCorrect = false;
		scanner = new Scanner(System.in);

		System.out.print("Введите значение стартового элемента: ");

		while (!isInputCorrect) {
			String str;
			if (scanner.hasNextInt()) {
				start = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "-12
											// abcd ghef"
				if (start < 0) {
					System.out.println("Значение не может быть меньше 0!");
					System.out.print("Введите положительное число >> ");
				} else {
					isInputCorrect = true; // if input is integer and positive, leave the cycle
				}
			} else {
				str = scanner.nextLine();// remove data from scanner
				System.out.println("Введено неверное значение!");
				System.out.print("Введите положительное число >> ");
			}
		}

		return start;
	}

	public static void findSumOfThreeElements() {
		int[] array;
		int start;
		int sum;
		boolean isStartOk;

		array = initArray();
		start = initStart();
		isStartOk = false;
		sum = 0;

		while (!isStartOk) {
			if (start + 2 >= array.length) {
				System.out.println("Невозможно посчитать сумму! Выход за границы массива!");
				start = initStart();
			} else {
				isStartOk = true;
			}
		}

		for (int i = start; i <= start + 2; i++) {
			sum += array[i];
		}

		System.out.println("Сумма элементов от элемента №" + start + " до элемента №" + (start + 2) + " равна: " + sum);
	}

	public static void main(String[] args) {
		findSumOfThreeElements();

	}

}
