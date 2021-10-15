package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task01 {

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

	public static void checkOddColumns(int[][] matrix) {

	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		printMatrix(matrix);

		for (int i = 1; i < matrix.length; i += 2) {
			if (matrix[0][i] > matrix[matrix.length - 1][i]) {
				System.out.println();
				System.out.println("В столбце " + i + " первый элемент больше последнего:");
				for (int j = 0; j < matrix.length; j++) {

					System.out.print(matrix[j][i] + " ");
				}
				System.out.println();
			}

		}

	}

}
