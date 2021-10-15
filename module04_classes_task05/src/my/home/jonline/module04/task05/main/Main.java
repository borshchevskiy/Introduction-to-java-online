package my.home.jonline.module04.task05.main;

import my.home.jonline.module04.task05.entity.Counter;

/* Простейшие классы и объекты.
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и 
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */


public class Main {

	public static void main(String[] args) {
		Counter counter;

		counter = new Counter();

		System.out.println(counter);//checking constructor without parameters

		counter = new Counter(0, 20, 32);//checking constructor with currentValue > max

		System.out.println(counter);

		counter = new Counter(0, 10, -2);//checking constructor with currentValue < min
		
		System.out.println(counter);
		
		counter = new Counter(20,5);//checking constructor when min > max
		
		System.out.println(counter);

		counter.increment();
		
		System.out.println(counter);
		
		counter.decrement();
		
		System.out.println(counter);
	}

}
