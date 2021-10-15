package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное) 
 *  1  2   3  ... n
 *  n n-1 n-2 ... 1
 *  1  2   3  ... n
 *  n n-1 n-2 ... 1
 *  ...............
 *  n n-1 n-2 ... 1
 */

public class Task04 {

	public static int[][] initMatrix() {
		int[][] matrix;
		int n;
		Random random;

		random = new Random();
		n = (1 + random.nextInt(5)) * 2;
		matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i % 2 == 0) {
					matrix[i][j] = j + 1;
				} else {
					matrix[i][j] = n - j;
				}

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
