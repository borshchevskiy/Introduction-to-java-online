package my.home.jonline.module01.linear;

/*
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
 * дробную и целую части числа и вывести полученное значение числа.
 */

public class Task04 {

	public static void main(String[] args) {
		double givenNumber;
		double newNumber;

		givenNumber = -123.456;

		newNumber = (int) givenNumber / 1000.0 + (int) (givenNumber % 1 * 1000);

		System.out.println("Исходное число = " + givenNumber);
		System.out.println("Модифицированное число = " + newNumber);

	}

}
