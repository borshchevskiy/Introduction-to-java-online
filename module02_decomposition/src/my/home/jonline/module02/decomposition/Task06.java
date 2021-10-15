package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 * 
 */

public class Task06 {

	public static int initVar() {

		int result;
		Random random;

		random = new Random();
		result = 1 + random.nextInt(1000);

		System.out.print(" " + result);
		return result;
	}

	public static int findGreatestCommonDivisor(int a, int b) {

		if (a == b) {
			return a;
		}

		if (a > b) {
			return euclidAlgorithm(a, b);
		}
		return euclidAlgorithm(b, a);
	}

	public static void checkRelativePrime(int gcd) {
		if (gcd == 1) {
			System.out.println();
			System.out.println("Числа являются взаимно простыми, т.к. наибольший общий делитель равен 1");
		} else {
			System.out.println();
			System.out.println("Числа не являются взаимно простыми, т.к. наибольший общий делитель равен " + gcd);
		}
	}

	public static int euclidAlgorithm(int a, int b) {
		/*
		 * a = b * q + r; gcd(a, b) = gcd(b, r); gcd(r, 0) = r;
		 * 
		 */

		int gcd;
		int r;
		int q;

		gcd = 0;
		q = 1;

		while (gcd == 0) {
			r = a - b * q;
			q++;
			if (r == 0) {
				gcd = b;
			} else if (r >= b) {
				continue;
			} else {
				gcd = euclidAlgorithm(b, r);
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		System.out.print("Заданные числа: " + 6 + " " + 8 + " " + 9);
		checkRelativePrime(findGreatestCommonDivisor(6, findGreatestCommonDivisor(8, 9)));
		System.out.println();

		System.out.print("Заданные числа: ");
		checkRelativePrime(findGreatestCommonDivisor(initVar(), findGreatestCommonDivisor(initVar(), initVar())));

	}

}
