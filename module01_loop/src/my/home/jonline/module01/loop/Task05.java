package my.home.jonline.module01.loop;

/*
* 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен 
* заданному е. Общий член ряда имеет вид:
* a[n] = 1 / (2 ^ n) + 1 / (3 ^ n)
*
 */

public class Task05 {

	public static void main(String[] args) {
		double a;
		double e;
		double result;

		e = Math.random() / 100000.0;
		result = 0;

		for (int i = 1; i <= 100; i++) {
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(a) >= e) {
				result += a;
			}
		}
		System.out.println(result);
	}

}
