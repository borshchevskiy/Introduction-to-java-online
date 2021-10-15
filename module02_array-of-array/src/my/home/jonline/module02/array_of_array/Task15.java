package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 * 
 */

public class Task15 {

	public static int[][] initMatrix() {
		int[][] matrix;
		int n;
		Random random;

		random = new Random();
		n = random.nextInt(6) + 2;
		matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int findMaxElement(int[][] matrix) {
		int max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	public static void replaceOddElements(int[][] matrix, int value) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = value;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();
		replaceOddElements(matrix, findMaxElement(matrix));
		System.out.println("Преобразованная матрица:");
		printMatrix(matrix);
	}

}
