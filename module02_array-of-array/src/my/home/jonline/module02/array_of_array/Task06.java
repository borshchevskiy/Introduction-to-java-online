package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 *  6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *  
 *  1 1 1 ... 1 1 1
 *  0 1 1 ... 1 1 0
 *  0 0 1 ... 1 0 0
 *  ...............
 *  0 1 1 ... 1 1 0
 *  1 1 1 ... 1 1 1
 *    
 */

public class Task06 {

	public static int[][] initMatrix() {
		int[][] matrix;
		int n;
		Random random;

		random = new Random();
		n = (1 + random.nextInt(5)) * 2;
		matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = (i < (matrix.length / 2) ? i : matrix.length - 1 - i); j < (i < (matrix.length / 2)
					? matrix[i].length - i
					: i + 1); j++) {
				matrix[i][j] = 1;
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
