package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task02 {

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

	public static void printMainDiagonal(int[][] matrix) {
		System.out.println();
		System.out.println("Главная диагональ: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
	}

	public static void printSecondaryDiagonal(int[][] matrix) {
		System.out.println("Побочная диагональ: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][matrix.length - 1 - i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		printMatrix(matrix);
		printMainDiagonal(matrix);
		printSecondaryDiagonal(matrix);

	}

}
