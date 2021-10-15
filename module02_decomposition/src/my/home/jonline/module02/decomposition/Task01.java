package my.home.jonline.module02.decomposition;

import java.util.Random;

/*
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
 * натуральных чисел:
 * НОК(А,В) = А * В / НОД(А,В)
 * 
 */

public class Task01 {

	public static int initVar() {

		int result;
		Random random;

		random = new Random();
		result = 1 + random.nextInt(100);

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

	public static void findLeastCommonMultiplier(int a, int b) {
		int lcm;

		lcm = (a * b) / findGreatestCommonDivisor(a, b);

		System.out.println("Наименьшее общее кратное чисел " + a + " и " + b + ": " + lcm);
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
		findLeastCommonMultiplier(initVar(), initVar());
	}

}
