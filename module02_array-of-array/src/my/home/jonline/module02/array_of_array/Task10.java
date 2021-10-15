package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 * 
 */

public class Task10 {

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
				if (random.nextInt(2) == 0) {
					matrix[i][j] *= -1;
				}
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void findPositiveElementsInMainDiagonal(int[][] matrix) {
		int count;

		count = 0;
		System.out.println();
		System.out.println("Положительные элементы главной диагонали:");
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] > 0) {
				System.out.println(matrix[i][i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Нет положительных элементов.");
		}
	}

	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		findPositiveElementsInMainDiagonal(matrix);

	}

}
