package my.home.jonline.module02.array_of_array;

import java.util.Random;
import java.util.Scanner;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task03 {

	public static int[][] initMatrix() {
		int[][] matrix;
		int n;
		Random random;

		random = new Random();
		n = random.nextInt(6) + 2;
		matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int readFromInput(int maxValue) {
		int input;
		boolean isInputOK;
		Scanner scanner;

		input = 0;
		isInputOK = false;
		scanner = new Scanner(System.in);

		while (!isInputOK) {
			String str;
			if (scanner.hasNextInt()) {
				input = scanner.nextInt();// get the first token from scanner
				str = scanner.nextLine();// get other tokens from scanner if there are any. E.g. if user inputs "12
											// abcd ghef"
				if (input < 0 || input > maxValue) {
					System.out.print("Введите целое число из указанного диапазона! >> ");
				} else {
					isInputOK = true;
				}
			} else {
				str = scanner.nextLine();// remove data from scanner
				System.out.print("Введите целое число из указанного диапазона! >> ");
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int k;
		int p;
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();

		System.out.print("Введите номер стороки от 0 до " + (matrix.length - 1) + " >> ");
		k = readFromInput(matrix.length - 1);

		System.out.print("Введите номер стобца от 0 до " + (matrix[0].length - 1) + " >> ");
		p = readFromInput(matrix[0].length - 1);

		System.out.println();
		System.out.println("Строка:");
		for (int i = 0; i < matrix[k].length; i++) {
			System.out.print(matrix[k][i] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Столбец: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][p]);
		}
	}

}
