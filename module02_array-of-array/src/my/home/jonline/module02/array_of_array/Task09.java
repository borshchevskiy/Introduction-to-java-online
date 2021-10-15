package my.home.jonline.module02.array_of_array;

import java.util.Random;

/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой 
 * столбец содержит максимальную сумму.
 * 
 */
public class Task09 {

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
	
	public static void sumColumnsAndFindMax(int[][] matrix) {
		int sum;
		int maxSum;
		int maxIndex;

		maxSum = 0;
		maxIndex = 0;

		for (int i = 0; i < matrix[0].length; i++) {
			sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[j][i];
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxIndex = i;
			}
		}
		System.out.println("Максимальная сумма элементов: " + maxSum + ", в столбце " + maxIndex);
	}
	
	public static void main(String[] args) {
		int[][] matrix;

		matrix = initMatrix();
		System.out.println("Матрица:");
		printMatrix(matrix);
		System.out.println();
		sumColumnsAndFindMax(matrix);

	}

}
