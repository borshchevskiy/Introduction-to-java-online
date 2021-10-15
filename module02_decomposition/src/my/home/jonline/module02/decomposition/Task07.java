package my.home.jonline.module02.decomposition;

/*
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * 
 */

public class Task07 {

	public static int factorial(int a) {

		if (a == 0) {
			return 1;
		}

		return a * factorial(a - 1);
	}

	public static void countOddFactorialSum() {
		int sum;

		sum = 0;

		for (int i = 1; i <= 9; i += 2) {
			sum += factorial(i);
		}

		System.out.println("Сумма факторилов нечетных чисел от 1 до 9 равна: " + sum);
	}

	public static void main(String[] args) {
		countOddFactorialSum();

	}

}
