package my.home.jonline.module02.array_of_array;

/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 1 1 ... 1 1 1
 * 2 2 2 ... 2 2 0
 * 3 3 3 ... 3 0 0
 * ...............
 * n 0 0 ... 0 0 0
 * 
 */

import java.util.Random;

public class Task05 {

	public static int[][] initMatrix() {
		int[][] matrix;
		int n;
		Random random;

		random = new Random();
		n = (1 + random.nextInt(5)) * 2;
		matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length - i; j++) {
				matrix[i][j] = i + 1;

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

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);

	}

}
